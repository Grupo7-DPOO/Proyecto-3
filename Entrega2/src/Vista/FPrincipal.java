package Vista;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;


@SuppressWarnings("serial")
public class FPrincipal extends JFrame{

	private PArea pArea;
	private PBotones pBotones;

	public PArea getpArea() {
		return pArea;
	}

	public PBotones getpBotones() {
		return pBotones;
	}

	public FPrincipal() {
		this.setTitle("Property Managment System");
		this.setSize(1920,1080);
		getContentPane().setBackground(Color.decode("#CCDAD1"));
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());
		
		this.pArea = new PArea();
		this.pBotones = new PBotones(this);
		
		this.add(this.pBotones, BorderLayout.WEST);
		
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new FPrincipal();
	}
	
}
