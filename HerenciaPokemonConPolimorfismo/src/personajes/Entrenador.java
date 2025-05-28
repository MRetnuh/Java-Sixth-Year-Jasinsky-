package personajes;



import pokemons.PokemonBase;
import utilidades.Utiles;

public abstract class Entrenador {
	private String nombre;
    private final int CANTMAXPOKEMONES = 3;
    protected PokemonBase[] pokemones = new PokemonBase[3];
    protected PokemonBase[] pokemonesRestantes = new PokemonBase[3];
    private int pokemonesElegidos = 0;
    private boolean derrota = false;
    protected int pokemonElegido = 0;
    public Entrenador(String nombre) {
        this.nombre = nombre;
    }
    
    public void elegirPokemon() {
        System.out.println("Elija su pokemon para atacar");
        for(int i = 0; i < this.pokemones.length; i++) {
        	this.pokemones[i].mostrarDatos();
        }
         this.pokemonElegido = Utiles.ingresarEntero(1, this.pokemones.length) - 1;
         this.pokemones[pokemonElegido].getNombre();
        }
    
    public void asignarPokemon(PokemonBase pokemon) {
        this.pokemones[pokemonesElegidos] = pokemon;
        this.pokemonesRestantes[pokemonesElegidos] = pokemon;
        this.pokemonesElegidos++;
    }

    public void mostrarEquipo(){
        System.out.println("Equipo de " + this.nombre);
        for(int i = 0; i < this.pokemones.length; i++) {
            System.out.println((i+1) + " " + this.pokemones[i].getNombre());
        }
    }
    public void mostrarNombrePokemonElegido() {
    	this.pokemones[pokemonElegido].mostrarDatos();
    }
    public PokemonBase getPokemonElegido() {
    	return this.pokemones[pokemonElegido];
    }
    public String getNombre() {
        return this.nombre;
    }
    public int elegirAtaque() {
    	int opcAtaque = -1;
    	int cantUsos;
    	boolean ataqueValido = true;
    	boolean tieneAtaques = true;
    	do {
    		ataqueValido = true;
        System.out.println("Elija su ataque:");
        this.pokemones[pokemonElegido].mostrarAtaques();
    	opcAtaque = Utiles.ingresarEntero(1, this.pokemones[pokemonElegido].getCantAtaques())- 1;
    	cantUsos =  this.pokemones[pokemonElegido].getCantUsosAtaqueElegido(opcAtaque);
    	if(cantUsos != 0) {
        this.pokemones[this.pokemonElegido].reducirCantAtaqueElegido(opcAtaque);
    	int ataqueErrado = Utiles.r.nextInt(100) + 1;
    	if(ataqueErrado >  this.pokemones[pokemonElegido].getPrecisionAtaque(opcAtaque)) {
    		  opcAtaque = -1;
    	}
    	}
    	else {
    		tieneAtaques = this.pokemones[this.pokemonElegido].verificarUsosAtaques();
       	 System.out.println("El ataque que seleccionó no puede ser utilizado");
            System.out.println("Vuelva a ingresar el ataque que desea ejecutar");
            ataqueValido = false;
       	}
       }while(!ataqueValido && tieneAtaques);
    	 return opcAtaque;
    }
    public void efectuarAtaque(PokemonBase pokemonEnemigo) {
    	int ataqueElegido = elegirAtaque();
    	this.pokemones[this.pokemonElegido].atacar(ataqueElegido, pokemonEnemigo);
    }
    public int getCantMaxPokemones(){
        return this.CANTMAXPOKEMONES;
    }
    public boolean comprobarDerrota() {
        if(this.pokemones.length <= 0) {
        	this.derrota = true;
        }
        return this.derrota;
    }
    public void perderPokemon(int opcPokemon) {
    	if(this.pokemones[opcPokemon].getVida() <= 0) {
    	 System.out.println("El pokemon " + this.pokemones[opcPokemon].getNombre() + " ha sido culeado");
    	 this.pokemonElegido = 0;
    	}
    	 
    }
}


