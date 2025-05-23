package pokemons;

import ataques.Ataque;
import ataques.Burbuja;
import ataques.PistolaDeAgua;
import ataques.RayoBurbuja;

public class Squirtle extends PokemonBase {
private Ataque pistolaDeAgua, rayoBurbuja, burbuja;
    public Squirtle() {
        super("Squirtle", TipoPokemon.AGUA,720);
        this.pistolaDeAgua = new PistolaDeAgua();
        this.rayoBurbuja = new RayoBurbuja();
        this.burbuja = new Burbuja();
        super.ataques.add(pistolaDeAgua);
        super.ataques.add(rayoBurbuja);
        super.ataques.add(burbuja);
    }

}
