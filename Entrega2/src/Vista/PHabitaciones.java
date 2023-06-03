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

import Hotel;

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
    private JTextField tTamaño;
	private JTextField tAireAcondicionado;
	private JTextField tCalefaccion;
	private JTextField tTamañoCama;
	private JTextField tTV;
	private JTextField tCafetera;
	private JTextField tRopaCamayTapetes;
	private JTextField tPlancha;
	private JTextField tSecadorPelo;
	private JTextField tVoltajeAC;
	private JTextField tTomasUSBA;
	private JTextField tTomasUSBC;
	private JTextField tDesayuno;
	private JTextField tParqueaderoPago;
	private JTextField tParqueaderoGratuito;
	private JTextField tPiscina;
	private JTextField tZonasHumedas;
	private JTextField tBBQ;
	private JTextField tWifiGratis;
	private JTextField tRecepcion;
	private JTextField tMascotas;
    private JButton bCrearHabitacion;

    public PHabitaciones(FPrincipal fPrincipal) {
        this.setfPrincipal(fPrincipal);
        this.setTitle("Habitaciones");
        this.setSize(400, 300);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setLayout(new BorderLayout());

        JPanel pCampos = new JPanel();
        pCampos.setLayout(new GridLayout(14, 4, 10, 10));
        pCampos.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JLabel lNumero = new JLabel("Número:");
        JLabel lTarifa = new JLabel("Tarifa:");
        JLabel lUbicacion = new JLabel("Ubicación:");
        JLabel lBalcon = new JLabel("Balcón:");
        JLabel lTipo = new JLabel("Tipo:");
        JLabel lVista = new JLabel("Vista:");
        JLabel lCocina = new JLabel("Cocina:");
        JLabel lTamaño = new JLabel("Tamaño:");
        JLabel lAireAcondicionado = new JLabel("Aire Acondicionado:");
        JLabel lCalefaccion = new JLabel("Calefacción");
        JLabel lTamañoCama = new JLabel("Tamaño Cama:");
        JLabel lTV = new JLabel("TV:");
        JLabel lCafetera = new JLabel("Cafetera:");
        JLabel lRopaCamayTapetes = new JLabel("Ropa Cama y Tapetes Hipoalergenicos:");
        JLabel lPlancha = new JLabel("Plancha:");
        JLabel lSecadorPelo = new JLabel("Secador de Pelo:");
        JLabel lVoltajeAC = new JLabel("Voltaje AC:");
        JLabel lTomasUSBA = new JLabel("Tomas USB-A:");
        JLabel lTomasUSBC = new JLabel("Tomas USB-C:");
        JLabel lDesayuno = new JLabel("Desayuno:");
        JLabel lParqueaderoPago = new JLabel("Parqueadero Pago:");
        JLabel lParqueaderoGratuito = new JLabel("Parqueadero Gratuito:");
        JLabel lPiscina = new JLabel("Piscina:");
        JLabel lZonasHumedas = new JLabel("Zonas Húmedas:");
        JLabel lBBQ = new JLabel("BBQ:");
        JLabel lWifiGratis = new JLabel("Wifi Gratis:");
        JLabel lRecepcion = new JLabel("Recepción:");
        JLabel lMascotas = new JLabel("Mascotas:");

        tNumero = new JTextField();
        tTarifa = new JTextField();
        tUbicacion = new JTextField();
        tBalcon = new JTextField();
        tTipo = new JTextField();
        tVista = new JTextField();
        tCocina = new JTextField();
        tTamaño = new JTextField();
        tAireAcondicionado = new JTextField();
        tCalefaccion = new JTextField();
        tTamañoCama = new JTextField();
        tTV = new JTextField();
        tCafetera = new JTextField();
        tRopaCamayTapetes = new JTextField();
        tPlancha = new JTextField();
        tSecadorPelo = new JTextField();
        tVoltajeAC = new JTextField();
        tTomasUSBA = new JTextField();
        tTomasUSBC = new JTextField();
        tDesayuno = new JTextField();
        tParqueaderoPago = new JTextField();
        tParqueaderoGratuito = new JTextField();
        tPiscina = new JTextField();
        tZonasHumedas = new JTextField();
        tBBQ = new JTextField();
        tWifiGratis = new JTextField();
        tRecepcion = new JTextField();
        tMascotas = new JTextField();

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
        pCampos.add(lTamaño);
        pCampos.add(tTamaño);
        pCampos.add(lAireAcondicionado);
        pCampos.add(tAireAcondicionado);
        pCampos.add(lCalefaccion);
        pCampos.add(tCalefaccion);
        pCampos.add(lTamañoCama);
        pCampos.add(tTamañoCama);
        pCampos.add(lTV);
        pCampos.add(tTV);
        pCampos.add(lCafetera);
        pCampos.add(tCafetera);
        pCampos.add(lRopaCamayTapetes);
        pCampos.add(tRopaCamayTapetes);
        pCampos.add(lPlancha);
        pCampos.add(tPlancha);
        pCampos.add(lSecadorPelo);
        pCampos.add(tSecadorPelo);
        pCampos.add(lVoltajeAC);
        pCampos.add(tVoltajeAC);
        pCampos.add(lTomasUSBA);
        pCampos.add(tTomasUSBA);
        pCampos.add(lTomasUSBC);
        pCampos.add(tTomasUSBC);
        pCampos.add(lDesayuno);
        pCampos.add(tDesayuno);
        pCampos.add(lParqueaderoPago);
        pCampos.add(tParqueaderoPago);
        pCampos.add(lParqueaderoGratuito);
        pCampos.add(tParqueaderoGratuito);
        pCampos.add(lPiscina);
        pCampos.add(tPiscina);
        pCampos.add(lZonasHumedas);
        pCampos.add(tZonasHumedas);
        pCampos.add(lBBQ);
        pCampos.add(tBBQ);
        pCampos.add(lWifiGratis);
        pCampos.add(tWifiGratis);
        pCampos.add(lRecepcion);
        pCampos.add(tRecepcion);
        pCampos.add(lMascotas);
        pCampos.add(tMascotas);


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

    private void crearHabitacion() {
    	int numero = Integer.parseInt(tNumero.getText());
        int tarifa = Integer.parseInt(tTarifa.getText());
        String ubicacion = tUbicacion.getText();
        boolean balcon = Boolean.getBoolean(tBalcon.getText());
        String tipo = tTipo.getText();
        boolean vista = Boolean.getBoolean(tVista.getText());
        boolean cocina = Boolean.getBoolean(tCocina.getText());
        int tamaño = Integer.parseInt(tTamaño.getText());
    	boolean aireAcondicionado = Boolean.getBoolean(tAireAcondicionado.getText());
    	boolean calefaccion = Boolean.getBoolean(tCalefaccion.getText());
    	String tamañoCama = tTamañoCama.getText();
    	boolean TV = Boolean.getBoolean(tTV.getText());
    	boolean cafetera = Boolean.getBoolean(tCafetera.getText());
    	boolean ropaCamayTapetes = Boolean.getBoolean(tRopaCamayTapetes.getText());
    	boolean plancha = Boolean.getBoolean(tPlancha.getText());
    	boolean secadorPelo = Boolean.getBoolean(tSecadorPelo.getText());
    	int voltajeAC = Integer.parseInt(tVoltajeAC.getText());
    	boolean tomasUSBA = Boolean.getBoolean(tTomasUSBA.getText());
    	boolean tomasUSBC = Boolean.getBoolean(tTomasUSBC.getText());
    	boolean desayuno = Boolean.getBoolean(tDesayuno.getText());

        Clases.Habitaciones habitaciones = new Clases.Habitaciones(numero, tarifa, ubicacion, balcon, tipo, vista, cocina, tamaño, 
				aireAcondicionado,calefaccion, tamañoCama, TV, cafetera, ropaCamayTapetes, plancha, secadorPelo, 
				voltajeAC, tomasUSBA, tomasUSBC, desayuno);
        habitaciones.crearHabitacion(numero, tarifa, ubicacion, balcon, tipo, vista, cocina, tamaño, 
				aireAcondicionado,calefaccion, tamañoCama, TV, cafetera, ropaCamayTapetes, plancha, secadorPelo, 
				voltajeAC, tomasUSBA, tomasUSBC, desayuno);

        this.dispose();
    }
    
    private void crearHotel() {
    	String parqueaderoPago = tParqueaderoPago.getText();
    	String parqueaderoGratuito = tParqueaderoGratuito.getText();
    	String piscina = tPiscina.getText();
    	String zonasHumedas = tZonasHumedas.getText();
    	String BBQ = tBBQ.getText();
    	boolean wifiGratis = Boolean.getBoolean(tWifiGratis.getText());
    	boolean recepcion = Boolean.getBoolean(tRecepcion.getText());
    	boolean mascotas = Boolean.getBoolean(tMascotas.getText());

        Clases.Hotel hotel = new Clases.Hotel(parqueaderoPago, parqueaderoGratuito, piscina, zonasHumedas, BBQ, 
				wifiGratis, recepcion, mascotas);
        habitaciones.crearHabitacion(parqueaderoPago, parqueaderoGratuito, piscina, zonasHumedas, BBQ, 
				wifiGratis, recepcion, mascotas);

        this.dispose();
    }

	public FPrincipal getfPrincipal() {
		return fPrincipal;
	}

	public void setfPrincipal(FPrincipal fPrincipal) {
		this.fPrincipal = fPrincipal;
	}
}