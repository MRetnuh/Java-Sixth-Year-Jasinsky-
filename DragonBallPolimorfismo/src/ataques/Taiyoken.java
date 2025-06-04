package ataques;

import efectos.EfectoCeguera;

public class Taiyoken extends Ataques{
	public Taiyoken(){
		super(250, 500, 501, 800, 0, 5, 80, 20, new EfectoCeguera());
	}
}
