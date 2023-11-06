package EjemploURL;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class CodigoHTML {
	
	//CON ESTO LEO TODO EL CODIGO HTML DE LA PAGINA PASADA

	public static void main(String[] args) throws MalformedURLException {
		URL url = null;
		
		url = new URL("https://www.google.com/");
		
		BufferedReader in;
		
		try {
			InputStream inputStream = url.openStream();
			in = new BufferedReader(new InputStreamReader(inputStream));
			
			String inputLine;
			while((inputLine = in.readLine()) != null) {
				System.out.println(inputLine + "\n");
			}
			in.close();
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
