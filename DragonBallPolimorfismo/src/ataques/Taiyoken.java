package ataques;

import efectos.EfectoCeguera;

public class Taiyoken extends Ataque{
private int turnosMin;
private int turnosMax;
	public Taiyoken(int turnosMin, int turnosMax){
		super("Taiyoken",5000,50,new EfectoCeguera());
		this.turnosMin = turnosMin;
		this.turnosMax = turnosMax;
	}
}
