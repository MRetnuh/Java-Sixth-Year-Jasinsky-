package personajes;

import utiles.Util;

public class Enemigo extends Personaje{
	
	public Enemigo() {
		super("Juanito");
	}

	@Override
	public int elegirAtaque() {
		int opc = Util.r.nextInt(super.pokemones[super.pokemonElegido].getCantMaxAtaques());
		return opc;
	}
	
}
