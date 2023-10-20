package ContadorParaResto;

import javax.swing.JLabel;

public class Contador3 extends Thread{
	JLabel cont3;
	private OC2 obj;

public Contador3(OC2 c, JLabel _cont3) {
	cont3 = _cont3;
	this.obj = c;
}

public void run() {
	int cont = 500;
	int num = (int) (Math.random() * 200);
	
	while(true) {
		cont3.setText("" + cont);
		if(cont == 0) {
			obj.Terminado(false);
			break;
		}
		cont --;
		try {
			Thread.sleep(num);
		} catch (Exception e) {
		}
	}
	
}
}
