package personajes;

public enum FreezerFormas{
	

FREEZER1TRANSFORMACION ("primera transformacion"),
FREEZER2TRANSFORMACION  ("segunda transformacion"),
FREEZER3TRANSFORMACION  ("tercera transformacion");
	
	private String nombre;
	FreezerFormas(String nombre){
	this.nombre = nombre;
}
	
	public String getNombre() {
		return this.nombre;
	}
}
