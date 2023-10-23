package ProductoConsumidor;

public class Main {

	public static void main(String[] args) {
		ColaPutGet cola = new ColaPutGet();
		
		Productor p = new Productor(cola);
		Consumidor c = new Consumidor(cola);
		
		c.start();
		p.start();
		

	}

}
