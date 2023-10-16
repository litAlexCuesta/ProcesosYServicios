package tresContadores;

import javax.swing.JLabel;

	public class Contador3 extends Thread{
		JLabel cont3;
	
	public Contador3(JLabel _cont3) {
		cont3 = _cont3;
	}

	public void run() {
		int cont = 200;
		
		while(true) {
			cont3.setText("" + cont);
			if(cont == 0) {
				break;
			}
			cont --;
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}
		}
		
	}
}
