package Entidades;

public class Gestor {
final int maximoFunciones = 284;
private Funcion[] funciones;
private int contadorFunciones = 0;
final private int cantidadSalasTotales = 10;
final private int peliculasTotales = 45;
private int contadorPeliculas = 0;
private int contadorSalas = 0;
private Sala[] salas;
private Pelicula[] peliculas;
public Gestor() {
	salas = new Sala[cantidadSalasTotales];
	peliculas = new Pelicula[peliculasTotales];
	funciones = new Funcion[maximoFunciones];
}
public void getFunciones(Funcion funcion) {
	this.funciones[contadorFunciones] = funcion;
	contadorFunciones++;
}

public void getPeliculas(Pelicula pelicula) {
	this.peliculas[contadorPeliculas] = pelicula;
	contadorPeliculas++;
}
public void getSalas(Sala sala) {
	this.salas[contadorSalas] = sala;
	contadorSalas++;
}
public Pelicula[] getArrayPeliculas() {
	return this.peliculas;
}
public Sala[] getArraySalas() {
	return this.salas;
}
public Funcion[] getArrayFunciones() {
	return this.funciones;
}
public int getCantidadPeliculas() {
    return contadorPeliculas;
}
}
