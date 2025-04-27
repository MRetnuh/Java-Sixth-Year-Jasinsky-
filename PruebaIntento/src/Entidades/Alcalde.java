package Entidades;

public class Alcalde {
private String nombre;
private String apellido;
public int dinero = 1000000;
public Alcalde(String nombre, String apellido) {
	this.nombre = nombre;
	this.apellido = apellido;
}
public int getDinero() {
	return this.dinero;
}
}
