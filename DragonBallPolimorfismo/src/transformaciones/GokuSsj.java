package transformaciones;

import ataques.Curacion;
import personajes.GokuBase;

public class GokuSsj extends GokuBase{
	
	public GokuSsj() {
		super("Goku Ssj", 15000, 80000);
		super.ataques[3] = new Curacion();
	}
	
	public GokuSsj(String nombre, int vida, int energia) {
		super(nombre, vida, energia);
	}
}
