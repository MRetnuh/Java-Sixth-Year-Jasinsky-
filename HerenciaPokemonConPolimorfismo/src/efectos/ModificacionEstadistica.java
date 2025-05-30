package efectos;

import estados.EstadoEstadisticaModificada;
import pokemons.PokemonBase;
import utilidades.Utiles;

public class ModificacionEstadistica extends EfectoSecundario{
 private TipoEstadistica tipoEstadistica;
 private int porcentajeMin, porcentajeMax;
 
 public ModificacionEstadistica(TipoEstadistica tipoEstadistica, int porcentajeMin, int porcentajeMax, int probabilidad, int turnosMin, int turnosMax) {
	 super(probabilidad, porcentajeMin, porcentajeMax);
	 this.tipoEstadistica = tipoEstadistica;
	 this.porcentajeMin = porcentajeMin;
	 this.porcentajeMax = porcentajeMax;
 }
 public ModificacionEstadistica(TipoEstadistica tipoEstadistica, int porcentajeMin, int porcentajeMax, int turnosMin, int turnosMax) {
	this(tipoEstadistica, porcentajeMin, porcentajeMax, 100, turnosMin, turnosMax); //de esta forma hago sobrecarga de metodos de modo que existan dos formas de una misma funcion y una tenga menos parametros. Con el this hace que suceda la otra funcion y le pasas los parametros
 }
 @Override
 public void aplicar(PokemonBase pokemonOponente) {//tiene los mismos argumentos/parametros que la funcion de padre
	 int porcentaje = Utiles.r.nextInt(porcentajeMax - porcentajeMax +1) + porcentajeMin;
	 int turnos = Utiles.r.nextInt(super.turnosMax - super.turnosMin + 1) + super.turnosMin;
	 pokemonOponente.aplicarEstadoAlterado(new EstadoEstadisticaModificada(this.tipoEstadistica, porcentaje, turnos));
	  System.out.println("Ahora " + pokemonOponente.getNombre() + " vera reducida su estadistica: "+ this.tipoEstadistica.getNombreEstadistica() + " en un " + porcentaje + 
			  "% durante " + turnos + " turnos");
 }
}
