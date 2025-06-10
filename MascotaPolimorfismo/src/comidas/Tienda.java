package comidas;

import personaje.Jugador;
import utilidades.Utiles;

public abstract class Tienda {
private static Comida[] comidasDisponibles ={new Manzana(), new Sushi(), new Fideos()};



public static void comprarComida(Jugador jugador) {
	Comida comidaComprada;
	System.out.println("Bienvenido a la tienda");
	System.out.println("Ofrecemos las siguientes comidas");
	for(int i = 0; i < comidasDisponibles.length; i++) {
	System.out.println((i+ 1) + ") " + comidasDisponibles[i].getNombre());
	}
	System.out.println("Elija una:");
	int opc = Utiles.ingresarEntero(1, comidasDisponibles.length) - 1;
	comidaComprada = comidasDisponibles[opc];
    System.out.println("Compro una:" + comidasDisponibles[opc].getNombre());
	jugador.comprarComida(comidaComprada);
}
}
