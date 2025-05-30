package estados;

import pokemons.PokemonBase;

public abstract class EstadoAlterado {
protected int turnos;

public EstadoAlterado(int turnos) {
	this.turnos = turnos;
}
public abstract void mostrarInformacion() ;
public void reducirTurno() {
	this.turnos--;
	
}
public int getTurnos() {
	return this.turnos;
}
}