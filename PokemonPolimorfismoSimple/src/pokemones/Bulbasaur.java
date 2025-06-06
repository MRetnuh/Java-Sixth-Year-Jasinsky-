package pokemones;

import ataques.Ataque;
import ataques.BolaRayo;
import ataques.Grunido;
import ataques.Impactrueno;
import ataques.LatigoCepa;
import ataques.Marihuanazo;

public class Bulbasaur extends Pokemon{
	
	public Bulbasaur() {
		super("Bulbasaur", 800, new PokemonTipo[] {PokemonTipo.PLANTA, PokemonTipo.VENENO}, new Ataque[] {new Marihuanazo(), new LatigoCepa(), new 
				Grunido()});
	}

}
