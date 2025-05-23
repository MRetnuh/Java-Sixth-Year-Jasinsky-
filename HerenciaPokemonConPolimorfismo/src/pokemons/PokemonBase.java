package pokemons;

import java.util.ArrayList;

import ataques.Ataque;

public abstract class PokemonBase {

    private String nombre;
    protected TipoPokemon tipoPokemon;
    private int vida;
    protected int cantAtaques = 0;
    protected ArrayList<Ataque> ataques = new ArrayList<>();
    public PokemonBase(String nombre, TipoPokemon tipo, int vida) {
        this.nombre = nombre;
        this.vida = vida;
        this.tipoPokemon = tipo;
    }

    public void quitarVida(int danio) {
        this.vida -= danio;
    }
    public int getDanioAtaqueElegido(int opcAtaque) {
    	return this.ataques.get(opcAtaque).getDanio();
    }
    public int getPrecisionAtaque(int opcAtaque) {
    	return this.ataques.get(opcAtaque).getPrecision();
    }
    public void mostrarDatos() {
        System.out.println("Nombre: " + this.nombre + " Tipo: " + this.tipoPokemon + " Vida: " + this.vida + " hp");
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
