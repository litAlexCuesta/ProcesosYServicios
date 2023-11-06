package MultiplesClientes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Cliente {

	public static void main(String[] args) throws UnknownHostException, IOException {
		BufferedReader fentrada;
		PrintWriter fsalida;
		String Host = "localhost";
		int Puerto = 6000;
		Socket Cliente = new Socket(Host, Puerto);
		
		//CREO FLUJO ENTRADA SALIDA AL SERVIDOR
		fsalida = new PrintWriter(Cliente.getOutputStream(), true);
		fentrada = new BufferedReader(new InputStreamReader(Cliente.getInputStream()));
		
		//FLUJO PARA ENTRADA ESTANDAR
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String cadena;
		String eco = "";
		
		do {
			System.out.println("Introduce cadena: ");
			cadena = in.readLine();
			
			fsalida.println(cadena);
			
			eco = fentrada.readLine();
			System.out.println(" => Recibido: " + eco);
		} while (!cadena.trim().equals("*"));
		
		fsalida.close();
		fentrada.close();
		System.out.println("Fin del envio...");
		in.close();

	}

}
