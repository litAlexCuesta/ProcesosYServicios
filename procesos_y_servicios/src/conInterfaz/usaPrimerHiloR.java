package conInterfaz;

public class usaPrimerHiloR {

	public static void main(String[] args) {
		primerHiloR h1 = new primerHiloR();
		Thread h = new Thread(h1);
		h.start();

	}

}
