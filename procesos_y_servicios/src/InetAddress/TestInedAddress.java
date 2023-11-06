package InetAddress;

import java.net.*;

public class TestInedAddress {

	public static void main(String[] args) {
		InetAddress dir = null;
		String google = "www.carrefour.es";
		try {
			System.out.println("========================================================================");
			System.out.println("Salida para una url: " + google);
			dir = InetAddress.getByName(google);
			pruebaMetodos(dir);
		} catch (Exception e) {
			// TODO: handle exception
		}

	}
	
	static void pruebaMetodos(InetAddress dir) {
		System.out.println("\t Metodo getByName(): " + dir);
		
		System.out.println("\t Metodo getHostName(): " + dir.getHostName());
		System.out.println("\t Metodo getHostAddress(): " + dir.getHostAddress());
		System.out.println("\t Metodo toString(): " + dir.toString());
		System.out.println("\t Metodo getCanonicalHostName(): " + dir.getCanonicalHostName());
		
		try {
			System.out.println("\t DIRECCIONES IP PARA: " + dir.getHostName());
			InetAddress[] direcciones = InetAddress.getAllByName(dir.getHostName());
			for (int i = 0; i < direcciones.length; i++) {
				System.out.println("\t\t" + direcciones[i].toString());
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
