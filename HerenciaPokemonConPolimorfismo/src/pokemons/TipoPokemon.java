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
    private TipoPokemon pocoEfectivoContra;

    static {
        AGUA.efectivoContra = FUEGO;
        FUEGO.efectivoContra = AGUA;
        PLANTA.efectivoContra = AGUA;
        ELECTRICO.efectivoContra = VENENO;
        VENENO.efectivoContra = NORMAL;
        NORMAL.efectivoContra = ELECTRICO;
        NINGUNO.efectivoContra = NINGUNO;
    }


}