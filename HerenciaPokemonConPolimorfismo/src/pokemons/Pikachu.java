package pokemons;

import ataques.Ataque;
import ataques.Grunido;
import ataques.Impactrueno;
import ataques.Latigo;
import ataques.OndaTrueno;

public class Pikachu extends PokemonBase {
private Ataque latigo, impactrueno, grunido, ondaTrueno;

    public Pikachu(){
        super("Pikachu", 770);
        this.latigo = new Latigo();
        this.impactrueno = new Impactrueno();
        this.grunido = new Grunido();
        this.ondaTrueno = new OndaTrueno();
        super.ataques.add(latigo);
        super.ataques.add(impactrueno);
        super.ataques.add(grunido);
        super.ataques.add(ondaTrueno);
        super.tipoPokemon.add(TipoPokemon.ELECTRICO);
    }

}
