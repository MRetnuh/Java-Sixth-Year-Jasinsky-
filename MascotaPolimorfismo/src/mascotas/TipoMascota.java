package mascotas;

public enum TipoMascota {
FUEGO("Fuego", 50),
AGUA("Agua", 100),
PLANTA("Planta", 25);
	
	private String tipo;
	private int porcentajeReduccion;
	
	TipoMascota(String tipo, int porcentajeReduccion){
		this.tipo = tipo;
		this.porcentajeReduccion = porcentajeReduccion;
	}
	
	public String getTipo() {
		return this.tipo;
	}
	
	public int getPorcentaje() {
		return this.porcentajeReduccion;
	}
}
