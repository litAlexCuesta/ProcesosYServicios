package rebotarPelota;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class Main extends JFrame implements KeyListener{

	static int anchoCampo = 1000;
	static int altoCampo = 600;
	
	public Main() {
		addKeyListener(this);
		setFocusable(true);
		
		setSize(anchoCampo, altoCampo);
		getContentPane().setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("MultiplesBolas");
		setVisible(true);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		//System.out.println("keyPressed=" + e.getKeyCode());
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		//System.out.println("keyPressed=" + e.getKeyCode());
		
		Pelota p = new Pelota(this);
		p.start();
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		//System.out.println("keyPressed=" + e.getKeyCode());
		
	}
	
	public static void main(String[] args) {
		new Main();
	}

}
