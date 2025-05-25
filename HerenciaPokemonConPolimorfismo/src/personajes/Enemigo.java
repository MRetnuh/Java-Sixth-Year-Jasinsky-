package personajes;

import utilidades.Utiles;

public class Enemigo extends Entrenador {
    public Enemigo() {
        super("Gary Oak");
    }
    public void elegirPokemon() {
      super.pokemonElegido = Utiles.r.nextInt(super.pokemones.size());
        }
    public void mostrarNombrePokemonElegido() {
    	super.pokemones.get(pokemonElegido).mostrarDatos();
    }
    public void infligirDanio(Jugador jugador) {
    	int danio = 0;
    	int indiceTipoPokemonEnemigo = 0;
    	int indiceTipoPokemonJugador = 0;
    	int indicePokemonJugador = jugador.getPokemonElegido();
    	int opcAtaque = Utiles.r.nextInt(this.pokemones.get(this.pokemonElegido).getCantAtaques());
    	int ataqueErrado = Utiles.r.nextInt(100) + 1;
    	if(ataqueErrado > super.pokemones.get(this.pokemonElegido).getPrecisionAtaque(opcAtaque)) {
    		  System.out.println("El pokemon erro el ataque");
    	}
    	else {
    		 danio = super.pokemones.get(this.pokemonElegido).getDanioAtaqueElegido(opcAtaque);
    		while(indiceTipoPokemonEnemigo < super.pokemones.get(this.pokemonElegido).getCantTipos()) {
    			while(indiceTipoPokemonJugador < jugador.pokemones.get(indicePokemonJugador).getCantTipos()) {
    				 if((jugador.pokemones.get(indicePokemonJugador).getTipo(indiceTipoPokemonJugador) == super.pokemones.get(this.pokemonElegido).getTipo(indiceTipoPokemonEnemigo).getTipoPokemonVentaja())){
    				 danio += (float)danio *0.50; 
    				 System.out.println("El ataque fue mas efectivo debido al tipo de pokemon");
    				 }
    				 else if(super.pokemones.get(this.pokemonElegido).getTipo(indiceTipoPokemonEnemigo) == jugador.pokemones.get(indicePokemonJugador).getTipo(indiceTipoPokemonJugador).getTipoPokemonVentaja()) {
    					 System.out.println("El ataque fue poco efectivo debido al tipo de pokemon");
 						danio -= (float)danio *0.50;  
    				 }
    				 indiceTipoPokemonJugador++;
    				 }
    			indiceTipoPokemonEnemigo++;
    		}
    	   jugador.pokemones.get(indicePokemonJugador).quitarVida(danio);
    	   System.out.println(super.pokemones.get(this.pokemonElegido).getNombre() + " ha usado " + 
    	   super.pokemones.get(this.pokemonElegido).getNombreAtaqueUsado(opcAtaque) + " y su danio fue " +
    	   danio);
    	   jugador.perderPokemon(indicePokemonJugador);
    	}
}

}