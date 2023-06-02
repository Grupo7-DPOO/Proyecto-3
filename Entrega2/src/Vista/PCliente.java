package Vista;

import javax.swing.*;
import java.awt.*;

public class PCliente extends JDialog {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private FPrincipal fPrincipal;
    private JTextField nombreTextField;
    private JTextField nacimientoTextField;
    private JTextField idTextField;
    private JTextField correoTextField;
    private JButton crearClienteButton;

    public PCliente(FPrincipal fPrincipal) {
        this.setfPrincipal(fPrincipal);
        this.setTitle("Cliente");
        this.setSize(400, 300);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setLayout(new BorderLayout());

        JPanel pCampos = new JPanel();
        pCampos.setLayout(new GridLayout(4, 2, 10, 10));
        pCampos.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JLabel fechaLabel = new JLabel("Nombre:");
        JLabel idLabel = new JLabel("ID:");
        JLabel clienteLabel = new JLabel("Nacimiento:");
        JLabel recepcionistaLabel = new JLabel("Correo:");

        nombreTextField = new JTextField();
        idTextField = new JTextField();
        nacimientoTextField = new JTextField();
        correoTextField = new JTextField();

        pCampos.add(fechaLabel);
        pCampos.add(nombreTextField);
        pCampos.add(idLabel);
        pCampos.add(idTextField);
        pCampos.add(clienteLabel);
        pCampos.add(nacimientoTextField);
        pCampos.add(recepcionistaLabel);
        pCampos.add(correoTextField);

        JPanel pBotones = new JPanel();
        pBotones.setLayout(new FlowLayout(FlowLayout.RIGHT));
        pBotones.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        crearClienteButton = new JButton("Crear Cliente");
        crearClienteButton.addActionListener(e -> {
            crearFactura();
        });
        pBotones.add(crearClienteButton);

        this.add(pCampos, BorderLayout.CENTER);
        this.add(pBotones, BorderLayout.SOUTH);
    }

    private void crearFactura() {
        String nombre = nombreTextField.getText();
        int id = Integer.parseInt(idTextField.getText());
        String nacimiento = nacimientoTextField.getText();
        String correo = correoTextField.getText();

        Clases.Cliente cliente = new Clases.Cliente(nombre, nacimiento, id, correo);
        cliente.crearCliente();

        this.dispose();
    }

	public FPrincipal getfPrincipal() {
		return fPrincipal;
	}

	public void setfPrincipal(FPrincipal fPrincipal) {
		this.fPrincipal = fPrincipal;
	}
}
