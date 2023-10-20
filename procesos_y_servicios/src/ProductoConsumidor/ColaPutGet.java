package ProductoConsumidor;

public class ColaPutGet {
	int numero;
	boolean disponible = false;
	
	int get() {
		if(this.disponible) {
			this.disponible = false;
			return numero;
		}
		
		return -1;
	}
	
	void put(int valor){
		if(!this.disponible) {
			numero = valor;
			this.disponible = true;
		}
	}
	
	
}
