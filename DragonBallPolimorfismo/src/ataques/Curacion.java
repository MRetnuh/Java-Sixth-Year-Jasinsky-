package ataques;

import efectos.EfectoCuracion;

public class Curacion extends Ataques{
	public Curacion(){
		super("Curacion", 20, 40, 41, 65, 8500, 20, 80, 20, new EfectoCuracion());
	}
}
