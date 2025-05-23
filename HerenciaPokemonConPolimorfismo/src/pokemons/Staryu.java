package pokemons;

import ataques.Ataque;
import ataques.Constriccion;
import ataques.Latigo;

public class Staryu extends PokemonBase {
private Ataque latigo, constriccion;
    public Staryu(){
        super("Staryu", TipoPokemon.AGUA,650);
        this.latigo = new Latigo();
        this.constriccion = new Constriccion();
        super.ataques.add(latigo);
        super.ataques.add(constriccion);
    }

}
