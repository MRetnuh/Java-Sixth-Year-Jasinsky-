import java.util.Random;

import Entidades.Jugador;
import Entidades.Tienda;
import Entidades.generadorEnemigos;
import Utilidades.Utiles;

public class Principal {
public static void main(String argc[]) {
	String nombre;
	final int cantidadJugadores = 2;
	Jugador jugador, enemigo;
	Random r = new Random();
	int inicioPelea = r.nextInt(cantidadJugadores) + 1;
	generadorEnemigos generadorEnemigos = new generadorEnemigos();
	System.out.println("Bienvenido, ingrese su nombre: ");
	nombre = Utiles.s.nextLine();
	jugador = new Jugador(nombre);
	jugador.getInformacion();
	Tienda tienda = new Tienda();
	tienda.comprarElementoArmadura(jugador);
	enemigo = generadorEnemigos.crearEnemigo();
	jugador.getInformacion();
	jugador.mostrarArmaduraYArma();
	System.out.println();
	enemigo.getInformacion();
	enemigo.mostrarArmaduraYArma();
	System.out.println();
	System.out.println("Comienza la pelea");
	System.out.println("El primer turno es de: ");
	jugador.realizarPelea(jugador, enemigo, inicioPelea);
}
}
