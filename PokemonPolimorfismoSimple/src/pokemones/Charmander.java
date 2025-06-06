package pokemones;

import ataques.AlientoFuego;
import ataques.Ataque;
import ataques.BolaFuego;
import ataques.BolaRayo;
import ataques.Grunido;
import ataques.Impactrueno;
import ataques.PatadaIgnea;

public class Charmander extends Pokemon{
	
	public Charmander() {
		super("Charmander", 550, new PokemonTipo[] {PokemonTipo.FUEGO}, new Ataque[] {new BolaFuego(), new AlientoFuego(), new 
				PatadaIgnea()});
	}

}
