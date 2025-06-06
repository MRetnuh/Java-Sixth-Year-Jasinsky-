package pokemones;

import ataques.Ataque;
import ataques.BolaRayo;
import ataques.Grunido;
import ataques.Impactrueno;

public class Pikachu extends Pokemon{
	
	public Pikachu() {
		super("Pikachu", 650, new PokemonTipo[] {PokemonTipo.ELECTRICO}, new Ataque[] {new BolaRayo(), new Impactrueno(), new 
				Grunido()});
	}

}
