package Entidades;

import java.util.Random;

public class generadorEnemigos {
	Tienda tienda = new Tienda();
	Jugador enemigo;
	NombresEnemigos enemigoNombre;
	NombresEnemigos[] nombresDisponibles = NombresEnemigos.values();
	final String[] elementos = {"Casco", "Peto", "Grebas", "Botas"};
	public Jugador crearEnemigo() {
	    enemigo = generarNombreEnemigo();
		System.out.println("El nombre del enemigo es " + enemigo.getNombre());
		generarArmadura();
		generarArma();
		return enemigo;
	}
	private void generarArmadura() {
	    for (int i = 0; i < elementos.length; i++) {
	        generarElementoArmadura(elementos[i]);
	    }
	}

	private void generarArma() {
		tienda.asignarArmaAleatoeria(enemigo);
	}
	   private void generarElementoArmadura(String tipoElemento) {
	        tienda.asignarParteAleatoria(tipoElemento, enemigo);
	    }
 private Jugador generarNombreEnemigo() {
	 Random r = new Random();
	 int seleccionNombre = r.nextInt(nombresDisponibles.length);
     String nombreElegido = String.valueOf(nombresDisponibles[seleccionNombre]);
	 return new Jugador(nombreElegido);
 }
}
