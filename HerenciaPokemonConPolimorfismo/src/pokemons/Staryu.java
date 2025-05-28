package pokemons;

import ataques.Ataque;
import ataques.Constriccion;
import ataques.Fortaleza;
import ataques.Latigo;
import ataques.PistolaDeAgua;
import ataques.Placaje;
import ataques.RayoBurbuja;

public class Staryu extends PokemonBase {
    public Staryu(){
    	  super("Staryu", new TipoPokemon[] {TipoPokemon.AGUA} ,650, new Ataque[] {new Placaje(), new Fortaleza(), new PistolaDeAgua(), new RayoBurbuja()});
    }

}
