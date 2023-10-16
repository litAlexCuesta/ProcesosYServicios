package metodos_thread;

public class hiloEjemplo2 extends Thread{
	public void run() {
		System.out.println(
				"Dentro del Hilo " + Thread.currentThread().getName() + 
				"\n \t Prioridad " + Thread.currentThread().getPriority() + 
				"\n \t ID " + Thread.currentThread().getId() + 
				"\n \t Hilos activos " + Thread.currentThread().activeCount()
				);
	}
}
