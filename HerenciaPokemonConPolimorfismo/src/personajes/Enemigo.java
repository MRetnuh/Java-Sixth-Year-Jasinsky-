package personajes;

import utilidades.Utiles;

public class Enemigo extends Entrenador {
private int pokemonElegido;
    public Enemigo() {
        super("Gary Oak");
    }
    public void elegirPokemon() {
    	this.pokemonElegido = Utiles.r.nextInt(super.pokemones.size());
        }
    public void mostrarNombrePokemonElegido() {
    	super.pokemones.get(pokemonElegido).mostrarDatos();
    }
    public int getPokemonElegido() {
    	return this.pokemonElegido;
    }
    public void infligirDanio(Jugador jugador) {
    	int danio;
    	int indicePokemonJugador = jugador.getPokemonElegido();
    	int opcAtaque = Utiles.r.nextInt(this.pokemones.get(this.pokemonElegido).getCantAtaques());
    	int ataqueErrado = Utiles.r.nextInt(100) + 1;
    	if(ataqueErrado > super.pokemones.get(this.pokemonElegido).getPrecisionAtaque(opcAtaque)) {
    		  System.out.println("El pokemon erro el ataque");
    	}
    	else {
    	   danio = super.pokemones.get(this.pokemonElegido).getDanioAtaqueElegido(opcAtaque);
    	   jugador.pokemones.get(indicePokemonJugador).quitarVida(danio);
    	   System.out.println(super.pokemones.get(this.pokemonElegido).getNombre() + " ha usado " + 
    	   super.pokemones.get(this.pokemonElegido).getNombreAtaqueUsado(opcAtaque) + " y su danio fue " +
    	   super.pokemones.get(this.pokemonElegido).getDanioAtaqueElegido(opcAtaque));
    	}
}

}