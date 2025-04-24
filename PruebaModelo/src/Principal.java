import Entidades.Jugador;
import Entidades.Tienda;
import Entidades.generadorEnemigos;
import Utilidades.Utiles;

public class Principal {
public static void main(String argc[]) {
	String nombre;
	Jugador jugador, enemigo;
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
	enemigo.getInformacion();
	enemigo.mostrarArmaduraYArma();
}
}
