package conInterfaz;

public class primerHiloR implements Runnable{

	@Override
	public void run() {
		System.out.println("Hola desde el hilo: " + Thread.currentThread().getId());
		
	}

}
