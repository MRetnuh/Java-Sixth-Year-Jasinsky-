package pokemons;

import java.util.ArrayList;

import ataques.Ataque;

public abstract class PokemonBase {

    private String nombre;
    protected ArrayList<TipoPokemon> tipoPokemon = new ArrayList<>();
    private int vida;
    protected int cantAtaques = 0;
    protected ArrayList<Ataque> ataques = new ArrayList<>();
    public PokemonBase(String nombre, int vida) {
        this.nombre = nombre;
        this.vida = vida;
    }

    public void quitarVida(int danio) {
        this.vida -= danio;
    }
    public TipoPokemon getTipo(int indiceTipoPokemon) {
    	return this.tipoPokemon.get(indiceTipoPokemon);
    }
    public int getCantTipos() {
    	return this.tipoPokemon.size();
    }
    public int getDanioAtaqueElegido(int opcAtaque) {
    	return this.ataques.get(opcAtaque).getDanio();
    }
    public int getPrecisionAtaque(int opcAtaque) {
    	return this.ataques.get(opcAtaque).getPrecision();
    }
    public void mostrarDatos() {
    	 System.out.print("Nombre: " + this.nombre + " Tipo: ");
    	    
    	    if (this.tipoPokemon.size() == 1) {
    	        System.out.print(this.tipoPokemon.get(0));
    	    } else {
    	        for (int i = 0; i < this.tipoPokemon.size(); i++) {
    	            System.out.print(this.tipoPokemon.get(i));
    	            if (i < this.tipoPokemon.size() - 1) {
    	                System.out.print(" / ");
    	            }
    	        }
    	    }

    	    System.out.println(" Vida: " + this.vida + " hp");
    	}

    public String getNombre() {
        return this.nombre;
    }
   public void mostrarAtaques() {
	   for(int i = 0; i < this.ataques.size(); i++) {
		   this.ataques.get(i).mostrarDatos();
		   }
   }
   public void reducirCantAtaqueElegido(int opcAtaque) {
      this.ataques.get(opcAtaque).usarAtaque();
   }
   public int getCantUsosAtaqueElegido(int opcAtaque) {
	   return this.ataques.get(opcAtaque).getCantUsos();
   }
   public String getNombreAtaqueUsado(int opcAtaque) {
	   return this.ataques.get(opcAtaque).getNombre();
   }
    public int getCantAtaques() {
        return this.ataques.size();
    }

    public int getVida() {
        return this.vida;
    }
}
