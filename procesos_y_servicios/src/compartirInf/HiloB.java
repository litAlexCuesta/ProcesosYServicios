package compartirInf;

public class HiloB extends Thread{
	private Contador c = new Contador();
	String n = "";
	
	HiloB(String n, Contador c){
		this.n = n;
		this.c = c;
	}
	
	public void run() {
		for (int i = 0; i < 300; i++) {
			c.Decrementar();
			try {
				Thread.sleep(10);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		System.out.println();
		System.out.print("Valor " + n + " = ");
		c.Valor();
	}
}
