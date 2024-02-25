package uniandes.dpoo.aerolinea.modelo.tarifas;

import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;

public class CalculadoraTarifasTemporadaAlta extends CalculadoraTarifas{
	
	protected final static int COSTO_POR_KM = 1000;
	
	@Override
	public int calcularCostoBase(Vuelo vuelo, Cliente cliente) {
		//TODO
		return 2;
	}

	@Override
	public double calcularPorcentajeDescuento(Cliente cliente) {
		//TODO
		return 2;
	}
}
