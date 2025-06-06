package pokemones;

public enum PokemonTipo {
AGUA("Agua"),
FUEGO("Fuego"),
VENENO("Veneno"),
PLANTA("Planta"),
ELECTRICO("Electrico");
	private PokemonTipo[] efectivoContra;
	private PokemonTipo[] pocoEfectivoContra;
	
	static {
		AGUA.efectivoContra = new PokemonTipo[] {FUEGO};
		AGUA.pocoEfectivoContra = new PokemonTipo[] {ELECTRICO, AGUA};
		
		FUEGO.efectivoContra = new PokemonTipo[] {PLANTA, VENENO};
		FUEGO.pocoEfectivoContra = new PokemonTipo[] {FUEGO, AGUA};
		
		VENENO.efectivoContra = new PokemonTipo[] {ELECTRICO, PLANTA};
		VENENO.pocoEfectivoContra = new PokemonTipo[] {VENENO, FUEGO};
		
		PLANTA.efectivoContra = new PokemonTipo[] {AGUA};
		PLANTA.pocoEfectivoContra = new PokemonTipo[] {FUEGO, PLANTA, VENENO};
		
		ELECTRICO.efectivoContra = new PokemonTipo[] {AGUA};
		ELECTRICO.pocoEfectivoContra = new PokemonTipo[] {ELECTRICO, VENENO};
	}
	private String tipo;
	
    PokemonTipo(String tipo) {
		this.tipo = tipo;
	}
    
    public float aumentarDanioAtaque(PokemonTipo tipoPokemonEnemigo) {
    	boolean esEfectivo = comprobarTipo(tipoPokemonEnemigo,this.efectivoContra);
    	boolean esPocoEfectivo = comprobarTipo(tipoPokemonEnemigo,this.efectivoContra);
    	
    	if(esEfectivo) {
    		return 2f;
    	}
    	if(esPocoEfectivo) {
    		return 0.5f;
    	}
    	return 1f;
    }
	
    public boolean comprobarTipo(PokemonTipo tipoPokemonEnemigo, PokemonTipo tipoAtaque[]) {
    	int i = 0;
    	boolean encontrado = false;
    	while(i < tipoAtaque.length && !encontrado) {
    		if(tipoPokemonEnemigo.equals(tipoAtaque[i])) {
    			encontrado = true;
    		}
    	i++;
    	}
    	return encontrado;
    }
    
	public String getTipo() {
		return this.tipo;
	}
	
}
