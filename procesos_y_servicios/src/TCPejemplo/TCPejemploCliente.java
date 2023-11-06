package TCPejemplo;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPejemploCliente {

	public static void main(String[] args) throws UnknownHostException, IOException {
		String Host = "localhost";
		int Puerto = 6000;
		
		System.out.println("PROGRAMA CLIENTE INICIADO...");
		Socket Cliente = new Socket(Host, Puerto);
		
		//CREO FLUJO DE SALIDO AL SERVIDOR
		DataOutputStream flujoSalida = new DataOutputStream(Cliente.getOutputStream());
		
		//ENVIO UN SALUDO AL SERVIDOR
		flujoSalida.writeUTF("Saludos al servidor desde el cliente");
		
		//CREO FLUJO DE ENTRADA AL SERVIDOR
		DataInputStream flujoEntrada = new DataInputStream(Cliente.getInputStream());
		
		//EL SERVIDOR ME ENVIA UN MENSAJE
		System.out.println("Recibiendo del servidor: \n\t" + flujoEntrada.readUTF());
		
		//CERRAR STREAMS Y SOCKETS
		flujoEntrada.close();
		flujoSalida.close();
		Cliente.close();
		
		

	}

}
