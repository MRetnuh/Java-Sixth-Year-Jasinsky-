package ataques;

import efectos.EfectoSecundario;
import pokemones.PokemonTipo;

public abstract class Ataque {
private int danio;
private String nombre;
private int precision;
private int cantUsos;
private EfectoSecundario efectoSecundario;
private PokemonTipo tipoAtaque;
public Ataque(int danio, String nombre, int precision, int cantUsos, EfectoSecundario efectoSecundario, PokemonTipo tipoAtaque) {
	this.danio = danio;
	this.nombre = nombre;
	this.precision = precision;
	this.cantUsos = cantUsos;
	this.efectoSecundario = efectoSecundario;
	this.tipoAtaque = tipoAtaque;
}

public Ataque(int danio, String nombre, int precision, int cantUsos, PokemonTipo tipoAtaque) {
	this(danio, nombre, precision, cantUsos, null, tipoAtaque);
}

public void mostrarDatos() {
	System.out.println("Nombre: " + this.nombre + " Danio: " + this.danio + " Precision: " + this.precision + 
			" Cantidad de usos: " + (this.cantUsos > -1? this.cantUsos : "infinito") );
}

public void restarCantUsos() {
	this.cantUsos--;
}

public EfectoSecundario getEfectoSecundario() {
	return this.efectoSecundario;
}

public int getPrecision() {
	return this.precision;
}

public int getDanio() {
	return this.danio;
}

public int getCantUsos() {
   return this.cantUsos;
}

public PokemonTipo getTipoAtaque() {
	return this.tipoAtaque;
}

public String getNombre() {
	return this.nombre;
}
}
