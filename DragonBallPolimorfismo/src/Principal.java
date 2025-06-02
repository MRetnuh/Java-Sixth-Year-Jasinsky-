import personajes.FreezerBase;
import personajes.FreezerFormas;
import personajes.GokuBase;
import personajes.GokuFases;
import personajes.Personaje;
import personajes.PersonajesDisponibles;
import utilidades.Utiles;

public class Principal {
private static Personaje[] jugadores = new Personaje[2];
private static final int JUGADOR = 0, ENEMIGO = 1;
public static void main(String[] args) {
	elegirPersonajesJugadorYEnemigo();
	batallar();
}

private static void elegirPersonajesJugadorYEnemigo() {
	int opc;
	int eleccionEnemigo = Utiles.r.nextInt(PersonajesDisponibles.values().length) + 1;
	System.out.println("Bienvenido a un simulador de pelea de dbz");
	System.out.println("Personajes disponibles: ");
	for(int i = 0; i < PersonajesDisponibles.values().length; i++) {
		System.out.println(i + 1 +")" + PersonajesDisponibles.values()[i].getNombre());
	}
	
	mostrarGokuFases();
	mostrarFreezerTransformaciones();
	
	System.out.println("Elija su personaje: ");
	opc = Utiles.ingresarEntero(1, PersonajesDisponibles.values().length);
	jugadores[JUGADOR] = asignarPersonaje(opc);
	System.out.println("El jugador eligio a: " + jugadores[JUGADOR].getNombre());
	
	System.out.println("Turno del enemigo: ");
	jugadores[ENEMIGO] = asignarPersonaje(eleccionEnemigo);
	System.out.println("El enemigo eligio a: " + jugadores[ENEMIGO].getNombre());
	
}

private static void batallar() {
	int turno = Utiles.r.nextInt(2);
	System.out.println("La pelea va a empezar");
	System.out.println("El primer turno es del " + (turno == 0? "jugador" : "enemigo"));
	boolean finPelea = false;
	
	do {
		
		finPelea = jugadores[turno].comprobarDerrota(jugadores[cambiarTurno(turno)]);
		turno = cambiarTurno(turno);
	}while(!finPelea);
	System.out.println("Gano el " + (jugadores[JUGADOR].getVida() > 0? "jugador con " + 
	jugadores[JUGADOR].getNombre() : "enemigo con " + jugadores[ENEMIGO].getNombre()));
}

private static int cambiarTurno(int turno) {
	return (turno + 1) % 2;
}
private static void mostrarGokuFases() {
	System.out.println("Transformaciones de: " + PersonajesDisponibles.GOKU.getNombre());
	for(int i = 0; i < GokuFases.values().length; i++) {
	System.out.println(GokuFases.values()[i].getNombre());
	}
}

private static void mostrarFreezerTransformaciones() {
	System.out.println("Transformaciones de: " + PersonajesDisponibles.FREEZER.getNombre());
	for(int i = 0; i < FreezerFormas.values().length; i++) {
		System.out.println( FreezerFormas.values()[i].getNombre());
	}
}

private static Personaje asignarPersonaje(int opc) {
	Personaje personajeElegido = new GokuBase();
	switch(opc) {
	case 1:
		personajeElegido = new GokuBase();
		break;
	case 2:
		personajeElegido = new FreezerBase();
		break;
	}
	return personajeElegido;
}

}
