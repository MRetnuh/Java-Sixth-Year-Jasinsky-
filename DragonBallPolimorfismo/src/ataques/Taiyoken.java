package ataques;

import efectos.EfectoCeguera;

public class Taiyoken extends Ataques{
	public Taiyoken(){
		super("Taiyoken",1, 4, 5000, 50,new EfectoCeguera());
	}
}
