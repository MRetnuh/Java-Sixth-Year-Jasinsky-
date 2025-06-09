package transformaciones;

import ataques.Ataque;
import ataques.Curacion;
import ataques.Golpe;
import ataques.Kamehameha;
import ataques.Taiyoken;
import personajes.GokuBase;

public class GokuSsj extends GokuBase{
	
	public GokuSsj() {
		super("Goku Ssj", 15000, 80000, new Ataque[] {new Golpe(
				250,
				500,
				501,
				800,
				0,
				5,
				80,
				20), new Kamehameha(), new Taiyoken(1,4)});
	}
	
	public GokuSsj(String nombre, int vida, int energia, Ataque[] ataques) {
		super(nombre, vida, energia, ataques);
	}
}
