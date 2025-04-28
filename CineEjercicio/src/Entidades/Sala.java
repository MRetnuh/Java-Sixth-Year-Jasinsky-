package Entidades;

public class Sala {
private int numeroSala;
private int filas;
private int columnas;
public Sala(int numeroSala, int filas, int columnas) {
	this.numeroSala = numeroSala;
	this.filas = filas;
	this.columnas = columnas;
}
public int getNumeroSala() {
	return this.numeroSala;
}
public int getFilas() {
	return this.filas;
}
public int getColumnas() {
	return this.columnas;
}
}
