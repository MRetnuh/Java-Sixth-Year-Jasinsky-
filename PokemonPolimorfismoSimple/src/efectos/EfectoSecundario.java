package efectos;

import estados.EstadoAlterado;
import pokemones.Pokemon;
import utiles.Util;

public class EfectoSecundario{
private int turnosMin;
private int turnosMax;
private int probabilidad;
private int porcentajeMin;
private int porcentajeMax;
private TipoEfectoEstadistica tipoEfectoEstadistica;

	public EfectoSecundario(int probabilidad, int turnosMin, int turnosMax, int porcentajeMin, int porcentajeMax, 
	TipoEfectoEstadistica tipoEfectoEstadistica) {
		this.probabilidad = probabilidad;
		this.turnosMin = turnosMin;
		this.turnosMax = turnosMax;
		this.porcentajeMin = porcentajeMin;
		this.porcentajeMax = porcentajeMax;
		this.tipoEfectoEstadistica = tipoEfectoEstadistica;
	}
	
	public void aplicar(Pokemon pokemonEnemigo) {
		int turnos = Util.devolverEnteroEntreNumeros(this.turnosMin, this.turnosMax);
		int porcentaje = Util.devolverEnteroEntreNumeros(this.porcentajeMin, this.porcentajeMax);
		pokemonEnemigo.aplicarEstado(new EstadoAlterado(turnos, porcentaje, this.tipoEfectoEstadistica));
	}

	
	public int getProbabilidad() {
		return this.probabilidad;
	}
}
