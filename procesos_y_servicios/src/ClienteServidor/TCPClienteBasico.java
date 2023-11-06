package ClienteServidor;

import java.io.IOException;
import java.net.*;

public class TCPClienteBasico {

    public static void main(String[] args) {
        String host = "localhost";
        int puerto = 6000;

        try {
            Socket cliente = new Socket(host, puerto);

            InetAddress i = cliente.getInetAddress();

            System.out.println("\t Puerto local " + cliente.getLocalPort());
            System.out.println("\t Puerto Remoto: " + cliente.getPort());
            System.out.println("\t Nombre Host/IP " + cliente.getInetAddress());
            System.out.println("\t Host Remoto " + i.getHostName().toString());
            System.out.println("\t IP Host Remoto " + i.getHostAddress().toString());

            cliente.close();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

