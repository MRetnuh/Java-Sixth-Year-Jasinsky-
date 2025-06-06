package efectos;

public enum TipoEfectoEstadistica {
ATAQUE("Ataque"),
PRECISION("Precision"),
DEFENSA("Defensa");
	
	String nombre;
	TipoEfectoEstadistica(String nombre){
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return this.nombre;
	}
}
