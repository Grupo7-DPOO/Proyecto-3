package Vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PUsuario extends JDialog {

	private static final long serialVersionUID = 1L;
	private FPrincipal fPrincipal;
    private JTextField tLogin;
    private JTextField tPassword;
    private JButton bCrearUsuario;

    public PUsuario(FPrincipal fPrincipal) {
        this.setfPrincipal(fPrincipal);
        this.setTitle("Usuario");
        this.setSize(400, 300);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setLayout(new BorderLayout());

        JPanel pCampos = new JPanel();
        pCampos.setLayout(new GridLayout(2, 1, 10, 10));
        pCampos.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JLabel lLogin = new JLabel("Login:");
        JLabel lPassword = new JLabel("Password:");

        tLogin = new JTextField();
        tPassword = new JTextField();

        pCampos.add(lLogin);
        pCampos.add(tLogin);
        pCampos.add(lPassword);
        pCampos.add(tPassword);

        JPanel pBotones = new JPanel();
        pBotones.setLayout(new FlowLayout(FlowLayout.RIGHT));
        pBotones.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        bCrearUsuario = new JButton("Crear Usuario");
        bCrearUsuario.addActionListener(e -> {
            crearUsuario();
        });
        pBotones.add(bCrearUsuario);

        this.add(pCampos, BorderLayout.CENTER);
        this.add(pBotones, BorderLayout.SOUTH);
    }

    private void crearUsuario() {
        String login = tLogin.getText();
        String password = tPassword.getText();

        Clases.Usuario usuario = new Clases.Usuario(password, login);
        usuario.crearUsuario(password, login);

        this.dispose();
    }

	public FPrincipal getfPrincipal() {
		return fPrincipal;
	}

	public void setfPrincipal(FPrincipal fPrincipal) {
		this.fPrincipal = fPrincipal;
	}
}