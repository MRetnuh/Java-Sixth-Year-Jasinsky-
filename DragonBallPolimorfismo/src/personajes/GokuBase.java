package personajes;

import ataques.Golpe;
import ataques.Kamehameha;

public class GokuBase extends Personaje{

	public GokuBase() {
		super("Goku", 5000, 50000);
		super.ataques[0] = new Golpe(this);
		super.ataques[1] = new Kamehameha();
		
}
	public GokuBase(String nombre, int vida, int energia) {
		super(nombre, vida, energia);
	}
}
