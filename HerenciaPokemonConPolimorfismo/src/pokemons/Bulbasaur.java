package pokemons;

import ataques.Araniazo;
import ataques.Ascuas;
import ataques.Ataque;
import ataques.Grunido;
import ataques.LatigoCepa;
import ataques.PantallaDeHumo;
import ataques.Placaje;
import ataques.PolvoVenenoso;

public class Bulbasaur extends PokemonBase {

    public Bulbasaur(){
    	 super("Bulbasaur", new TipoPokemon[] {TipoPokemon.PLANTA, TipoPokemon.VENENO}, 850, new Ataque[] {new Placaje(), new Grunido(), new LatigoCepa(), new PolvoVenenoso()});
}
}
