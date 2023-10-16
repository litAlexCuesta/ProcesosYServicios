package BloqueHilos;

public class BloqueHilosInicial {

	public static void main(String[] args) {
		OC1 cont = new OC1();
		
		HiloCadena1 a = new HiloCadena1(cont, "A");
		HiloCadena2 b = new HiloCadena2(cont, "B");
		
		a.start();
		b.start();

	}

}
