import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PTarjeta extends JDialog {

	private static final long serialVersionUID = 1L;
	private FPrincipal fPrincipal;
    private JTextField tValor;
	private JTextField tComercio;
	private JTextField tNFactura;
	private JTextField tFecha;
	private JTextField tNTarjeta;
	private JTextField tCaducidad;
	private JTextField tCodigoSeguridad;
    private JButton bPagar;

    public PTarjeta(FPrincipal fPrincipal) {
        this.setfPrincipal(fPrincipal);
        this.setTitle("Pago Tarjeta");
        this.setSize(400, 300);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setLayout(new BorderLayout());

        JPanel pCampos = new JPanel();
        pCampos.setLayout(new GridLayout(4, 4, 10, 10));
        pCampos.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JLabel lValor = new JLabel("Valor:");
        JLabel lComercio = new JLabel("Comercio:");
        JLabel lNFactura = new JLabel("Numero Factura:");
        JLabel lFecha = new JLabel("Fecha:");
        JLabel lNTarjeta = new JLabel("Numero Tarjeta:");
        JLabel lCaducidad = new JLabel("Fecha Caducidad:");
        JLabel lCodigoSeguridad = new JLabel("Codigo de Seguridad:");

        tValor = new JTextField();
        tComercio = new JTextField();
        tNFactura = new JTextField();
        tFecha = new JTextField();
        tNTarjeta = new JTextField();
        tCaducidad = new JTextField();
        tCodigoSeguridad = new JTextField();

        pCampos.add(lValor);
        pCampos.add(tValor);
        pCampos.add(lComercio);
        pCampos.add(tComercio);
        pCampos.add(lNFactura);
        pCampos.add(tNFactura);
        pCampos.add(lFecha);
        pCampos.add(tFecha);
        pCampos.add(lNTarjeta);
        pCampos.add(tNTarjeta);
        pCampos.add(lCaducidad);
        pCampos.add(tCaducidad);
        pCampos.add(lCodigoSeguridad);
        pCampos.add(tCodigoSeguridad);

        JPanel pBotones = new JPanel();
        pBotones.setLayout(new FlowLayout(FlowLayout.RIGHT));
        pBotones.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        bPagar = new JButton("Pagar");
        pBotones.add(bPagar);

        this.add(pCampos, BorderLayout.CENTER);
        this.add(pBotones, BorderLayout.SOUTH);
    }