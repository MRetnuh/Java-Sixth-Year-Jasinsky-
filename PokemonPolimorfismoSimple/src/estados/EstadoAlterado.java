package estados;

import efectos.EfectoSecundario;
import efectos.TipoEfectoEstadistica;
import pokemones.Pokemon;

public class EstadoAlterado {
	
private int turnos;
private int porcentaje;
private TipoEfectoEstadistica tipoEfectoEstadistica;

public EstadoAlterado(int turnos, int porcentaje, TipoEfectoEstadistica tipoEfectoEstadistica) {
	this.turnos = turnos;
	this.porcentaje = porcentaje;
	this.tipoEfectoEstadistica = tipoEfectoEstadistica;
}

public void mostrarInformacion(Pokemon pokemonEnemigo) {
	System.out.println("El pokemon " + pokemonEnemigo.getNombre() + " ha sido afectado. Ahora su " + this.tipoEfectoEstadistica.getNombre() 
	+ " fue reducida un " + this.porcentaje + "% por " + this.turnos + " turnos");
}

public void reducirTurnos() {
	this.turnos--;
}


public int getPorcentaje() {
	return this.porcentaje;
}

public int getTurnos() {
	return this.turnos;
}


}
