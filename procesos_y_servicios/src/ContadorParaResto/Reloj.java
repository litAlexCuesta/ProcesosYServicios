package ContadorParaResto;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JLabel;

public class Reloj extends Thread{
	JLabel tiempo;
	
	public Reloj(JLabel _tiempo) {
		tiempo = _tiempo;
	}
	
	public void run() {
		
		try {
			while(true) {
				SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
				Calendar cal = Calendar.getInstance();
				String horaActual = sdf.format(cal.getTime());
				
				tiempo.setText(horaActual);
				
				Thread.sleep(100);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		tiempo.setText("00:00:00");
	}
}