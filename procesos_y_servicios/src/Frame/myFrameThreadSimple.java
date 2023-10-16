package Frame;

import javax.swing.JFrame;

public class myFrameThreadSimple extends JFrame implements Runnable{
	
	@Override
	public void run() {
		System.out.println("EN EL RUN...");
		
	}

	public static void main(String[] args){
		Thread myThread = new Thread(new myFrameThreadSimple());
		System.out.println("Arranca Hilo ");
		myThread.start();
		
		try {
			myThread.join(); //SIRVE PARA ESPERAR A QUE TERMINE LA TAREA DEL HILO QUE ESTA PUESTO, LUEGO CONTINUA EL MAIN
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("FIN DEL MAIN");

	}

}
