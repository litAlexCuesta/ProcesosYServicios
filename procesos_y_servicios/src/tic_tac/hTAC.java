package tic_tac;

public class hTAC implements Runnable{

	@Override
	public void run() {
		while(true) {
			System.out.println("TAC ");
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
			}
		}
		
	}

}
