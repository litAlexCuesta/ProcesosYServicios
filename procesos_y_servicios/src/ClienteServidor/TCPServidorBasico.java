package ClienteServidor;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServidorBasico {
	public void main(String[] args) throws IOException {
		
		int Puerto = 6000;
		
		ServerSocket Servidor = new ServerSocket(Puerto);
		
		System.out.println("Escuchando en " + Servidor.getLocalPort());
		
		Socket cliente1 = Servidor.accept(); //esperando a cliente 1
		
		Socket cliente2 = Servidor.accept(); //esperando a cliente 2
		
		Servidor.close();
		
		
	} 
}
