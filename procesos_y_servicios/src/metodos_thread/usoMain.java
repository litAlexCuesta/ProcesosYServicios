package metodos_thread;

public class usoMain {

	public static void main(String[] args) {
		Thread.currentThread().setName("Principal");
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().toString());
		
		hiloEjemplo2 h1 = new hiloEjemplo2();
		hiloEjemplo2 h2 = new hiloEjemplo2();
		hiloEjemplo2 h3 = new hiloEjemplo2();
		
		h1.setName("HILO1");
		h2.setName("HILO2");
		h3.setName("HILO3");
		
		h1.setPriority(1);
		h2.setPriority(2);
		h3.setPriority(3);
		
		h1.start();
		h2.start();
		h3.start();
		
		System.out.println("Informacion del " + h1.getName() + ": " + h1.toString());
		System.out.println("Informacion del " + h2.getName() + ": " + h2.toString());
		System.out.println("Informacion del " + h3.getName() + ": " + h3.toString());
		
		System.out.println("5 Hilos creados");
		System.out.println("Hilos activos: " + Thread.activeCount());
		
	}

}
