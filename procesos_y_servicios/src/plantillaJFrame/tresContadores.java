package plantillaJFrame;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class tresContadores extends JFrame implements KeyListener {
	JPanel panel;
    
	static JLabel tiempo;
	static JLabel texto;
    private JScrollPane scrollpane1;
	static JTextArea textarea1;		
	
	public tresContadores() {
		addKeyListener(this); //Solo si queremos el teclado

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
        tiempo = new JLabel( "00:00:00" );
        add(tiempo);		
        tiempo.setFont(new Font("Serif", Font.BOLD, 30));
        tiempo.setBounds(200, 0, tiempo.getPreferredSize().width, tiempo.getPreferredSize().height);
        
        texto = new JLabel( "Texto ejemplo" );
        add(texto);	        
        texto.setFont(new Font("SansSerif", Font.PLAIN, 15));
        texto.setBounds(10, 10, texto.getPreferredSize().width, texto.getPreferredSize().height);
		
		textarea1 = new JTextArea();
		scrollpane1 = new JScrollPane(textarea1);
		scrollpane1.setBounds(30, 300, 400, 200);
		//textarea1.setEditable(false);
		add(scrollpane1);
				
		//setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		
        add(panel);
        setSize(500, 600);
		setVisible(true);

		//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		
	}
	
	//----------------------------------------------------------------------------
	// KeyListener
	//----------------------------------------------------------------------------
	public void keyTyped(KeyEvent e) {
		//System.out.println("keyPressed="+e.getKeyCode());
	}
	public void keyPressed(KeyEvent e) {
		//System.out.println("keyPressed="+e.getKeyCode());
		textarea1.append("Tecla pulsada: " + e.getKeyCode() + "\n");
		if (e.getKeyCode() == KeyEvent.VK_0) {
			textarea1.append("Has pulsado el 0\n");
		}
		if (e.getKeyCode() == KeyEvent.VK_A) {
			textarea1.append("Has pulsado la A\n");
		}
	}
	public void keyReleased(KeyEvent e) {
		//System.out.println("keyPressed="+e.getKeyCode());
	}	
	//----------------------------------------------------------------------------
	
	
	public static void main(String args[]) {
		new PlantillaJFrame();
		
		while (true) {
		}	
	}//main
}//class
