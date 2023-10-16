package contadorPrioridad;

public class Hilo extends Thread{
	private int c = 0;
	private boolean stopHilo = false;
	private boolean x = false;
	
	public Hilo(String nombre) {
		super(nombre);
	}
	
	public int getContador() {
		return c;
	}
	
	
	
	public void muestraValor(boolean x) {
		this.x = x;
	}
	
	public void pararHilo() {
		stopHilo = true;
	}
	
	public void run() {
		while(!stopHilo) {
			try {
				
				if(x == true) {
					System.out.println("Valor C: " + c);
				}
				
				Thread.sleep(10);
			} catch (Exception e) {
				// TODO: handle exception
			}
			c++;
		}
		System.out.println("Fuera del hilo  " + this.getName());
	}
}
