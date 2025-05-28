package pokemons;
import ataques.Ataque;

public abstract class PokemonBase {

    private String nombre;
    private TipoPokemon[] tipoPokemon;
    private int vida;
    protected int cantAtaques = 0;
    private boolean tieneUsosAtaques = true;
    protected Ataque[] ataques;
    public PokemonBase(String nombre, TipoPokemon[] tipoPokemon, int vida, Ataque[] ataques) {
        this.nombre = nombre;
        this.vida = vida;
        this.tipoPokemon = tipoPokemon;
        this.ataques = ataques;
    }

    public void quitarVida(int danio) {
        this.vida -= danio;
    }
    public TipoPokemon getTipo(int indiceTipoPokemon) {
    	return this.tipoPokemon[indiceTipoPokemon];
    }
    public int getCantTipos() {
    	return this.tipoPokemon.length;
    }
    public int getDanioAtaqueElegido(int opcAtaque) {
    	return this.ataques[opcAtaque].getDanio();
    }
    public int getPrecisionAtaque(int opcAtaque) {
    	return this.ataques[opcAtaque].getPrecision();
    }
    public void mostrarDatos() {
    	 System.out.print("Nombre: " + this.nombre + " Tipo: ");
    	    
    	    if (this.tipoPokemon.length == 1) {
    	        System.out.print(this.tipoPokemon[0]);
    	    } else {
    	        for (int i = 0; i < this.tipoPokemon.length; i++) {
    	            System.out.print(this.tipoPokemon[i]);
    	            if (i < this.tipoPokemon.length - 1) {
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
	   for(int i = 0; i < this.ataques.length; i++) {
		   this.ataques[i].mostrarDatos();
		   }
   }
   public boolean verificarUsosAtaques() {

       if(!this.tieneUsosAtaques){
           return false;
       }

       boolean tieneUsos = true;
       int cantAtaquesSinUsos = 0;
       int i = 0;

       while(this.ataques[i].getCantUsos() == 0 && i < this.ataques.length) {
           cantAtaquesSinUsos++;
           i++;
       }
       if(cantAtaquesSinUsos == this.ataques.length) {
           this.tieneUsosAtaques = false;
           tieneUsos = false;
       }

       return tieneUsos;
   }

   
   public void reducirCantAtaqueElegido(int opcAtaque) {
      this.ataques[opcAtaque].usarAtaque();
   }
   public int getCantUsosAtaqueElegido(int opcAtaque) {
	   return this.ataques[opcAtaque].getCantUsos();
   }
   public String getNombreAtaqueUsado(int opcAtaque) {
	   return this.ataques[opcAtaque].getNombre();
   }
    public int getCantAtaques() {
        return this.ataques.length;
    }
    
    
    public int getVida() {
        return this.vida;
    }

	public void atacar(int opcAtaque, PokemonBase pokemonOponente) {
		float multiplicador = 1f;
		if(opcAtaque == -1) {
			  System.out.println("El pokemon " + this.nombre + " fallo el ataque");
		}
		else {
			float danio = this.ataques[opcAtaque].getDanio();
			 for(int i = 0; i < pokemonOponente.tipoPokemon.length; i++) {
			  multiplicador = this.ataques[opcAtaque].getTipo().obtenerRatioEfectidad(pokemonOponente.getTipo(i));
	            danio *= multiplicador;
	            if(multiplicador==2){
	                System.out.println("El ataque es super efectivo");
	                i = pokemonOponente.tipoPokemon.length;
	            } else if(multiplicador==0.5f){
	                System.out.println("El ataque es poco efectivo");
	               i = pokemonOponente.tipoPokemon.length;
	            }
			 }
	            pokemonOponente.quitarVida((int)danio);

	            System.out.println(this.nombre + " ha usado " + this.ataques[opcAtaque].getNombre() + " y ha causado " + danio + " puntos de daño");
		}
	}
}
