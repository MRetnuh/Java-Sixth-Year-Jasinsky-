import personajes.FreezerBase; 
import personajes.GokuBase;
import personajes.Personaje;
import personajes.PersonajesDisponibles;
import transformaciones.Freezer1Transformacion;
import transformaciones.Freezer2Transformacion;
import transformaciones.Freezer3Transformacion;
import transformaciones.GokuSsj;
import transformaciones.GokuSsj2;
import transformaciones.GokuSsj3;
import utilidades.Utiles;

public class Principal {
private static Personaje[] jugadores = new Personaje[2];
private static final int JUGADOR = 0, ENEMIGO = 1;
public static void main(String[] args) {
	elegirPersonajesJugadorYEnemigo();
	batallar();
	Utiles.s.close();
}

private static void elegirPersonajesJugadorYEnemigo() {
	int opc;
	int eleccionEnemigo;
	System.out.println("Bienvenido a un simulador de pelea de dbz");
	mostrarPersonajes();
	 
	System.out.println("Elija su personaje: ");
	opc = Utiles.ingresarEntero(1, PersonajesDisponibles.values().length);
	jugadores[JUGADOR] = asignarPersonaje(opc);
	System.out.println("El jugador eligio a: " + jugadores[JUGADOR].getNombre());
	int opcEnemigo = Utiles.r.nextInt(2);
	if(opcEnemigo == 0) {
		eleccionEnemigo = opc + (opc < 4? 4 : -4);
	}
	else {
		eleccionEnemigo = opc;
	}
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

private static void mostrarPersonajes() {
	System.out.println("Personajes disponibles: ");
	
	for(int i = 0; i < PersonajesDisponibles.values().length; i++) {
	System.out.println((i + 1) + ")" + PersonajesDisponibles.values()[i].getNombre());
	}
}

private static Personaje asignarPersonaje(int opc) {
	Personaje personajeElegido = new GokuBase();
	switch(opc) {
	case 1:
		personajeElegido = new GokuBase();
		break;
	case 2:
		personajeElegido = new GokuSsj();
		break;
	case 3:
		personajeElegido = new GokuSsj2();
		break;
	case 4:
		personajeElegido = new GokuSsj3();
		break;
	case 5:
		personajeElegido = new FreezerBase();
		break;
	case 6:
		personajeElegido = new Freezer1Transformacion();
		break;
	case 7:
		personajeElegido = new Freezer2Transformacion();
		break;
	case 8:
		personajeElegido = new Freezer3Transformacion();
		break;
	}
	return personajeElegido;
}

}
