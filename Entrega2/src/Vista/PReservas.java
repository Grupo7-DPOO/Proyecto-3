package Vista;

import javax.swing.*;
import java.awt.*;

public class PReservas extends JDialog {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private FPrincipal fPrincipal;
    private JTextField cpersonasTextField;
    private JTextField llegadaTextField;
    private JTextField horalleTextField;
    private JTextField horasaTextField;
    private JTextField camaTextField;
    private JTextField cantidadTextField;
    private JTextField idTextField;
    
    private JButton crearFacturaButton;

    public PReservas(FPrincipal fPrincipal) {
        this.setfPrincipal(fPrincipal);
        this.setTitle("Reserva");
        this.setSize(600, 300);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setLayout(new BorderLayout());

        JPanel pCampos = new JPanel();
        pCampos.setLayout(new GridLayout(4, 2, 10, 10));
        pCampos.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JLabel cpersonasLabel = new JLabel("Cantidad de personas:");
        JLabel llegadaLabel = new JLabel("Fecha de llegada:");
        JLabel horalleLabel = new JLabel("Hora de llegada:");
        JLabel horasaLabel = new JLabel("Hora de salida:");
        JLabel camaLabel = new JLabel("Cama para menores (Si/No):");
        JLabel cantidadLabel = new JLabel("Cantidad de menores:");
        JLabel idLabel = new JLabel("ID :");

        cpersonasTextField = new JTextField();
        idTextField = new JTextField();
        llegadaTextField = new JTextField();
        horalleTextField = new JTextField();
        horasaTextField = new JTextField();
        cantidadTextField = new JTextField();
        camaTextField = new JTextField();

        pCampos.add(cpersonasLabel);
        pCampos.add(cpersonasTextField);
        pCampos.add(llegadaLabel);
        pCampos.add(llegadaTextField);
        pCampos.add(horalleLabel);
        pCampos.add(horalleTextField);
        pCampos.add(horasaLabel);
        pCampos.add(horasaTextField);
        pCampos.add(cantidadLabel);
        pCampos.add(cantidadTextField);
        pCampos.add(idLabel);
        pCampos.add(idTextField);
        pCampos.add(camaLabel);
        pCampos.add(camaTextField);
        

        JPanel pBotones = new JPanel();
        pBotones.setLayout(new FlowLayout(FlowLayout.RIGHT));
        pBotones.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        crearFacturaButton = new JButton("Crear Reserva");
        crearFacturaButton.addActionListener(e -> {
            crearReserva();
        });
        pBotones.add(crearFacturaButton);

        this.add(pCampos, BorderLayout.CENTER);
        this.add(pBotones, BorderLayout.SOUTH);
    }

    private void crearReserva() {
        int cantidad_de_personas = Integer.parseInt(cantidadTextField.getText());
        int id = Integer.parseInt(idTextField.getText());
        String fecha_de_llegada = llegadaTextField.getText();
        String hora_de_llegada = horalleTextField.getText();
        String hora_de_salida = horasaTextField.getText();
        boolean cama_para_menores = Boolean.parseBoolean(camaTextField.getText());
        int cantidad_de_menores = Integer.parseInt(cantidadTextField.getText());
        
        Clases.Reserva reserva = new Clases.Reserva(cantidad_de_personas, fecha_de_llegada, hora_de_llegada, hora_de_salida, cama_para_menores, cantidad_de_menores, id);
        reserva.crearReserva();

        this.dispose();
    }

	public FPrincipal getfPrincipal() {
		return fPrincipal;
	}

	public void setfPrincipal(FPrincipal fPrincipal) {
		this.fPrincipal = fPrincipal;
	}
}