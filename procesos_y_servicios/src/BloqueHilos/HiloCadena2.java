package BloqueHilos;

public class HiloCadena2 extends Thread{
	private OC1 obj;
	String cad;
	
	HiloCadena2(OC1 c, String s){
		this.obj = c;
		this.cad = s;
	}
	
	public void run(){
		synchronized(obj) {
			for (int i = 0; i < 10; i++) {
				try {
					Thread.sleep(100);
				} catch (Exception e) {
					// TODO: handle exception
				}
				
				obj.PintaCadena(cad);
				
				obj.notify();
				
				try {
					obj.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			obj.notify();
		}
		
	}
}
