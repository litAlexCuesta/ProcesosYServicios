package URLConnectionPHP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.*;

public class URLConnectionPHP {

	public static void main(String[] args) {
        // TODO Auto-generated method stub
        URL url = null;
        URLConnection conexion = null;
        try {
            // http://localhost/procesos/01.php
            //url = new URL("http://localhost/procesos/verNombre.php");
        	url = new URL("http://localhost/procesos/ciudad_bbdd.php");
            conexion = url.openConnection();
            conexion.setDoOutput(true);
            //String cadena = "nombre=jose&&apellidos=martinez jj&&ciudad=madrid";
            String cadena = "ciudad=Madrid";
            PrintWriter output = new PrintWriter(conexion.getOutputStream());
            output.write(cadena);
            output.close();

            BufferedReader reader = new BufferedReader(new InputStreamReader(conexion.getInputStream()));
            String linea;
            while ((linea = reader.readLine()) != null) {
                System.out.println(linea + "\n");
            }
            reader.close();

        } catch (MalformedURLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
