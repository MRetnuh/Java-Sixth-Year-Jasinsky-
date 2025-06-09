package ataques;

public class Genkidama extends Ataque{
	private int danioMinimoTerceraProbabilidad;
	private int danioMaximoTerceraProbabilidad;
	private int terceraProbabilidad;
	
	public Genkidama(int danioMinimoTerceraProbabilidad, int danioMaximoTerceraProbabilidad, int terceraProbabilidad){
		super("Genkidama", 5000, 10000, 10001, 20000,20000, 5, 80, 20);
		this.danioMinimoTerceraProbabilidad = danioMinimoTerceraProbabilidad;
	    this.danioMaximoTerceraProbabilidad = danioMaximoTerceraProbabilidad;
	    this.terceraProbabilidad = terceraProbabilidad;
		
	}
}
