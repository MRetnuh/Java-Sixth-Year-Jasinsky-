package pokemons;

import ataques.Ataque;
import ataques.Burbuja;
import ataques.Latigo;
import ataques.PistolaDeAgua;
import ataques.Placaje;
import ataques.RayoBurbuja;

public class Squirtle extends PokemonBase {
    public Squirtle() {  
    	super("Squirtle", new TipoPokemon[] {TipoPokemon.AGUA}, 720, new Ataque[]{new Placaje(), new Latigo(), new Burbuja(), new PistolaDeAgua()});
    }

}
