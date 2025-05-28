package personajes;

import utilidades.Utiles;

public class Enemigo extends Entrenador {
    public Enemigo() {
        super("Gary Oak");
    }
    @Override
    public void elegirPokemon() {
      this.pokemonElegido = Utiles.r.nextInt(this.pokemones.length);
        }
    public void mostrarNombrePokemonElegido() {
    	this.pokemones[this.pokemonElegido].mostrarDatos();
    }
    @Override
    public int elegirAtaque() {
    int opcAtaque = Utiles.r.nextInt(this.pokemones[this.pokemonElegido].getCantAtaques());
    return opcAtaque;
    }
}