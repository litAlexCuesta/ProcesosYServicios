package MultiplesClientes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class HiloServidor extends Thread{
	BufferedReader fentrada;
	PrintWriter fsalida;
	Socket socket = null;
	
	HiloServidor(Socket s) throws IOException{
		socket = s;
		
		fsalida = new PrintWriter(socket.getOutputStream(), true);
		fentrada = new BufferedReader(new InputStreamReader(socket.getInputStream()));
	}
	
	public void run(){
		System.out.println("COMUNICO CON: " + socket.toString());
		
		String cadena = "";
		
		while(!cadena.trim().equals("*")) {
			try {
				
				cadena = fentrada.readLine();
				
				fsalida.println(cadena.trim().toUpperCase());
				
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		}
		System.out.println("FIN CON: " + socket.toString());
		fsalida.close();
		try {
			fentrada.close();
			socket.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
