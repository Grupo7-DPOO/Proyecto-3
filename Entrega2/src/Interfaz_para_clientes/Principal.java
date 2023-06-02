package Interfaz_para_clientes;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Principal extends JFrame {

    private Area pArea;
    private Botones pBotones;

    public Area getpArea() {
        return pArea;
    }

    public Botones getpBotones() {
        return pBotones;
    }

    public Principal() {
        this.setTitle("Property Management System for clients");
        this.setSize(1920, 1080);
        getContentPane().setBackground(Color.decode("#CCDAD1"));
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());

        this.pArea = new Area();
        this.pBotones = new Botones(this);

        this.add(this.pBotones, BorderLayout.WEST);

        this.setVisible(true);
    }

    public static void main(String[] args) {
        new Principal();
    }

}
