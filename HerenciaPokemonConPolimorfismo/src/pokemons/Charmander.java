package pokemons;

import ataques.Ascuas;
import ataques.Ataque;
import ataques.Fortaleza;

public class Charmander extends PokemonBase {
private Ataque ascuas, fortaleza;
    public Charmander() {
        super("Charmander", TipoPokemon.FUEGO, 750);
        this.ascuas = new Ascuas();
        this.fortaleza = new Fortaleza();
        super.ataques.add(ascuas);
        super.ataques.add(fortaleza);
    }

}
