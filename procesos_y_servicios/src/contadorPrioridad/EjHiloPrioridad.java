package contadorPrioridad;

public class EjHiloPrioridad {

	public static void main(String[] args) {
		Hilo h1 = new Hilo("Hilo 1");
		Hilo h2 = new Hilo("Hilo 2");
		Hilo h3 = new Hilo("Hilo 3");
		
		h1.setPriority(Thread.MIN_PRIORITY);
		h2.setPriority(Thread.MAX_PRIORITY);
		h3.setPriority(Thread.NORM_PRIORITY);
		
		h1.start();
		h2.start();
		h3.start();
		
		h1.muestraValor(false);
		h2.muestraValor(true);
		h3.muestraValor(false);

		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		h1.pararHilo();
		h2.pararHilo();
		h3.pararHilo();
		
		System.out.println("H2 prioridad max " + h2.getContador());
		System.out.println("H3 prioridad normal " + h3.getContador());
		System.out.println("H1 prioridad minima " + h1.getContador());
	}

}
