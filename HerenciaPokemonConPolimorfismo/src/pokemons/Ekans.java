package pokemons;

import ataques.Ataque;
import ataques.Constriccion;
import ataques.Malicioso;
import ataques.Mordisco;
import ataques.PantallaDeHumo;
import ataques.PolvoVenenoso;

public class Ekans extends PokemonBase {
    public Ekans(){
    	   super("Ekans", new TipoPokemon[] {TipoPokemon.VENENO}, 770, new Ataque[] {new Constriccion(), new Malicioso(), new PolvoVenenoso(), new Mordisco()});
    }

}
