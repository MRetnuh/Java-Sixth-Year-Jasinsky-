package juegos;

import personaje.Jugador;

public abstract class Juego {
String nombre;

public Juego(String nombre) {
	this.nombre = nombre;
}

public abstract void empezarJuego(Jugador jugador);


}
