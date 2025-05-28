package personajes;

import utilidades.Utiles;

public class Enemigo extends Entrenador {
    public Enemigo() {
        super("Gary Oak");
    }
    @Override
    public int elegirAtaque() {
    int opcAtaque = Utiles.r.nextInt(this.pokemones[this.pokemonElegido].getCantAtaques());
    return opcAtaque;
    }
}