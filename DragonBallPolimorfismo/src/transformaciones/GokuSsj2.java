package transformaciones;

import ataques.Ataque;
import ataques.Curacion;
import ataques.Golpe;
import ataques.Kamehameha;
import ataques.Taiyoken;

public class GokuSsj2 extends GokuSsj{
	public GokuSsj2() {
		super("Goku Ssj2", 25000, 120000, new Ataque[] {new Golpe(
				250,
				500,
				501,
				800,
				0,
				5,
				80,
				20), new Kamehameha(), new Taiyoken(1,4), new Curacion(20,40,41,65)});
}
	public GokuSsj2(String nombre, int vida, int energia, Ataque[] ataques) {
		super(nombre, vida, energia, ataques);
	}
}
