package personajes;

import ataques.Ataque;
import ataques.Golpe;
import ataques.Supernova;

public class FreezerBase extends Personaje {

	public FreezerBase() {
		super("Freezer", 7000, 40000, new Ataque[] {new Golpe(150,
				350,
				351,
				700,
				0,
				7,
				70,
				30), new Supernova()});
	}
	
	public FreezerBase(String nombre, int vida, int energia, Ataque[] ataques) {
		super(nombre, vida, energia, ataques);
	}
}
