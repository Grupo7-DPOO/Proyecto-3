package Clases;

public class Plato {
	private int id;
	private String ingredientes;
	private int cantidad_ingredientes;
	private String nombre;

	
	public String getIngredientes() {
		return ingredientes;
	}
	public void setIngredientes(String ingredientes) {
		this.ingredientes = ingredientes;
	}
	public int getCantidad_ingredientes() {
		return cantidad_ingredientes;
	}
	public void setCantidad_ingredientes(int cantidad_ingredientes) {
		this.cantidad_ingredientes = cantidad_ingredientes;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public Plato(int id, String ingredientes, String nombre, int cantidad_ingredientes) {
	this.id = id;
	this.cantidad_ingredientes = cantidad_ingredientes;
	this.ingredientes = ingredientes;
	this.nombre = nombre;
	}
	
	public String toString() {
		return this.id + "\t" + this.nombre + "\t" + this.ingredientes + "\t" + this.cantidad_ingredientes + "\t" + this.nombre+"\n";
	}
}

