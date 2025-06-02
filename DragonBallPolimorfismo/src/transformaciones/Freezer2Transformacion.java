package transformaciones;

public class Freezer2Transformacion extends Freezer1Transformacion{
	
	public Freezer2Transformacion() {
		super("Freezer primera transformacion", 30000, 100000);
	}
	
	public Freezer2Transformacion(String nombre, int vida, int energia) {
		super(nombre, vida, energia);
	}
}
