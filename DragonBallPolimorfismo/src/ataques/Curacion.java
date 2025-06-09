package ataques;

import efectos.EfectoCuracion;

public class Curacion extends Ataque{
private int recuperacionMinimaPrimeraProbabilidad;
private int recuperacionMaximaPrimeraProbabilidad;
private int recuperacionMinimaSegundaProbabilidad;
private int recuperacionMaximaSegundaProbabilidad;

	public Curacion(int recuperacionMinimaPrimeraProbabilidad, int recuperacionMaximaPrimeraProbabilidad, int 
			recuperacionMinimaSegundaProbabilidad, int recuperacionMaximaSegundaProbabilidad){
		super("Curacion", 8500, 20, 80,20, new EfectoCuracion());
		this.recuperacionMinimaPrimeraProbabilidad = recuperacionMinimaPrimeraProbabilidad;
		this.recuperacionMaximaPrimeraProbabilidad = recuperacionMaximaPrimeraProbabilidad;
		this.recuperacionMinimaSegundaProbabilidad = recuperacionMinimaSegundaProbabilidad;
		this.recuperacionMaximaSegundaProbabilidad = recuperacionMaximaSegundaProbabilidad;
	}
}
