package Vista;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
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
    private JComboBox<String> comboBox;
    private JButton bEnviar;

    public PTarjeta(FPrincipal fPrincipal) {
        this.setfPrincipal(fPrincipal);
        this.setTitle("Pago Tarjeta");
        this.setSize(400, 300);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setLayout(new BorderLayout());

        JPanel pCampos = new JPanel();
        pCampos.setLayout(new GridLayout(5, 2, 10, 10));
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

        JPanel pOpciones = new JPanel();
        pOpciones.setLayout(new FlowLayout(FlowLayout.LEFT));
        pOpciones.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JLabel lOpciones = new JLabel("Enviar a:");
        String[] opciones = { "uniandes.dpoo.PayPal", "uniandes.dpoo.PayU", "uniandes.dpoo.Sire" };
        comboBox = new JComboBox<>(opciones);

        pOpciones.add(lOpciones);
        pOpciones.add(comboBox);

        JPanel pBotones = new JPanel();
        pBotones.setLayout(new FlowLayout(FlowLayout.RIGHT));
        pBotones.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        bEnviar = new JButton("Enviar");
        bEnviar.addActionListener(e -> enviarInformacion());

        pBotones.add(bEnviar);

        this.add(pCampos, BorderLayout.CENTER);
        this.add(pOpciones, BorderLayout.NORTH);
        this.add(pBotones, BorderLayout.SOUTH);
    }

    private void enviarInformacion() {
        String opcionSeleccionada = comboBox.getSelectedItem().toString();
        String valor = tValor.getText();
        String comercio = tComercio.getText();
        String nFactura = tNFactura.getText();
        String fecha = tFecha.getText();
        String nTarjeta = tNTarjeta.getText();
        String caducidad = tCaducidad.getText();
        String codigoSeguridad = tCodigoSeguridad.getText();

        StringBuilder contenido = new StringBuilder();
        contenido.append("Valor: ").append(valor).append("\n");
        contenido.append("Comercio: ").append(comercio).append("\n");
        contenido.append("Numero Factura: ").append(nFactura).append("\n");
        contenido.append("Fecha: ").append(fecha).append("\n");
        contenido.append("Numero Tarjeta: ").append(nTarjeta).append("\n");
        contenido.append("Fecha Caducidad: ").append(caducidad).append("\n");
        contenido.append("Codigo de Seguridad: ").append(codigoSeguridad).append("\n");

        String nombreArchivo = "";
        switch (opcionSeleccionada) {
            case "uniandes.dpoo.PayPal":
                nombreArchivo = "PayPal.txt";
                break;
            case "uniandes.dpoo.PayU":
                nombreArchivo = "PayU.txt";
                break;
            case "uniandes.dpoo.Sire":
                nombreArchivo = "Sire.txt";
                break;
            default:
                System.out.println("Opción no válida.");
                return;
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo))) {
            writer.write(contenido.toString());
            System.out.println("Archivo de registro creado exitosamente.");
        } catch (IOException e) {
            System.out.println("Error al crear el archivo de registro: " + e.getMessage());
        }
    }
    public FPrincipal getfPrincipal() {
        return fPrincipal;
    }

    public void setfPrincipal(FPrincipal fPrincipal) {
        this.fPrincipal = fPrincipal;
    }
}
