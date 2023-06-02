package Interfaz_para_clientes;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import Vista.FPrincipal;

public class Pagar extends JDialog {

    private static final long serialVersionUID = 1L;
    private FPrincipal fPrincipal;
    private JTextField numeroTarjetaTextField;
    private JTextField caducidadTextField;
    private JTextField codigoSeguridadTextField;
    
    private JButton realizarPagoButton;

    public Pagar(FPrincipal fPrincipal) {
        this.setfPrincipal(fPrincipal);
        this.setTitle("Pagar");
        this.setSize(400, 200);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setLayout(new BorderLayout());

        JPanel pCampos = new JPanel();
        pCampos.setLayout(new GridLayout(3, 2, 10, 10));
        pCampos.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JLabel numeroTarjetaLabel = new JLabel("Número de tarjeta:");
        JLabel caducidadLabel = new JLabel("Caducidad (MM/AA):");
        JLabel codigoSeguridadLabel = new JLabel("Código de seguridad:");

        numeroTarjetaTextField = new JTextField();
        caducidadTextField = new JTextField();
        codigoSeguridadTextField = new JTextField();

        pCampos.add(numeroTarjetaLabel);
        pCampos.add(numeroTarjetaTextField);
        pCampos.add(caducidadLabel);
        pCampos.add(caducidadTextField);
        pCampos.add(codigoSeguridadLabel);
        pCampos.add(codigoSeguridadTextField);
        

        JPanel pBotones = new JPanel();
        pBotones.setLayout(new FlowLayout(FlowLayout.RIGHT));
        pBotones.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        realizarPagoButton = new JButton("Realizar Pago");
        pBotones.add(realizarPagoButton);

        this.add(pCampos, BorderLayout.CENTER);
        this.add(pBotones, BorderLayout.SOUTH);
    }

    public FPrincipal getfPrincipal() {
        return fPrincipal;
    }

    public void setfPrincipal(FPrincipal fPrincipal) {
        this.fPrincipal = fPrincipal;
    }
}
