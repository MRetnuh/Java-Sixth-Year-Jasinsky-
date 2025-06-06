package personajes;

import pokemones.Pokemon;
import utiles.Util;

public abstract class Personaje {
	private final int CANTMAXPOKEMONES = 2;
	private int pokemonesAnadidos = 0;
	private int pokemonesDerrotados = 0;
	private String nombre;
	
	protected int pokemonElegido = 0;
	protected Pokemon[] pokemones = new Pokemon[2];
	
	public Personaje(String nombre) {
		this.nombre = nombre;
	}
	
	public void anadirPokemones(Pokemon pokemonAnadido) {
		this.pokemones[this.pokemonesAnadidos] = pokemonAnadido;
		this.pokemonesAnadidos++;
	}
	
	public void mostrarDatosPokemonElegido() {
		pokemones[pokemonElegido].mostrarDatos();
	}
	
	public void mostrarEquipo() {
		for(int i = 0; i < this.CANTMAXPOKEMONES; i++) {
			System.out.println(pokemones[i].getNombre());
		}
	}

	public int elegirAtaque() {
		System.out.println("Ataques: ");
		int opc;
		boolean ataqueValido = true;
		int cantUsosAtaqueElegido;
		System.out.println("Elija su ataque: ");
		do {
        ataqueValido = true;		
		this.pokemones[pokemonElegido].mostrarAtaquesPokemonElegido();
		opc = Util.ingresarEntero(1, this.pokemones[this.pokemonElegido].getCantMaxAtaques()) - 1;
		cantUsosAtaqueElegido = this.pokemones[this.pokemonElegido].getCantUsosAtaqueElegido(opc);
		
		if(cantUsosAtaqueElegido != 0) {
			this.pokemones[this.pokemonElegido].restarCantUsos(opc);
		}
		
		else {
			System.out.println("Se acabaron los usos de este ataque");
			System.out.println("Elija otro");
            ataqueValido = false;
		}
		
		}while(!ataqueValido);
		
		return opc;
	}
	
	public void ejecutarAtaque(Pokemon pokemonEnemigo) {
		int ataqueElegido = elegirAtaque();
		this.pokemones[this.pokemonElegido].atacar(ataqueElegido, pokemonEnemigo);
	}
	
	public void comprobarVidaPokemon() {
		if(this.pokemones[this.pokemonElegido].getVida() <= 0) {
			System.out.println("El pokemon " + this.pokemones[this.pokemonElegido].getNombre() + " ha sido culeado");
			if(this.pokemonElegido <= this.CANTMAXPOKEMONES - 1) {
				this.pokemonElegido++;
			}
			this.pokemonesDerrotados++;
		}
	}
	
	public boolean comprobarDerrota() {
		if(this.pokemonesDerrotados == this.CANTMAXPOKEMONES) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void activarCheat() {
		System.out.println("Cheat activado");
		this.pokemones[this.pokemonElegido].aumentarVida();
	}
	
	public Pokemon getPokemonRival() {
		return this.pokemones[this.pokemonElegido];
	}
	
	public int getCantMaxPokemones() {
		return this.CANTMAXPOKEMONES;
	}
	
	public String getNombre() {
		return this.nombre;
	}
}
