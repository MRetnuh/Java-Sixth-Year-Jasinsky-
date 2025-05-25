package personajes;

import utilidades.Utiles;

public class Jugador extends Entrenador {
    public Jugador(String nombre) {
        super(nombre);
    }
    public void elegirPokemon() {
    System.out.println("Elija su pokemon para atacar");
    for(int i = 0; i < super.pokemones.size(); i++) {
    	super.pokemones.get(i).mostrarDatos();
    }
     super.pokemonElegido = Utiles.ingresarEntero(1, super.pokemones.size()) - 1;
     super.pokemones.get(pokemonElegido).getNombre();
    }
    public void infligirDanio(Enemigo enemigo) {
        int indiceTipoPokemonEnemigo = 0;
    	int indiceTipoPokemonJugador = 0;
    	int danio = 0;
    	int cantUsos;
    	boolean ataqueValido = true;
    	do {
    		ataqueValido = true;
        System.out.println("Elija su ataque:");
        super.pokemones.get(pokemonElegido).mostrarAtaques();
    	int opcAtaque = Utiles.ingresarEntero(1, super.pokemones.get(pokemonElegido).getCantAtaques())- 1;
    	cantUsos = super.pokemones.get(pokemonElegido).getCantUsosAtaqueElegido(opcAtaque);
    	if(cantUsos != 0) {
    	int ataqueErrado = Utiles.r.nextInt(100) + 1;
    	if(ataqueErrado > super.pokemones.get(pokemonElegido).getPrecisionAtaque(opcAtaque)) {
    		  System.out.println("El pokemon erro el ataque");
    	}
    	else {
    		 danio = super.pokemones.get(pokemonElegido).getDanioAtaqueElegido(opcAtaque);
    		while(indiceTipoPokemonJugador < super.pokemones.get(pokemonElegido).getCantTipos()) {
    			while(indiceTipoPokemonEnemigo < enemigo.pokemones.get(enemigo.getPokemonElegido()).getCantTipos()) {
    				 if(enemigo.pokemones.get(enemigo.getPokemonElegido()).getTipo(indiceTipoPokemonEnemigo) == super.pokemones.get(this.pokemonElegido).getTipo(indiceTipoPokemonJugador).getTipoPokemonVentaja()) {
    					danio += (float)danio *0.50; 
    					 System.out.println("El ataque fue mas efectivo debido al tipo de pokemon");
    				 }
    				 else if((enemigo.pokemones.get(enemigo.getPokemonElegido()).getTipo(indiceTipoPokemonEnemigo).getTipoPokemonVentaja() == super.pokemones.get(this.pokemonElegido).getTipo(indiceTipoPokemonJugador))) {
    					 System.out.println("El ataque fue poco efectivo debido al tipo de pokemon");
    						danio -= (float)danio *0.50; 
    				 }
    				 indiceTipoPokemonEnemigo++;
    			}
    			indiceTipoPokemonJugador++;
    			}
    	   enemigo.pokemones.get(enemigo.getPokemonElegido()).quitarVida(danio);
    	   System.out.println(super.pokemones.get(pokemonElegido).getNombre() + " ha usado " + 
    	   super.pokemones.get(pokemonElegido).getNombreAtaqueUsado(opcAtaque) + " y su danio fue " + danio);
    	}
    	 
         super.pokemones.get(pokemonElegido).reducirCantAtaqueElegido(opcAtaque);
         enemigo.perderPokemon(enemigo.getPokemonElegido());
    	}
    	else {
    	 System.out.println("El ataque que seleccionó no puede ser utilizado");
         System.out.println("Vuelva a ingresar el ataque que desea ejecutar");
         ataqueValido = false;
    	}
    }while(!ataqueValido);
    }
}