package personajes;

import utilidades.Utiles;

public class Jugador extends Entrenador {
private int opcPokemon;
    public Jugador(String nombre) {
        super(nombre);
    }
    public void elegirPokemon() {
    System.out.println("Elija su pokemon para atacar");
    for(int i = 0; i < super.pokemones.size(); i++) {
    	super.pokemones.get(i).mostrarDatos();
    }
     this.opcPokemon = Utiles.ingresarEntero(1, super.pokemones.size()) - 1;
     super.pokemones.get(opcPokemon).getNombre();
    }
    public int getPokemonElegido() {
    	return this.opcPokemon;
    }
    public void infligirDanio(Enemigo enemigo) {
    	int danio;
    	int cantUsos;
    	boolean ataqueValido = true;
    	do {
    		ataqueValido = true;
        System.out.println("Elija su ataque:");
        super.pokemones.get(opcPokemon).mostrarAtaques();
    	int opcAtaque = Utiles.ingresarEntero(1, super.pokemones.get(opcPokemon).getCantAtaques())- 1;
    	cantUsos = super.pokemones.get(opcPokemon).getCantUsosAtaqueElegido(opcAtaque);
    	if(cantUsos != 0) {
    	int ataqueErrado = Utiles.r.nextInt(100) + 1;
    	if(ataqueErrado > super.pokemones.get(opcPokemon).getPrecisionAtaque(opcAtaque)) {
    		  System.out.println("El pokemon erro el ataque");
    	}
    	else {
    	   danio = super.pokemones.get(opcPokemon).getDanioAtaqueElegido(opcAtaque);
    	   enemigo.pokemones.get(enemigo.getPokemonElegido()).quitarVida(danio);
    	   System.out.println(super.pokemones.get(opcPokemon).getNombre() + " ha usado " + 
    	   super.pokemones.get(opcPokemon).getNombreAtaqueUsado(opcAtaque) + " y su danio fue " +
    	   super.pokemones.get(opcPokemon).getDanioAtaqueElegido(opcAtaque));
    	}
         super.pokemones.get(opcPokemon).reducirCantAtaqueElegido(opcAtaque);
    	}
    	else {
    	 System.out.println("El ataque que seleccionó no puede ser utilizado");
         System.out.println("Vuelva a ingresar el ataque que desea ejecutar");
         ataqueValido = false;
    	}
    }while(!ataqueValido);
    }
}