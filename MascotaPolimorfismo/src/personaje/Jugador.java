package personaje;

import mascotas.Mascota;

public class Jugador {
private String nombre;
private Mascota mascotaElegida;
private int dinero = 10000;

public Jugador(String nombre, Mascota mascotaElegida) {
	this.nombre = nombre;
	this.mascotaElegida = mascotaElegida;
}


public void mostrarEstadisticas() {
	System.out.println("Nombre: " + this.nombre);
	System.out.println("Dinero: " + this.dinero);
	System.out.println("Mascota: ");
	this.mascotaElegida.mostrarEstadisticas();
}

public void gastarPlata(int cantidad) {
	this.dinero -= cantidad;
}

public void activarCheat() {
	System.out.println("Cheat activado");
	this.dinero = 1000000000;
}

public void recuperarPlata(int cantidad) {
	this.dinero += cantidad;
}

public int getDinero() {
	return this.dinero;
}

public Mascota getMascota() {
	return this.mascotaElegida;
}
}
