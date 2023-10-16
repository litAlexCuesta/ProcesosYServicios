package tres_hilos;

public class hilo_ejemplo_1 extends Thread{
	private int x;
	
	public hilo_ejemplo_1(String nombre) {
		super(nombre);
		System.out.println("Creando hilo... " + getName());
	}
	
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("En el hilo: " + getName() + " C=" + i);
		}
	}
	
	

	public static void main(String[] args) {
		hilo_ejemplo_1 h1 = new hilo_ejemplo_1("Hilo 1");
		hilo_ejemplo_1 h2 = new hilo_ejemplo_1("Hilo 2");
		hilo_ejemplo_1 h3 = new hilo_ejemplo_1("Hilo 3");
		hilo_ejemplo_1 h4 = new hilo_ejemplo_1("Hilo 4");
		hilo_ejemplo_1 h5 = new hilo_ejemplo_1("Hilo 5");
		
		h1.start();
		h2.start();
		h3.start();
		h4.start();
		h5.start();
		
		System.out.println("> 3 Hilos Iniciados");

	}

}
