import personajes.Enemigo;
import personajes.Entrenador;
import personajes.Jugador;
import pokemons.*;
import utilidades.Utiles;

public class Principal {
private static  Jugador jugador;
private static Enemigo enemigo;
    public static void main(String[] args) {
    	crearJugagorYEnemigo();
        System.out.println("Bienvenidos al laboratorio del profesor Oak");
        elegirPokemones();
        jugador.mostrarEquipo();
        enemigo.mostrarEquipo();
        batallar();


    }
	private static void elegirPokemones() {
		System.out.println("Con cuantos pokemones desea jugar (maximo " + jugador.getCantMaxPokemones() + ")?");
        int opcCantPokemones = Utiles.ingresarEntero(1, jugador.getCantMaxPokemones());
        for (int i = 0; i < opcCantPokemones; i++) {
            System.out.println("Elija el pokemon " + (i+1));
            mostrarPokemones();
            int opcPokemon = Utiles.ingresarEntero(1,Pokemon.values().length);
            PokemonBase pokemonElegido = crearPokemon(opcPokemon);
            jugador.asignarPokemon(pokemonElegido);
        }

        System.out.println(enemigo.getNombre() + " elegirá sus pokemones");
        for (int i = 0; i < enemigo.getCantMaxPokemones(); i++) {
        	 int nroPokemonAzar = Utiles.r.nextInt(Pokemon.values().length) + 1;
            PokemonBase pokemonAzar = crearPokemon(nroPokemonAzar);
            enemigo.asignarPokemon(pokemonAzar);
        }

        System.out.println("Los entrenadores han elegido sus pokemones");
	}
    private static void batallar() {
    	 System.out.println("La pelea va a comenzar");
    	 boolean finPelea = false;
    	 int turno =  Utiles.r.nextInt(2);
    	 enemigo.elegirPokemon();
    	 System.out.println("Empieza el jugador " + (turno == 0? jugador.getNombre() : enemigo.getNombre()));
    	 do {
    		 if(turno == 0) {
    			 jugador.mostrarEquipo();
    			 System.out.println("Pokemon del enemigo: ");
    			 enemigo.mostrarNombrePokemonElegido();
    			 jugador.elegirPokemon();
    			 jugador.infligirDanio(enemigo);
    			 turno = 1;
                 finPelea = enemigo.comprobarDerrota();
    		 }else {
    			 enemigo.mostrarEquipo();
    			 System.out.println("El jugador " + enemigo.getNombre() + " eligio a: ");
    			 enemigo.mostrarNombrePokemonElegido();
    			 enemigo.infligirDanio(jugador);
    			 turno = 0;
                 finPelea = jugador.comprobarDerrota();
    		 }
    	 }while(!finPelea);
    	 System.out.println("El jugador " + (jugador.comprobarDerrota() == false? jugador.getNombre() : enemigo.getNombre() + " ha ganado la pelea"));
    }

    private static void mostrarPokemones() {
        for (int i = 0; i < Pokemon.values().length; i++) {
            System.out.println(i+1 + ". " + Pokemon.values()[i].getNombre());
        }
    }
 private static void crearJugagorYEnemigo() {
	   System.out.println("Bienvenido al mundo Pokemon");
       System.out.println("Ingrese su nombre");
       String nombre = Utiles.s.nextLine();

       jugador = new Jugador(nombre);
       enemigo = new Enemigo();
   	System.out.println("Tu adversario sera " + enemigo.getNombre());
 }
    public static PokemonBase crearPokemon(int nroPokemon){
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