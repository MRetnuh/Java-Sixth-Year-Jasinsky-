package transformaciones;

import personajes.FreezerBase;

public class Freezer1Transformacion extends FreezerBase{
  
	public Freezer1Transformacion() {
		super("Freezer primera transformacion", 17000, 75000);
	}
	
	public Freezer1Transformacion(String nombre, int vida, int energia) {
		super(nombre, vida, energia);
	}
}
