package efectos;

import pokemons.PokemonBase;

public abstract class EfectoSecundario {
protected int probabilidad;
protected int turnosMin, turnosMax;
public String nombre;

public EfectoSecundario(int probabilidad, int turnosMin, int turnosMax) {
	this.probabilidad = probabilidad;
	this.turnosMin = turnosMin;
	this.turnosMax = turnosMax;
}
//sirve para obligar a las clases hijos a tener un metodo
public abstract void aplicar(PokemonBase pokemonExponente);
	

public int getProbabilidad() {
	return this.probabilidad;
}

public String getNombre(){
	return this.nombre;
}
}