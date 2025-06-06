package ataques;

import efectos.EfectoSecundario;
import efectos.TipoEfectoEstadistica;
import pokemones.PokemonTipo;

public class Grunido extends Ataque{

	public Grunido() {
		super(0, "Grunido", 100, 20, new EfectoSecundario(100, 1, 4, 1, 15, TipoEfectoEstadistica.ATAQUE), PokemonTipo.VENENO);
	}
}
