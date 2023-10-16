package inicio_interfaz;

public class hilo_simple implements Runnable{

	@Override
	public void run() {
		
		for (int i = 0; i < 5; i++) {
			System.out.println("DENTRO DEL HILO");
		}
		
	}
	
}
