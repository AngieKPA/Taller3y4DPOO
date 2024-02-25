package uniandes.dpoo.aerolinea.modelo;

import java.util.Map;

import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;
import uniandes.dpoo.aerolinea.modelo.tarifas.CalculadoraTarifas;
import uniandes.dpoo.aerolinea.tiquetes.Tiquete;

public class Vuelo {
	
	private String fecha;
	private Ruta ruta;
	private Avion avion;
	private  Map<String,Tiquete> tiquetes;
	
	public Vuelo(Ruta ruta, String fecha, Avion avion) {

		this.ruta = ruta;
		this.fecha = fecha;
		this.avion = avion;
	}

	public String getFecha() {
		return fecha;
	}

	public Ruta getRuta() {
		return ruta;
	}

	public Avion getAvion() {
		return avion;
	}

	public Map<String, Tiquete> getTiquetes() {
		return tiquetes;
	}
	
	public int venderTiquetes(Cliente ciente, CalculadoraTarifas calculadora, int cantidad) {
		//Completar cuando haga la calculadora y esta tiene una exception
		return 1;
	}
	
	public boolean equals(Object obj) {
		return false; // revisar
	}
}
