package Frame;

import java.awt.BorderLayout;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class relojFrame extends JFrame implements Runnable{
	
	JLabel tiempo;
	Thread hilo;
	
	public relojFrame() {
		setTitle("RELOJ");
		setSize(200,100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		tiempo = new JLabel("00:00:00");
		tiempo.setHorizontalAlignment(JLabel.CENTER);
		add(tiempo, BorderLayout.CENTER);
		
		setVisible(true);
		
		hilo = new Thread(this);
		hilo.start();
	}
	
	@Override
	public void run() {
		
		try {
			while(true) {
				SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
				Calendar cal = Calendar.getInstance();
				String horaActual = sdf.format(cal.getTime());
				
				tiempo.setText(horaActual);
				
				Thread.sleep(4);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		tiempo.setText("00:00:00");
	}

	public static void main(String[] args) {
		new relojFrame();

	}

	

}
