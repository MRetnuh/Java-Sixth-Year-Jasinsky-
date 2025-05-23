package pokemons;

import ataques.Ataque;
import ataques.Grunido;
import ataques.LatigoCepa;
import ataques.Placaje;
import ataques.PolvoVenenoso;

public class Bulbasaur extends PokemonBase {
private Ataque placaje, grunido, latigoCepa, polvoVenenoso;

    public Bulbasaur(){
        super("Bulbasaur", TipoPokemon.PLANTA, 850);
        this.placaje = new Placaje();
        this.grunido = new Grunido();
        this.latigoCepa = new LatigoCepa();
        this.polvoVenenoso = new PolvoVenenoso();
        super.ataques.add(placaje);
        super.ataques.add(grunido);
        super.ataques.add(latigoCepa);
        super.ataques.add(polvoVenenoso);

}
}
