package pokemones;

import ataques.Ataque;
import ataques.BolaRayo;
import ataques.CumAcuatico;
import ataques.EscupitajoHumedo;
import ataques.Grunido;
import ataques.Impactrueno;
import ataques.PistolaAgua;

public class Squirtle extends Pokemon{
	
	public Squirtle() {
		super("Squirtle", 600, new PokemonTipo[] {PokemonTipo.AGUA}, new Ataque[] {new CumAcuatico(), new EscupitajoHumedo(), new 
				PistolaAgua()});
	}

}
