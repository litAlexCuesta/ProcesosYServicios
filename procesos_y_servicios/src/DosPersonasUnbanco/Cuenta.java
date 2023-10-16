package DosPersonasUnbanco;

public class Cuenta {
	private int saldo;
	
	Cuenta(int saldo){
		this.saldo = saldo;
	}

	int getSaldo() {
		return saldo;
	}

	void Restar(int cantidad) {
		saldo = saldo - cantidad;
	}

	synchronized void RetirarDinero(int cant, String nom) {
		if (getSaldo() >= cant) {
			System.out.println(nom + "SALDO ACTUAL: " + getSaldo());

			try {
				Thread.sleep(500);
			} catch (Exception e) {
			}
			Restar(cant);

			System.out.println("\t " + nom + " retiro " + cant + ". Saldo actual: " + getSaldo());

		} else {
			System.out.println(nom + " no puede retirar dinero. Saldo actual: " + getSaldo());
		}
		if(getSaldo() < 0) {
			System.out.println("SALDO NEGATIVO: " + getSaldo());
		}
	}
}
