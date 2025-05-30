package estados;

import efectos.TipoEstadistica;
import pokemons.PokemonBase;

public class EstadoEstadisticaModificada extends EstadoAlterado{
 private TipoEstadistica tipoEstadistica;
 private int porcentaje;
 
 public EstadoEstadisticaModificada(TipoEstadistica tipoEstadistica, int porcentaje, int turnos) {
	 super(turnos);
	 this.tipoEstadistica = tipoEstadistica;
	 this.porcentaje = porcentaje;
 }
 public TipoEstadistica getTipoEstadistica() {
	 return this.tipoEstadistica;
 }
 public int getPorcentaje() {
	 return this.porcentaje;
 }
@Override
public void mostrarInformacion() {
	System.out.println("El pokemon ha sido afectado por una modificacion de tipo " + tipoEstadistica.getNombreEstadistica() + 
			" en un porcentaje de " + this.porcentaje + "% restan: " + turnos + " turnos");
	
}
}
