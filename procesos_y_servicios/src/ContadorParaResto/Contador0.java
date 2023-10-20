package ContadorParaResto;

import javax.swing.JLabel;

public class Contador0 extends Thread {
	JLabel cont0;
	int pause;
	private OC2 obj;

	public Contador0(OC2 c, JLabel _cont0, int _pause) {
		cont0 = _cont0;
		pause = _pause;
		this.obj = c;
	}

	public void run() {
		int cont = 0;
		int num = (int) (Math.random() * 200);

		while (true) {
			cont0.setText("" + cont);
			if(cont == 500) {
				obj.Terminado(false);
				break;
			}
			cont++;
			try {
				Thread.sleep(num);
			} catch (Exception e) {
			}
		}

	}
}
