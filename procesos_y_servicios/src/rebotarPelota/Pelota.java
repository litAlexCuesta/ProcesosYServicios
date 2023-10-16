package rebotarPelota;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JFrame;

public class Pelota extends Thread{
	
	int x; int y;
	int diametro = 20;
	Color c;
	int incX = 1; int incY = 1;
	int longCampoX; int longCampoY;
	JFrame campo;
	
	public Pelota(JFrame campo) {
		this.campo = campo;
		longCampoX = campo.getSize().width;
		longCampoY = campo.getSize().height;
		Random r = new Random();
		x = r.nextInt(longCampoX);
		y = r.nextInt(longCampoY);
		diametro = r.nextInt(100);
		c = GenerarColor();
	}
	
	
	
	public Color GenerarColor() {
		Random r = new Random();
		int red = r.nextInt(256);
		int blue = r.nextInt(256);
		int green = r.nextInt(256);
		
		Color rColor = new Color(red, green, blue);
		return rColor;
	}



	public void run() {
		Graphics g = campo.getGraphics();
		while(true) {
			g.setColor(Color.WHITE);
			g.fillOval(x, y, diametro, diametro);
			
			x = x + incX;
			y = y + incY;
			
			if(x<=(0 + diametro) || x >=(longCampoX-diametro)) incX = -incX;
			if(y<=(0 + diametro) || y >=(longCampoY-diametro)) incY = -incY;
			
			g.setColor(c);
			g.fillOval(x, y, diametro, diametro);
			
			try {
				Thread.sleep(7);
			} catch (InterruptedException e) {
				
			}
			
		}
	}
}


