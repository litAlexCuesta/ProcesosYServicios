package inicio_interfaz;

public class usar_hilo {

	public static void main(String[] args) {
		
		hilo_simple hs = new hilo_simple();
		Thread t = new Thread(hs);
		
		t.start();
		
		for (int i = 0; i < 5; i++) {
			System.out.println("FUERA DEL HILO");
		}

	}

}
