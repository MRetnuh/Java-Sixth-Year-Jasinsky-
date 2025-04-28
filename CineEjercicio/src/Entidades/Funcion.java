package Entidades;

public class Funcion {
private int indicePelicula;
private int sala;
private int dia;
private int hora;
public Funcion(int indicePelicula, int sala, int dia, int hora) {
	this.indicePelicula = indicePelicula;
	this.sala = sala;
	this.dia = dia;
	this.hora = hora;
}
public int getSala() {
	return this.sala;
}
public int getIndicePelicula() {
	return this.indicePelicula;
}
public int getDia() {
	return this.dia;
}
public int getHora() {
	return this.hora;
}
}
