package Vista;

import javax.swing.*;
import java.awt.*;

public class PFactura extends JDialog {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private FPrincipal fPrincipal;
    private JTextField fechaTextField;
    private JTextField idTextField;
    private JTextField clienteTextField;
    private JTextField recepcionistaTextField;
    private JButton crearFacturaButton;

    public PFactura(FPrincipal fPrincipal) {
        this.setfPrincipal(fPrincipal);
        this.setTitle("Factura");
        this.setSize(400, 300);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setLayout(new BorderLayout());

        JPanel pCampos = new JPanel();
        pCampos.setLayout(new GridLayout(4, 2, 10, 10));
        pCampos.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JLabel fechaLabel = new JLabel("Fecha:");
        JLabel idLabel = new JLabel("ID:");
        JLabel clienteLabel = new JLabel("Cliente:");
        JLabel recepcionistaLabel = new JLabel("Recepcionista:");

        fechaTextField = new JTextField();
        idTextField = new JTextField();
        clienteTextField = new JTextField();
        recepcionistaTextField = new JTextField();

        pCampos.add(fechaLabel);
        pCampos.add(fechaTextField);
        pCampos.add(idLabel);
        pCampos.add(idTextField);
        pCampos.add(clienteLabel);
        pCampos.add(clienteTextField);
        pCampos.add(recepcionistaLabel);
        pCampos.add(recepcionistaTextField);

        JPanel pBotones = new JPanel();
        pBotones.setLayout(new FlowLayout(FlowLayout.RIGHT));
        pBotones.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        crearFacturaButton = new JButton("Crear Factura");
        crearFacturaButton.addActionListener(e -> {
            crearFactura();
        });
        pBotones.add(crearFacturaButton);

        this.add(pCampos, BorderLayout.CENTER);
        this.add(pBotones, BorderLayout.SOUTH);
    }

    private void crearFactura() {
        String fecha = fechaTextField.getText();
        int id = Integer.parseInt(idTextField.getText());
        String cliente = clienteTextField.getText();
        String recepcionista = recepcionistaTextField.getText();

        Clases.Factura factura = new Clases.Factura(fecha, id, cliente, recepcionista);
        factura.crearFactura();

        this.dispose();
    }

	public FPrincipal getfPrincipal() {
		return fPrincipal;
	}

	public void setfPrincipal(FPrincipal fPrincipal) {
		this.fPrincipal = fPrincipal;
	}
}

