package uniandes.dpoo.aerolinea.modelo.tarifas;

import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;

public class CalculadoraTarifasTemporadaBaja extends CalculadoraTarifas{
	
	protected final static int COSTO_POR_KM_NATURAL = 600;
	protected final static int COSTO_POR_KM_CORPORATIVO = 900;
	protected final static double DESCUENTO_PEQ = 0.02;
	protected final static double DESCUENTO_MEDIANAS = 0.1;
	protected final static double DESCUENTO_GRANDES = 0.2;
	
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
