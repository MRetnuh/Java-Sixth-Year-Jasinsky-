import personajes.Enemigo;
import personajes.Jugador;
import utilidades.Utiles;

public class Main {
	private static Jugador jugador;
	private static Enemigo enemigo;
public static void main(String[] args) {
	System.out.println("Bienvenidos a la batalla pokemon");
	crearPersonajes();
	batallar();
}

private static void batallar() {
	int turno = 0;
	boolean finDelJuego = false;
	turno = Utiles.r.nextInt(2);
	System.out.println("Empieza el jugador " + (turno == 0? jugador.getNombre() : enemigo.getNombre()));
	do {
		System.out.println("Turno de " + (turno == 0? jugador.getNombre() : enemigo.getNombre()));
		if(turno == 0) {
			jugador.mostrarPokemonActivo();
			jugador.mostrarMenuAtaques(enemigo);
			turno = 1;
            finDelJuego = enemigo.comprobarDerrota();
		}
		else {
			finDelJuego = jugador.comprobarDerrota();
			enemigo.mostrarPokemonActivo();
			enemigo.atacar(jugador);
			turno = 0;
            finDelJuego = jugador.comprobarDerrota();
		}
	}while(!finDelJuego);
	System.out.println("El jugador " + (jugador.comprobarDerrota() == true? enemigo.getNombre() : jugador.getNombre() + " ha ganado"));
}


private static void crearPersonajes() {
	System.out.println("Ingrese su nombre");
	String nombre = Utiles.s.nextLine();
	jugador = new Jugador(nombre);
	enemigo = new Enemigo();
	System.out.println("Tu adversario sera " + enemigo.getNombre());
}
}
