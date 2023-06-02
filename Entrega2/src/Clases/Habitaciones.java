package Clases;

import java.util.HashMap;

public class Habitaciones {
	
	private HashMap<Integer, Habitaciones> habitaciones;

	private int numero;
	private int tarifa;
	private String ubicacion;
	private boolean balcon;
	private String tipo;
	private boolean vista;
	private boolean cocina;
	private int tamaño;
	private boolean aireAcondicionado;
	private boolean calefaccion;
	private String tamañoCama;
	private boolean TV;
	private boolean cafetera;
	private boolean ropaCamayTapetes;
	private boolean plancha;
	private boolean secadorPelo;
	private int voltajeAC;
	private boolean tomasUSB-A;
	private boolean tomasUSB-C;
	private boolean desayuno;

	public Habitaciones(int numero, int tarifa, String ubicacion, 
			boolean balcon, String tipo, boolean vista, boolean cocina, int tamaño, boolean aireAcondicionado,
			boolean calefaccion, String tamañoCama, boolean TV, boolean cafetera, boolean ropaCamayTapetes,
			boolean plancha, boolean secadorPelo, int voltajeAC, boolean tomasUSB-A, boolean tomasUSB-C,
			boolean desayuno) {
		this.numero = numero;
		this.tarifa = tarifa;
		this.ubicacion = ubicacion;
		this.balcon = balcon;
		this.tipo = tipo;
		this.vista = vista;
		this.cocina = cocina;
		this.tamaño = tamaño;
		this.aireAcondicionado = aireAcondicionado;
		this.calefaccion = calefaccion;
		this.tamañoCama = tamañoCama;
		this.TV = TV;
		this.cafetera = cafetera;
		this.ropaCamayTapetes = ropaCamayTapetes;
		this.plancha = plancha;
		this.secadorPelo = secadorPelo;
		this.voltajeAC = voltajeAC;
		this.tomasUSB-A = tomasUSB-A;
		this.tomasUSB-C = tomasUSB-C;
		this.desayuno = desayuno;
	}
	
	public boolean crearHabitacion(int numero, int tarifa, String ubicacion, 
			boolean balcon, String tipo, boolean vista, boolean cocina, int tamaño, boolean aireAcondicionado,
			boolean calefaccion, String tamañoCama, boolean TV, boolean cafetera, boolean ropaCamayTapetes,
			boolean plancha, boolean secadorPelo, int voltajeAC, boolean tomasUSB-A, boolean tomasUSB-C,
			boolean desayuno) {
		if (!existeHabitacion(numero)) {
			Habitaciones habitacion = new Habitaciones(numero, tarifa, ubicacion, balcon, tipo, vista, cocina, tamaño, 
					aireAcondicionado,calefaccion, tamañoCama, TV, cafetera, ropaCamayTapetes, plancha, secadorPelo, 
					voltajeAC, tomasUSB-A, tomasUSB-C, desayuno);
			this.habitaciones.put(numero, habitacion);
			return true;
		}else {
			return false;
		}
	}
	
	public Habitaciones consultarHabitacion(int numero) {
		Habitaciones resultado = null;
		for(Integer num : this.habitaciones.keySet()) {
			if (num==numero);{
			resultado = this.habitaciones.get(num);
			}
		}
		return resultado;		
	}
	
	public void editarHabitacion(int numero, int tarifa, String ubicacion, 
			boolean balcon, String tipo, boolean vista, boolean cocina, int tamaño, boolean aireAcondicionado,
			boolean calefaccion, String tamañoCama, boolean TV, boolean cafetera, boolean ropaCamayTapetes,
			boolean plancha, boolean secadorPelo, int voltajeAC, boolean tomasUSB-A, boolean tomasUSB-C,
			boolean desayuno) {
		this.habitaciones.remove(numero);
		crearHabitacion(numero, tarifa, ubicacion, balcon, tipo, vista, cocina, tamaño, 
				aireAcondicionado,calefaccion, tamañoCama, TV, cafetera, ropaCamayTapetes, plancha, secadorPelo, 
				voltajeAC, tomasUSB-A, tomasUSB-C, desayuno);
	}
	
	public Habitaciones consultarTarifa(int numero) {
		Habitaciones resultado = (Habitaciones) null;
		for (Integer num: this.habitaciones.keySet()) {
			if (num==numero);{
				Habitaciones habitacion = this.habitaciones.get(num);
				String key = "tarifa";
				resultado = this.habitaciones.get(key);
				}
		}
		return resultado;
	}
}
