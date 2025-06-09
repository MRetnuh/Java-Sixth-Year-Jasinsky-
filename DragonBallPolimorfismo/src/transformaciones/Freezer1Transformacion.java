package transformaciones;

import ataques.Ataque;
import ataques.Golpe;
import ataques.Shougekiha;
import ataques.Supernova;
import personajes.FreezerBase;

public class Freezer1Transformacion extends FreezerBase{
  
	public Freezer1Transformacion() {
		super("Freezer primera transformacion", 17000, 75000, new Ataque[] {new Golpe(
				150,
				350,
				351,
				700,
				0,
				7,
				70,
				30), new Supernova(), new Shougekiha()});
	}
	
	public Freezer1Transformacion(String nombre, int vida, int energia, Ataque[] ataques) {
		super(nombre, vida, energia, ataques);
	}
}
