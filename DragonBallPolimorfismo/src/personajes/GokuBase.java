package personajes;

import ataques.Ataque;
import ataques.Golpe;
import ataques.Kamehameha;

public class GokuBase extends Personaje{

	public GokuBase() {
		super("Goku", 5000, 50000, new Ataque[] {new Golpe(
				250,
				500,
				501,
				800,
				0,
				5,
				80,
				20), new Kamehameha()});
		
}
	public GokuBase(String nombre, int vida, int energia, Ataque[] ataques) {
		super(nombre, vida, energia, ataques);
	}
}
