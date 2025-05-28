package pokemons;

import ataques.Ataque;
import ataques.Grunido;
import ataques.Impactrueno;
import ataques.Latigo;
import ataques.OndaTrueno;

public class Pikachu extends PokemonBase {

    public Pikachu(){
    	 super("Pikachu", new TipoPokemon[] {TipoPokemon.ELECTRICO}, 800, new Ataque[] {new Latigo(), new Impactrueno(), new Grunido(), new OndaTrueno()});
    
    }

}
