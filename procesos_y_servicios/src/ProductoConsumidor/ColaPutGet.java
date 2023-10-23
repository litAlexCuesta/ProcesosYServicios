package ProductoConsumidor;

public class ColaPutGet {
	int numero;
	boolean disponible;
	
	int get() {
			this.disponible = false;
			return numero;
	}
	
	void put(int valor){
			numero = valor;
			this.disponible = true;
	}
	
	public boolean hayDato() {
		return disponible;
	}
	
	
}
