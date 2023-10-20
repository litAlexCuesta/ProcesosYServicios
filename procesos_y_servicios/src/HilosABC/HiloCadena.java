package HilosABC;

public class HiloCadena extends Thread{
	private String s;
	HiloCadena h;
	
	HiloCadena(String s){
		this.s = s;
	}
	
	void setHiloAnterior(HiloCadena h){
		this.h = h;
		
	}
	
	public void run(){
		for (int i = 0; i < 10; i++) {
			try {
				System.out.println(i + " " + s);
				sleep(300);
				synchronized (h) {
					h.notify();
				}
				synchronized(this) {
					if(i<9) this.wait();
				}
				
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		System.out.println(s + " finalizado");
		
	}
}
