package personajes;

import utilidades.Utiles;

public class Jugador extends Entrenador {
    public Jugador(String nombre) {
        super(nombre);
    }
    public void elegirPokemon() {
    System.out.println("Elija su pokemon para atacar");
    for(int i = 0; i < super.pokemones.length; i++) {
    	super.pokemones[i].mostrarDatos();
    }
     super.pokemonElegido = Utiles.ingresarEntero(1, super.pokemones.length) - 1;
     super.pokemones[pokemonElegido].getNombre();
    }
  
}