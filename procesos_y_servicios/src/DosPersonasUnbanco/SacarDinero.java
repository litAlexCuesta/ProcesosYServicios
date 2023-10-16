package DosPersonasUnbanco;

public class SacarDinero extends Thread{
	private Cuenta c;
	
	public SacarDinero(String n, Cuenta c) {
		super(n);
		this.c = c;
	}
	
	public void run() {
		for (int i = 0; i <= 4; i++) {
			c.RetirarDinero(10, getName());
		}
	}
	
	
}
