package ProductoConsumidor;

public class Productor extends Thread{
	ColaPutGet cola;
	
	Productor(ColaPutGet cola){
		this.cola = cola;
	}
	
	public void run() {
		for (int i = 0; i < 10; i++) {
			while(cola.hayDato()) {
				try {
					sleep(300);
				} catch (Exception e) {
					// TODO: handle exception
				}
					cola.put(i);
					System.out.println(i);
			}
			
			
		}
	}
}
