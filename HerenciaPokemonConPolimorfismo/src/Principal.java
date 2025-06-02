import personajes.Enemigo;
import personajes.Entrenador;
import personajes.Jugador;
import pokemons.*;
import utilidades.Utiles;

public class Principal {
	private static final int JUGADOR =0, ENEMIGO=1;
	   private static Entrenador[] jugadores = new Entrenador[2];
    public static void main(String[] args) {
    	crearJugadorYEnemigo();
        System.out.println("Bienvenidos al laboratorio del profesor Oak");
        elegirPokemones();
        jugadores[JUGADOR].mostrarEquipo();
        jugadores[ENEMIGO].mostrarEquipo();
        batallar();
       Utiles.s.close();

    }
	private static void elegirPokemones() {
        for (int i = 0; i < jugadores[JUGADOR].getCantMaxPokemones(); i++) {
            System.out.println("Elija el pokemon " + (i+1));
            mostrarPokemones();
            int opcPokemon = Utiles.ingresarEntero(1,Pokemon.values().length);
            PokemonBase pokemonElegido = crearPokemon(opcPokemon);
            jugadores[JUGADOR].asignarPokemon(pokemonElegido);
        }

        System.out.println(jugadores[ENEMIGO].getNombre() + " elegirá sus pokemones");
        for (int i = 0; i <  jugadores[ENEMIGO].getCantMaxPokemones(); i++) {
        	 int nroPokemonAzar = Utiles.r.nextInt(Pokemon.values().length) + 1;
            PokemonBase pokemonAzar = crearPokemon(nroPokemonAzar);
            jugadores[ENEMIGO].asignarPokemon(pokemonAzar);
        }

        System.out.println("Los entrenadores han elegido sus pokemones");
	}
    private static void batallar() {
    	 System.out.println("La pelea va a comenzar");
    	 boolean finPelea = false;
    	 int turno =  Utiles.r.nextInt(2);
    	 System.out.println("Empieza el jugador " + jugadores[turno].getNombre());
    	 
    	 
    	 do {    
    		     jugadores[turno].mostrarEquipo();
    			 System.out.println("Pokemon de " + jugadores[cambiarTurno(turno)].getNombre() + ": ");
    			 jugadores[cambiarTurno(turno)].mostrarNombrePokemonElegido();
    			 
    			 System.out.println();
    			 
    			 jugadores[turno].mostrarNombrePokemonElegido();
    			 jugadores[turno].efectuarAtaque(jugadores[cambiarTurno(turno)].getPokemonElegido());
    			 jugadores[cambiarTurno(turno)].perderPokemon();
    			 finPelea = jugadores[cambiarTurno(turno)].comprobarDerrota();
    			 
    			 turno = cambiarTurno(turno);
    	 }while(!finPelea);
    	 
    	 System.out.println("El jugador " + (jugadores[JUGADOR].comprobarDerrota() == false? jugadores[JUGADOR].getNombre() : jugadores[ENEMIGO].getNombre()) + " ha ganado la pelea");
    }
    
    
    private static int cambiarTurno(int turno) {
        return (turno+1)%2;
    }
    
    private static void mostrarPokemones() {
        for (int i = 0; i < Pokemon.values().length; i++) {
            System.out.println(i+1 + ". " + Pokemon.values()[i].getNombre());
        }
    }
    
 private static void crearJugadorYEnemigo() {
	   System.out.println("Bienvenido al mundo Pokemon");
       System.out.println("Ingrese su nombre");
       String nombre = Utiles.s.nextLine();

       jugadores[JUGADOR] = new Jugador(nombre);
       jugadores[ENEMIGO] = new Enemigo();
       
   	System.out.println("Tu adversario sera " +  jugadores[ENEMIGO].getNombre());
 }
 
    private static PokemonBase crearPokemon(int nroPokemon){
        PokemonBase pokemonElegido = new Pikachu();
        switch(nroPokemon) {
            case 1:
                pokemonElegido = new Pikachu();
                break;
            case 2:
                pokemonElegido = new Bulbasaur();
                break;
            case 3:
                pokemonElegido = new Charmander();
                break;
            case 4:
                pokemonElegido = new Ekans();
                break;
            case 5:
                pokemonElegido = new Squirtle();
                break;
            case 6:
                pokemonElegido = new Staryu();
                break;
        }
         return pokemonElegido;
    }


}