package ContadorParaResto;

public class OC2 {
	private boolean vf;
	
	public OC2(boolean vf) {
		super();
		this.vf = vf;
	}

	OC2(){}
	
	void Terminado(boolean vf) {
		this.vf = vf;
	}
	
	boolean Verificar() {
		return this.vf;
	}

}
