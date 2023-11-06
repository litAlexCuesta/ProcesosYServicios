package EjemploURL;

import java.net.URL;

public class EjemploURL {

	public static void main(String[] args) {
		URL url;

		try {
			System.out.println("Constructor simple para una url:");
			url = new URL("https://classroom.google.com/c/NjI3MTYzNzE3MTA0");
			Visualizar(url);
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	static void Visualizar(URL url) {
		System.out.println("URL completa: " + url.toString());
		System.out.println("getProtocol(): " + url.getProtocol());
		System.out.println("getHost(): " + url.getHost());
		System.out.println("getPort(): " + url.getPort());
		System.out.println("getFile(): " + url.getFile());
		System.out.println("getUserInfo(): " + url.getUserInfo());
		System.out.println("getPath(): " + url.getPath());
		System.out.println("getAuthority(): " + url.getAuthority());
		System.out.println("getQuery(): " + url.getQuery());
		System.out.println("getDefaultPort(): " + url.getDefaultPort());
	}

}
