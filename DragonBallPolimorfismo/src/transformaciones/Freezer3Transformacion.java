package transformaciones;

import ataques.Ataque;
import ataques.Barrier;
import ataques.Golpe;
import ataques.RenzokuKikouha;
import ataques.Shougekiha;
import ataques.Supernova;

public final class Freezer3Transformacion extends Freezer2Transformacion{

	public Freezer3Transformacion() {
		super("Freezer tercera transformacion", 75000, 150000,new Ataque[] {new Supernova(), new Shougekiha(), 
				new RenzokuKikouha(), new Barrier(10,50,51,65,1,4)});
	}

}
