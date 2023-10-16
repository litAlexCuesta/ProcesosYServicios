package inicio_multihilo;

public class primer_hilo extends Thread{
	
	
	private int x;
	
	primer_hilo(int x){
		this.x = x;
	}
	
	public void run() {
		for (int i = 0; i < x; i++) {
			System.out.println("En el hilo: " + i);
		}
	}

	public static void main(String[] args) {
		
		primer_hilo p = new primer_hilo(10);
		p.start();

	}
	
	

}
