package Entidades;

public class Pelicula {
private String titulo;
private String genero;
private String formato;
public Pelicula(String titulo, String genero, String formato) {
	this.titulo = titulo;
	this.genero = genero;
	this.formato = formato;
}
public String getTitulo() {
	return this.titulo;
}
public String getGenero() {
	return this.genero;
}
public String getFormato() {
	return this.formato;
}
}
