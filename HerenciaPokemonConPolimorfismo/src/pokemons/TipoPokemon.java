package pokemons;

public enum TipoPokemon {
    AGUA,
    FUEGO,
    PLANTA,
    ELECTRICO,
    VENENO,
    NORMAL,
    NINGUNO;

	  private TipoPokemon[] superEfectivoContra = new TipoPokemon[0];
	    private TipoPokemon[] pocoEfectivoContra = new TipoPokemon[0];

    static {
        ELECTRICO.superEfectivoContra = new TipoPokemon[] {AGUA};
        ELECTRICO.pocoEfectivoContra = new TipoPokemon[] {ELECTRICO, PLANTA};

        FUEGO.superEfectivoContra = new TipoPokemon[] {PLANTA};
        FUEGO.pocoEfectivoContra = new TipoPokemon[] {FUEGO, AGUA};

        AGUA.superEfectivoContra = new TipoPokemon[] {FUEGO};
        AGUA.pocoEfectivoContra = new TipoPokemon[] {AGUA, PLANTA};

        PLANTA.superEfectivoContra = new TipoPokemon[] {AGUA};
        PLANTA.pocoEfectivoContra = new TipoPokemon[] {PLANTA, FUEGO, VENENO};

        VENENO.superEfectivoContra = new TipoPokemon[] {PLANTA};
        VENENO.pocoEfectivoContra = new TipoPokemon[] {VENENO};
    }

    public float obtenerRatioEfectidad(TipoPokemon tipo) {
        boolean esSuperEfectivo = verificarExistenciaTipo(tipo, this.superEfectivoContra);
        if(esSuperEfectivo){
            return 2;
        }

        boolean esPocoEfectivo = verificarExistenciaTipo(tipo, this.pocoEfectivoContra);
        if(esPocoEfectivo){
            return 0.5f;
        }
        return 1;
    }

    private boolean verificarExistenciaTipo(TipoPokemon tipo, TipoPokemon[] listadoTipos) {
        int i = 0;
        boolean encontrado = false;
        while (i < listadoTipos.length && !encontrado) {
            if(tipo.equals(listadoTipos[i])) {
                encontrado = true;
            }
            i++;
        }
        return encontrado;
    }

}