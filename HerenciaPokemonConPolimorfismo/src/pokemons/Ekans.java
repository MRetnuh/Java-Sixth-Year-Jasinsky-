package pokemons;

import ataques.Ataque;
import ataques.Malicioso;
import ataques.Mordisco;
import ataques.PantallaDeHumo;

public class Ekans extends PokemonBase {
private Ataque pantallaDeHumo, mordisco, malicioso;
    public Ekans(){
        super("Ekans", 770);
        this.pantallaDeHumo = new PantallaDeHumo();
        this.mordisco = new Mordisco();
        this.malicioso = new Malicioso();
        super.ataques.add(pantallaDeHumo);
        super.ataques.add(mordisco);
        super.ataques.add(malicioso);
        super.tipoPokemon.add(TipoPokemon.VENENO);
    }

}
