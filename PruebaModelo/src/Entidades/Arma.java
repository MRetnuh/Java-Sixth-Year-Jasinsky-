package Entidades;

public class Arma {
private String nombre;
private int danio;
private int precio;
private int velocidadAtaque;

public Arma(String nombre, int danio, int velocidadAtaque, int precio) {
	this.danio = danio;
	this.nombre = nombre;
	this.precio = precio;
	this.velocidadAtaque = velocidadAtaque;
}
public int getDanio() {
	return this.danio;
}
public String getNombre() {
	return this.nombre;
}
public int getPrecio() {
	return this.precio;
}
public int getVelocidadAtaque() {
	return this.velocidadAtaque;
}
}
