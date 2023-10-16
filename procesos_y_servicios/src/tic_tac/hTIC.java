package tic_tac;

public class hTIC implements Runnable{

	@Override
	public void run() {
		while(true) {
			System.out.println("TIC ");
			try {
				Thread.sleep(1500);
			} catch (Exception e) {
			}
		}
		
	}
	
}
