package compartirInf;

public class CompartirInf1 {

	public static void main(String[] args) {
		Contador cont = new Contador(100);
		
		HiloA a = new HiloA("Hilo A", cont);
		HiloB b = new HiloB("Hilo B", cont);
		
		a.start();
		b.start();
		
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		a.interrupt();
		b.interrupt();

	}

}
