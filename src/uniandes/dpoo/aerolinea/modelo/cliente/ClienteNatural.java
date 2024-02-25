package uniandes.dpoo.aerolinea.modelo.cliente;

public class ClienteNatural extends Cliente {
	
	public final static String NATURAL = "Natural";
	private String nombre;
	
	
	public ClienteNatural(String nombre) {
		super();
		this.nombre = nombre;
	}

	@Override
	public String getTipoCliente() {
		return NATURAL;
	}

	@Override
	public String getIdentificador() {
		return nombre;
	}
	

}
