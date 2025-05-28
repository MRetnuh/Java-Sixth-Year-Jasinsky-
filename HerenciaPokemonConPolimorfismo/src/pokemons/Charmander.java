package pokemons;

import ataques.Araniazo;
import ataques.Ascuas;
import ataques.Ataque;
import ataques.Fortaleza;
import ataques.Grunido;
import ataques.PantallaDeHumo;

public class Charmander extends PokemonBase {
    public Charmander() {
    	 super("Charmander", new TipoPokemon[] {TipoPokemon.FUEGO}, 750, new Ataque[] {new Araniazo(), new Grunido(), new Ascuas(), new PantallaDeHumo()});
    }

}
