package urlconnection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class urlconnection {

	public static void main(String[] args) throws IOException{
		URL url = null;
		URLConnection urlCon = null;
		
		url = new URL("https://www.google.com/");
		urlCon = url.openConnection();
		
		BufferedReader in;
		InputStream inputStream = urlCon.getInputStream();
		in = new BufferedReader(new InputStreamReader(inputStream));
		
		String inputLine;
		while((inputLine = in.readLine()) != null) {
			System.out.println(inputLine + "\n");
		}
		in.close();

	}

}
