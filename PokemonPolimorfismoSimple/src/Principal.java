import personajes.Enemigo;
import personajes.Jugador;
import personajes.Personaje;
import pokemones.Bulbasaur;
import pokemones.Charmander;
import pokemones.Pikachu;
import pokemones.Pokemon;
import pokemones.PokemonDisponible;
import pokemones.Squirtle;
import utiles.Util;

public class Principal {
private static int JUGADOR = 0, ENEMIGO = 1;
private static Personaje[] personajes = new Personaje[2];
	public static void main(String[] args) {
		crearJugadorYEnemigo();
        Util.jugador = personajes[JUGADOR];
		elegirPokemonesJugador();
		elegirPokemonesEnemigo();
		batallar();
		Util.s.close();
	}
	
	
	private static void batallar() {
		System.out.println("La batalla entre " + personajes[JUGADOR].getNombre() + " y " + personajes[ENEMIGO].getNombre()
				+ " va a comenzar");
		System.out.println("Equipo de " + personajes[JUGADOR].getNombre() + ":");
		personajes[JUGADOR].mostrarEquipo();
		System.out.println("Equipo de " + personajes[ENEMIGO].getNombre() + ":");
		personajes[ENEMIGO].mostrarEquipo();
		
		boolean finPelea = false;
		int turno = Util.r.nextInt(2);
		
		System.out.println("El primer turno es de " + (turno == 0?  personajes[JUGADOR].getNombre() :  personajes[ENEMIGO].getNombre() ));
		
        do{
           personajes[turno].mostrarDatosPokemonElegido();	
           personajes[turno].ejecutarAtaque(personajes[cambiarTurno(turno)].getPokemonRival());	
           personajes[cambiarTurno(turno)].comprobarVidaPokemon();
           finPelea = personajes[cambiarTurno(turno)].comprobarDerrota();
           turno = cambiarTurno(turno);
        }while(!finPelea);
        
        System.out.println("El jugador " + (personajes[JUGADOR].comprobarDerrota() == true? personajes[ENEMIGO].getNombre()
        		: personajes[JUGADOR].getNombre()) +  " ha ganado");
        
	}
	
	private static int cambiarTurno(int turno) {
		return (turno + 1) % 2;
	}
	
	
	private static void elegirPokemonesJugador() {
		int opc;
		Pokemon pokemonElegido;
		System.out.println("Elija sus pokemones");
		
		for(int i = 0; i < personajes[JUGADOR].getCantMaxPokemones(); i++) {
			System.out.println("Pokemon " + (i + 1) + ":");
			mostrarPokemones();
			opc = Util.ingresarEntero(1, PokemonDisponible.values().length);
			pokemonElegido = anadirPokemones(opc);
			personajes[JUGADOR].anadirPokemones(pokemonElegido);
			
		}
	}

	private static void crearJugadorYEnemigo() {
		System.out.println("Bienvenido a un simulador de pelea pedorro de Pokemon");
		System.out.println("Introduzca su nombre");
		String nombreJugador = Util.s.nextLine();
		personajes[JUGADOR] = new Jugador(nombreJugador);
		personajes[ENEMIGO] = new Enemigo();
	}
	
	private static void mostrarPokemones() {
		for(int i = 0; i < PokemonDisponible.values().length; i++) {
			System.out.println(PokemonDisponible.values()[i].getNombre());
		}
	}
	
	private static void elegirPokemonesEnemigo() {
		Pokemon pokemonElegido;
		System.out.println("Turno del enemigo de elegir sus pokemones");
		for(int i = 0; i < personajes[ENEMIGO].getCantMaxPokemones(); i++) {
		int opcEnemigo = Util.r.nextInt(PokemonDisponible.values().length) + 1;
		pokemonElegido =anadirPokemones(opcEnemigo);
		personajes[ENEMIGO].anadirPokemones(pokemonElegido);
		}
		System.out.println("El enemigo ya eligio a sus pokemones");
		}
	
	private static Pokemon anadirPokemones(int opc) {
		Pokemon pokemonElegido = new Pikachu();
		
		switch(opc) {
		
		case 1:
			pokemonElegido = new Pikachu();
			break;
		case 2:
			pokemonElegido = new Charmander();
			break;
		case 3:
			pokemonElegido = new Bulbasaur();
			break;
		case 4:
			pokemonElegido = new Squirtle();
			break;
			
		}
		
		return pokemonElegido;
	}
}
