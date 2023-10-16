package tresContadores;

import javax.swing.JLabel;

public class Contador0 extends Thread {
	JLabel cont0;
	int pause;

	public Contador0(JLabel _cont0, int _pause) {
		cont0 = _cont0;
		pause = _pause;
	}

	public void run() {
		int cont = 0;

		while (true) {
			cont0.setText("" + cont);
			cont++;
			try {
				Thread.sleep(pause);
			} catch (Exception e) {
			}
		}

	}
}
