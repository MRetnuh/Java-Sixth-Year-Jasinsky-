package Entidades;

public class Armadura {
private String nombre;
private String tipo;
private int precio;
private int vidaAgregada;
private int velocidadCambio;
public Armadura(String nombre, String tipo, int precio, int vidaAgregada, int velocidadCambio) {
	this.nombre = nombre;
	this.tipo = tipo;
	this.precio = precio;
	this.vidaAgregada = vidaAgregada;
	this.velocidadCambio = velocidadCambio;
}

public String getTipo() {
	return this.tipo;
}
public String getNombre() {
    return nombre;
}

public int getPrecio() {
    return precio;
}

public int getVidaAgregada() {
    return vidaAgregada;
}

public int getDisminuyeVelAtaque() {
    return velocidadCambio;
}
}