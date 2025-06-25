package comidas;

import interfaces.Mostrable;
import personaje.Jugador;
import utilidades.Utiles;

public abstract class Tienda implements Mostrable{



public static void comprarComida(Jugador jugador) {
    Comida[] comidasDisponibles ={new Manzana(), new Sushi(), new Fideos()};
	Comida comidaComprada;
	System.out.println("Bienvenido a la tienda");
	System.out.println("Ofrecemos las siguientes comidas");
	Utiles.mostrarLista(comidasDisponibles);
	System.out.println("Elija una:");
	int opc = Utiles.ingresarEntero(1, comidasDisponibles.length) - 1;
	comidaComprada = comidasDisponibles[opc];
    System.out.println("Compro una:" + comidasDisponibles[opc].getNombre());
	jugador.comprarComida(comidaComprada);
}
}
