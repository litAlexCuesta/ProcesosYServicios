package ProductoConsumidor;

public class Consumidor extends Thread{
	ColaPutGet cola;
	int valor = 0;
	
	Consumidor(ColaPutGet cola){
		this.cola = cola;
	}
	
	public void run() {
		for (int i = 0; i < 10; i++) {
			while(!cola.hayDato()) {
				try {
					sleep(300);
				} catch (Exception e) {
					// TODO: handle exception
				}
					valor = cola.get();
					System.out.println(valor);
					
			}
			
			
		}
	}
}
