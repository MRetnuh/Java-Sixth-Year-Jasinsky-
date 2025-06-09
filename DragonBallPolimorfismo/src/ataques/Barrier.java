package ataques;

import efectos.EfectoInmunidad;

public class Barrier extends Ataque{
private int reduccionDanioMinimaPrimeraProbabilidad;
private int reduccionDanioMaximaPrimeraProbabilidad;
private int reduccionDanioMinimaSegundaProbabilidad;
private int reduccionDanioMaximaSegundaProbabilidad;
private int turnosMin;
private int turnosMax;
	public Barrier( int reduccionDanioMinimaPrimeraProbabilidad,  int reduccionDanioMaximaPrimeraProbabilidad,
			 int reduccionDanioMinimaSegundaProbabilidad, int reduccionDanioMaximaSegundaProbabilidad,
			 int turnosMin, int turnosMax){
		super("Barrier",15000, 35, 65, 35, new EfectoInmunidad());
		this.reduccionDanioMinimaPrimeraProbabilidad = reduccionDanioMinimaPrimeraProbabilidad;
		this.reduccionDanioMaximaPrimeraProbabilidad = reduccionDanioMaximaPrimeraProbabilidad;
		this.reduccionDanioMinimaSegundaProbabilidad = reduccionDanioMinimaSegundaProbabilidad;
		this.reduccionDanioMaximaSegundaProbabilidad = reduccionDanioMaximaSegundaProbabilidad;
		this.turnosMin = turnosMin;
		this.turnosMax = turnosMax;
	}
}
