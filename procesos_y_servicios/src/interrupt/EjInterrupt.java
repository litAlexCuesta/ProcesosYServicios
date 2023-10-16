package interrupt;

public class EjInterrupt extends Thread{
	
	public void run() {
		try {
			while(true) {
				System.out.println("En el hilo");
				Thread.sleep(100);
			}
		} catch (InterruptedException e) {
			System.out.println("HA OCURRIDO UNA EXCEPCION");
		}
		
		System.out.println("FIN DEL HILO");
	}

	public static void main(String[] args) {
		EjInterrupt h = new EjInterrupt();
		h.start();
		try {
			h.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		h.interrupt();
	}

}
