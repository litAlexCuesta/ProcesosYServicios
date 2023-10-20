package HilosABC;

public class Main {
	
	static HiloCadena a;
	static HiloCadena b;
	static HiloCadena c;

	public static void main(String[] args) {
		
		a = new HiloCadena("Hilo A");
		b = new HiloCadena("Hilo B");
		c = new HiloCadena("Hilo C");
		
		a.setHiloAnterior(b);
		b.setHiloAnterior(c);
		c.setHiloAnterior(a);
		
		a.start();
		b.start();
		c.start();
		

	}

}
