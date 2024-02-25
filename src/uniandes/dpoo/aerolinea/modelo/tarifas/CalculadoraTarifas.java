package uniandes.dpoo.aerolinea.modelo.tarifas;

import uniandes.dpoo.aerolinea.modelo.Ruta;
import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;

public abstract class CalculadoraTarifas {
	
	public final static double IMPUESTO = 0.28;
	
	public int calcularTarifa(Vuelo vuelo, Cliente cliente) {
		// TODO
		return 1; 
	}
	
	protected abstract int calcularCostoBase(Vuelo vuelo, Cliente cliente);

	protected abstract double calcularPorcentajeDescuento(Cliente cliente);
	
	protected int calcularDistanciaVuelo(Ruta ruta) {
		//TODO
		return 1;
	}
	
	protected int calcularValorImpuestos(int costoBase) {
		float valorImpuestos= costoBase*Math.round(IMPUESTO);
		return (int) valorImpuestos;
	}
	
}
