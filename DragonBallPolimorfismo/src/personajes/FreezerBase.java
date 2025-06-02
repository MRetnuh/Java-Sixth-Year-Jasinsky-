package personajes;

public class FreezerBase extends Personaje {

	public FreezerBase() {
		super("Freezer", 7000, 40000);
	}
	
	public FreezerBase(String nombre, int vida, int energia) {
		super(nombre, vida, energia);
	}
}
