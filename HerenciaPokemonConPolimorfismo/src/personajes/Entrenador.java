package personajes;



import pokemons.PokemonBase;
import utilidades.Utiles;

public abstract class Entrenador {
	private String nombre;
    private final int CANTMAXPOKEMONES = 3;
    protected PokemonBase[] pokemones = new PokemonBase[3];
    private int pokemonesElegidos = 0;
    private int pokemonesDerrotados = 0;
    private boolean derrota = false;
    protected int pokemonElegido = 0;
    public Entrenador(String nombre) {
        this.nombre = nombre;
    }
    
    public void asignarPokemon(PokemonBase pokemon) {
        this.pokemones[pokemonesElegidos] = pokemon;
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
        if(this.pokemonesDerrotados == 3) {
        	this.derrota = true;
        }
        return this.derrota;
    }
    public void perderPokemon() {
    	if(this.pokemones[this.pokemonElegido].getVida() <= 0) {
    	 System.out.println("El pokemon " + this.pokemones[pokemonElegido].getNombre() + " ha sido culeado");
    	 if(this.pokemonElegido <= this.CANTMAXPOKEMONES - 1) {
    	 this.pokemonElegido++;
    	 }
    	 this.pokemonesDerrotados++;
    	}
    	 
    }
}


