package pokemons;

public enum TipoPokemon {

    AGUA,
    FUEGO,
    PLANTA,
    ELECTRICO,
    VENENO,
    NORMAL,
    NINGUNO;

    private TipoPokemon efectivoContra;
   public TipoPokemon getTipoPokemonVentaja() {
	   return this.efectivoContra;
   }
    static {
        AGUA.efectivoContra = FUEGO;
        FUEGO.efectivoContra = PLANTA;
        PLANTA.efectivoContra = AGUA;
        ELECTRICO.efectivoContra = VENENO;
        VENENO.efectivoContra = NORMAL;
        NORMAL.efectivoContra = ELECTRICO;
        NINGUNO.efectivoContra = NINGUNO;
    }


}