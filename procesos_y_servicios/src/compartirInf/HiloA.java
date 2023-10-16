package compartirInf;

public class HiloA extends Thread{
	private Contador c = new Contador();
	String n = "";
	
	HiloA(String n, Contador c){
		this.n = n;
		this.c = c;
	}
	
	public void run() {
		for (int i = 0; i < 300; i++) {
			c.Incrementar();
			try {
				Thread.sleep(10);
			} catch (Exception e) {
				
			}
		}
		System.out.println();
		System.out.print("Valor " + n + " = ");
		c.Valor();
	}
}
