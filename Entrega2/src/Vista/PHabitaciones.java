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

public class PHabitaciones extends JDialog {

	private static final long serialVersionUID = 1L;
	private FPrincipal fPrincipal;
    private JTextField tNumero;
    private JTextField tTarifa;
    private JTextField tUbicacion;
    private JTextField tBalcon;
    private JTextField tTipo;
    private JTextField tVista;
    private JTextField tCocina;
    private JButton bCrearHabitacion;

    public PHabitaciones(FPrincipal fPrincipal) {
        this.setfPrincipal(fPrincipal);
        this.setTitle("Habitaciones");
        this.setSize(400, 300);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setLayout(new BorderLayout());

        JPanel pCampos = new JPanel();
        pCampos.setLayout(new GridLayout(4, 2, 10, 10));
        pCampos.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JLabel lNumero = new JLabel("Número:");
        JLabel lTarifa = new JLabel("Tarifa:");
        JLabel lUbicacion = new JLabel("Ubicación:");
        JLabel lBalcon = new JLabel("Balcón:");
        JLabel lTipo = new JLabel("Tipo:");
        JLabel lVista = new JLabel("Vista:");
        JLabel lCocina = new JLabel("Cocina:");

        tNumero = new JTextField();
        tTarifa = new JTextField();
        tUbicacion = new JTextField();
        tBalcon = new JTextField();
        tTipo = new JTextField();
        tVista = new JTextField();
        tCocina = new JTextField();

        pCampos.add(lNumero);
        pCampos.add(tNumero);
        pCampos.add(lTarifa);
        pCampos.add(tTarifa);
        pCampos.add(lUbicacion);
        pCampos.add(tUbicacion);
        pCampos.add(lBalcon);
        pCampos.add(tBalcon);
        pCampos.add(lTipo);
        pCampos.add(tTipo);
        pCampos.add(lVista);
        pCampos.add(tVista);
        pCampos.add(lCocina);
        pCampos.add(tCocina);

        JPanel pBotones = new JPanel();
        pBotones.setLayout(new FlowLayout(FlowLayout.RIGHT));
        pBotones.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        bCrearHabitacion = new JButton("Crear Habitación");
        bCrearHabitacion.addActionListener(e -> {
            crearHabitacion();
        });
        pBotones.add(bCrearHabitacion);

        this.add(pCampos, BorderLayout.CENTER);
        this.add(pBotones, BorderLayout.SOUTH);
    }

    private void crearUsuario() {
        int numero = Integer.parseInt(tNumero.getText());
        int tarifa = Integer.parseInt(tTarifa.getText());
        String ubicacion = tUbicacion.getText();
        boolean balcon = Boolean.getBoolean(tBalcon.getText());
        String tipo = tTipo.getText();
        boolean vista = Boolean.getBoolean(tVista.getText());
        boolean cocina = Boolean.getBoolean(tCocina.getText());

        Clases.Habitaciones habitaciones = new Clases.Habitaciones(numero, tarifa, ubicacion, balcon, tipo, vista, cocina);
        habitaciones.crearHabitacion(numero, tarifa, ubicacion, balcon, tipo, vista, cocina);

        this.dispose();
    }

	public FPrincipal getfPrincipal() {
		return fPrincipal;
	}

	public void setfPrincipal(FPrincipal fPrincipal) {
		this.fPrincipal = fPrincipal;
	}
}