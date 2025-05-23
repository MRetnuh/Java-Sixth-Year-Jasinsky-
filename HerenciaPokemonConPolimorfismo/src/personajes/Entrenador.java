package personajes;

import java.util.ArrayList;

import pokemons.PokemonBase;

public abstract class Entrenador {
	private String nombre;
    private int cantPokemonesMax = 3;
    protected ArrayList<PokemonBase> pokemones = new ArrayList<>();
    protected int pokemonesDerrotados = 0;
    private boolean derrota = false;
    
    public Entrenador(String nombre) {
        this.nombre = nombre;
    }
    
    public void asignarPokemon(PokemonBase pokemon) {
        this.pokemones.add(pokemon);
    }

    public void mostrarEquipo(){
        System.out.println("Equipo de " + this.nombre);
        for(int i = 0; i < this.pokemones.size(); i++) {
            System.out.println((i+1) + " " + this.pokemones.get(i).getNombre());
        }
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getCantMaxPokemones(){
        return this.cantPokemonesMax;
    }
    public boolean comprobarDerrota() {
        if(this.pokemonesDerrotados == 3) {
        	this.derrota = true;
        }
        return this.derrota;
    }
    public void perderPokemon(int opcPokemon) {
    	if(this.pokemones.get(opcPokemon).getVida() <= 0) {
    	 System.out.println("El pokemon " + this.pokemones.get(opcPokemon).getNombre() + " ha sido culeado");
    	 this.pokemones.remove(pokemones.get(opcPokemon));
    	}
    	 
    }
}


