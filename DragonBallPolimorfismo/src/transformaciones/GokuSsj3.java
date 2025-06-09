package transformaciones;

import ataques.Ataque;
import ataques.Curacion;
import ataques.Genkidama;
import ataques.Golpe;
import ataques.Kamehameha;
import ataques.Taiyoken;

public final class GokuSsj3 extends GokuSsj2{
	public GokuSsj3() {
		super("Goku Ssj3", 50000, 180000, new Ataque[] {new Kamehameha(), new Taiyoken(1,4), new Curacion(20,40,41,65),
				new Genkidama(20001,50000,10)});
}
}
