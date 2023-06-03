package Clases; 

public class Hotel {
	
	private HashMap<String, Hotel> hotel;

	private String parqueaderoPago;
	private String parqueaderoGratuito;
	private String piscina;
	private String zonasHumedas;
	private String BBQ;
	private boolean wifiGratis;
	private boolean recepcion;
	private boolean mascotas;
	
	public Habitaciones(String parqueaderoPago, String parqueaderoGratuito, String piscina, String zonasHumedas,
			String BBQ, boolean wifiGratis, boolean recepcion, boolean mascotas) {
		this.parqueaderoPago = parqueaderoPago;
		this.parqueaderoGratuito = parqueaderoGratuito;
		this.piscina = piscina;
		this.zonasHumedas = zonasHumedas;
		this.BBQ = BBQ;
		this.wifiGratis = wifiGratis;
		this.recepcion = recepcion;
		this.mascotas = mascotas
	}
	
	public HashMap<String,Hotel> crearHotel(String parqueaderoPago, String parqueaderoGratuito, String piscina, String zonasHumedas,
			String BBQ, boolean wifiGratis, boolean recepcion, boolean mascotas) {
			Hotel hotel = new Hotel(parqueaderoPago, parqueaderoGratuito, piscina, zonasHumedas, BBQ, 
					wifiGratis, recepcion, mascotas);
			this.hotel.put("Hotel", hotel);
}
