public class PagoTarjeta {

    private HashMap<Integer, PagoTarjeta> pagos;
    
    private int valor;
	private String comercio;
	private int nFactura;
	private String fecha;
	private int nTarjeta;
	private String caducidad;
	private int codigoSeguridad;
	
    public Habitaciones(int valor, String comercio, int nFactura, String fecha, int nTarjeta, String caducidad, int codigoSeguridad) {
		this.valor = valor;
        this.comercio = comercio;
        this.nfactura = nFactura;
        this.fecha = fecha;
        this.nTarjeta = nTarjeta;
        this.caducidad = caducidad;
        this.codigoSeguridad = codigoSeguridad;
	}

    public boolean crearPago(int valor, String comercio, int nFactura, String fecha, int nTarjeta, String caducidad, int codigoSeguridad) {
			PagoTarjeta pagos = new PagoTarjeta(valor, comercio, nFactura, fecha, nTarjeta, caducidad, codigoSeguridad);
			this.pagos.put(nFactura, pagos);

}
