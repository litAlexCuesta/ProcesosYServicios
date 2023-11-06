package TCPclasePersona;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPObjetoServidor1 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		int numeroPuerto = 6000; //PUERTO
		ServerSocket servidor = new ServerSocket(numeroPuerto);
		Socket clienteConectado = null;
		System.out.println("Esperando al cliente...");
		clienteConectado = servidor.accept();
		
		// Se prepara un flujo de salida para objetos
        ObjectOutputStream outObjeto = new ObjectOutputStream( clienteConectado.getOutputStream()); 
		Persona per = new Persona("Juan", 20);        
        outObjeto.writeObject(per);
        
      // enviando objeto
        System.out.println("Envio: " + per.getNombre() +"*"+ per.getEdad()); 
        
     // Se obtiene un stream para leer objetos
        ObjectInputStream inObjeto = new ObjectInputStream( clienteConectado.getInputStream());
        Persona dato = (Persona) inObjeto.readObject();
        System.out.println("Recibo: " + dato.getNombre() + "*" + dato.getEdad()); 
        
        outObjeto.close();
        inObjeto.close();
        clienteConectado.close();   
        servidor.close(); 

	}

}
