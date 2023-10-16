package compartirInf;

public class Contador {
	int c = 0;
	Contador(){}
	
	Contador(int c){
		this.c = c;
	}
	
	public synchronized void Incrementar() {
		c++;
	}
	
	public synchronized void Decrementar() {
		c--;
	}
	
	public synchronized void Valor() {
		System.out.println(c);
	}
}
