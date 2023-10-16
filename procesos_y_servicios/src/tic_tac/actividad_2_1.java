package tic_tac;

public class actividad_2_1 {

	public static void main(String[] args) {
		hTIC hilo1 = new hTIC();
		Thread h1 = new Thread(hilo1);
		h1.start();
		
		hTAC hilo2 = new hTAC();
		Thread h2 = new Thread(hilo2);
		h2.start();
	}

}
