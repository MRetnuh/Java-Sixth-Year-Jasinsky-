package efectos;

public enum TipoEstadistica {
    ATAQUE("ataque"), PRECISION("precision"), DEFENSA("defensa");
	private String efecto;
	TipoEstadistica(String efecto){
		this.efecto = efecto;
	}
	
	public String getNombreEstadistica() {
		return this.efecto;
	}
}
