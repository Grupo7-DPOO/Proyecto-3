package Interfaz_para_clientes;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Botones extends JPanel {
    private Principal fPrincipal;
    private JButton bReservas;
    private JButton bPagar;
    private JButton bUsuario;

    public Botones(Principal fPrincipal) {
        this.fPrincipal = fPrincipal;
        this.setLayout(new GridLayout(3, 1, 20, 20));
        this.setBackground(Color.decode("#CCDAD1"));
        Font font = new Font("Tahoma", Font.BOLD, 30);

        this.bReservas = new JButton("Reservas");
        bReservas.setPreferredSize(new Dimension(300, 2));
        bReservas.setFont(font);
        bReservas.setBackground(Color.decode("#9CAEA9"));
        this.bPagar = new JButton("Pagar");
        bPagar.setFont(font);
        bPagar.setBackground(Color.decode("#9CAEA9"));
        this.bUsuario = new JButton("Usuario");
        bUsuario.setFont(font);
        bUsuario.setBackground(Color.decode("#9CAEA9"));

        bReservas.addActionListener(e -> {
            // Acción al hacer clic en Reservas
        });

        bPagar.addActionListener(e -> {
            // Acción al hacer clic en Pagar
        });

        bUsuario.addActionListener(e -> {
            // Acción al hacer clic en Usuario
        });

        this.add(this.bReservas);
        this.add(this.bPagar);
        this.add(this.bUsuario);
    }

}
