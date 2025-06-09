package transformaciones;

import ataques.Ataque;
import ataques.Golpe;
import ataques.RenzokuKikouha;
import ataques.Shougekiha;
import ataques.Supernova;

public class Freezer2Transformacion extends Freezer1Transformacion{
	
	public Freezer2Transformacion() {
		super("Freezer segunda transformacion", 30000, 100000,new Ataque[] {new Golpe(
				150,
				350,
				351,
				700,
				0,
				7,
				70,
				30), new Supernova(), new Shougekiha(), new RenzokuKikouha()});
	}
	
	public Freezer2Transformacion(String nombre, int vida, int energia, Ataque[] ataques) {
		super(nombre, vida, energia, ataques);
	}
}
