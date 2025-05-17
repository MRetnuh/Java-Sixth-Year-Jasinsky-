package entidades;

public class Pokemon {
private String tipo;
private String nombre;
private int nivel;
private int costoCaptura;

public Pokemon(String nombre, String tipo, int nivel, int costoCaptura) {
	this.nombre = nombre;
	this.tipo = tipo;
	this.nivel = nivel;
	this.costoCaptura = costoCaptura;
}
public String getNombre() {
	return this.nombre;
}
public String getTipo() {
	return this.tipo;
}
public int getNivel() {
	return this.nivel;
}
public int getCostoCaptura() {
	return this.costoCaptura;
}
}
