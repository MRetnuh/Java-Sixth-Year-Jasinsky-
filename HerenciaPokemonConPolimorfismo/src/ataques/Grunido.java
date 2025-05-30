package ataques;

import efectos.ModificacionEstadistica;
import efectos.TipoEstadistica;
import pokemons.TipoPokemon;

public class Grunido extends Ataque {

    public Grunido() {
        super("Grunido", TipoPokemon.NORMAL,0, 100, -1, 
        		new ModificacionEstadistica(
        		TipoEstadistica.ATAQUE, 
        		1, 
        		15,
        		1,
        		4));
    }

}
