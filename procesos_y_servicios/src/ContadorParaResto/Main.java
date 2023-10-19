package ContadorParaResto;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import BloqueHilos.OC1;
import rebotarPelota.Pelota;

public class Main extends JFrame implements KeyListener{
	
	OC2 cont = new OC2();
	
	JPanel panel;
    
	static JLabel tiempo;
	static JLabel cont0;
	static JLabel cont1;
	static JLabel cont2;
	static JLabel cont3;
	static JTextArea textarea1;		
	
	public Main() {
		addKeyListener(this);
		setFocusable(true);
		
		//PANEL
		//--------------------------------
		setLayout(null);
		panel = new JPanel();
		getContentPane();
		setFocusable(true);
		panel.setLayout(null);
		
		getContentPane().setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Ejemplo App con JFrame");
		
		//----------------------------------------------------------
        tiempo = new JLabel( "00:00:00" ); //POSICION RELOJ
        add(tiempo);		
        tiempo.setFont(new Font("Serif", Font.BOLD, 30));
        tiempo.setBounds(200, 0, tiempo.getPreferredSize().width, tiempo.getPreferredSize().height);
        
        
        cont0 = new JLabel( "0" ); //ETIQUETA CONTADOR 0
        add(cont0);	        
        cont0.setFont(new Font("SansSerif", Font.PLAIN, 15));
        cont0.setBounds(100, 50, 100, 80);
        
        cont1 = new JLabel( "0" ); //ETIQUETA CONTADOR 1
        add(cont1);	        
        cont1.setFont(new Font("SansSerif", Font.PLAIN, 15));
        cont1.setBounds(100, 100, 100, 80);
        
        cont2 = new JLabel( "0" ); //ETIQUETA CONTADOR 2
        add(cont2);	        
        cont2.setFont(new Font("SansSerif", Font.PLAIN, 15));
        cont2.setBounds(100, 150, 100, 80);
        
        cont3 = new JLabel( "0" ); //ETIQUETA CONTADOR 3
        add(cont3);	        
        cont3.setFont(new Font("SansSerif", Font.PLAIN, 15));
        cont3.setBounds(100, 200, 100, 80);
		
				
		//setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		
        add(panel);
        setSize(500, 600);
		setVisible(true);

		//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		
		
		
	}
	
	
	public static void main(String args[]) {
		new Main();
		
		
		
		
		
		
		
		
		
		
		while (true) {
		}	
	}//main
	@Override
	public void keyPressed(KeyEvent e) {
		//System.out.println("keyPressed="+e.getKeyCode());
		if (e.getKeyCode() == KeyEvent.VK_1) {
			Reloj reloj = new Reloj(tiempo);
			reloj.start(); //TIEMPO CON LA HORA ACTIVA
		}
		if (e.getKeyCode() == KeyEvent.VK_2) {
			Contador0 contador0 = new Contador0(cont, cont0, 1000);
			contador0.start(); //CONTADOR DE 1 SEG ENTRE INTERVALO
		}
		if (e.getKeyCode() == KeyEvent.VK_3) {
			Contador0 contador1 = new Contador0(cont, cont1, 500);
			contador1.start(); //CONTADOR DE 0.5 SEG ENTRE INTERVALO
		}
		if (e.getKeyCode() == KeyEvent.VK_4) {
			Contador0 contador2 = new Contador0(cont, cont2, 100);
			contador2.start(); //CONTADOR DE 0.1 SEG ENTRE INTERVALO
		}
		if (e.getKeyCode() == KeyEvent.VK_5) {
			Contador3 contador3 = new Contador3(cont, cont3);
			contador3.start(); //CUENTA ATRAS DE 200 , 1 SEG ENTRE INTERVALO
		}
		
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
}//class 
