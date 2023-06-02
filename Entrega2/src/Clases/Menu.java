package Clases;

public class Menu{
	
	private String nombre_de_plato;
	private boolean disponibilidad;
	private String bebida;
	private int precios;
	private Plato plato2;

	public Menu(String nombre_de_plato, boolean disponibilidad, String bebida, int precios, Plato plato2) {
	this.nombre_de_plato = nombre_de_plato;
	this.disponibilidad = disponibilidad;
	this.bebida = bebida;
	this.precios = precios;
	this.plato2 = plato2;
	}

	public String getNombre_de_plato() {
		return nombre_de_plato;
	}

	public void setNombre_de_plato(String nombre_de_plato) {
		this.nombre_de_plato = nombre_de_plato;
	}

	public boolean isDisponibilidad() {
		return disponibilidad;
	}

	public void setDisponibilidad(boolean disponibilidad) {
		this.disponibilidad = disponibilidad;
	}

	public String getBebida() {
		return bebida;
	}

	public void setBebida(String bebida) {
		this.bebida = bebida;
	}

	public int getPrecios() {
		return precios;
	}

	public void setPrecios(int precios) {
		this.precios = precios;
	}

	public String toString() {
		return this.nombre_de_plato + "\t" + this.disponibilidad + "\t" + this.bebida + "\t" + this.precios + "\t" + this.plato2+"\n";
	}

}
