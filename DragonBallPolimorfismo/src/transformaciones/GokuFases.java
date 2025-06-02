package transformaciones;

public enum GokuFases {
	

GOKUSSJ ("Super Saiyajin"),
GOKUSSJ2 ("Super Saiyajin 2"),
GOKUSSJ3 ("Super Saiyajin 3");

private String nombre;
GokuFases(String nombre){
	this.nombre = nombre;
}
	
	public String getNombre() {
		return this.nombre;
	}
}
