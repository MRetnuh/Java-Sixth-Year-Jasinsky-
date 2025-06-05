package ataques;

import efectos.EfectoSecundario;

public abstract class Ataques {

private String nombre;	
	
private int ataqueMinimoPrimeraProbabilidad;
private int ataqueMaximoPrimeraProbabilidad;
private int ataqueMinimoSegundaProbabilidad;
private int ataqueMaximoSegundaProbabilidad;
private int ataqueMinimoTerceraProbabilidad;
private int ataqueMaximoTerceraProbabilidad;

private int energiaConsumida;
private int probabilidadFallo;
private int primerProbabilidad;
private int segundaProbabilidad;
private int terceraProbabilidad;

private EfectoSecundario efectoSecundario;
private int efectosTurnosMin;
private int efectosTurnosMax;

public Ataques(String nombre, int ataqueMinimoPrimeraProbabilidad, int ataqueMaximoPrimeraProbabilidad, 
        int ataqueMinimoSegundaProbabilidad, int ataqueMaximoSegundaProbabilidad, 
        int energiaConsumida, int probabilidadFallo, 
        int primerProbabilidad, int segundaProbabilidad,
        EfectoSecundario efectoSecundario, int efectosTurnosMin, int efectosTurnosMax) {
		this.ataqueMinimoPrimeraProbabilidad = ataqueMinimoPrimeraProbabilidad;
		this.ataqueMaximoPrimeraProbabilidad = ataqueMaximoPrimeraProbabilidad;
		this.ataqueMinimoSegundaProbabilidad = ataqueMinimoSegundaProbabilidad;
		this.ataqueMaximoSegundaProbabilidad = ataqueMaximoSegundaProbabilidad;
		this.energiaConsumida = energiaConsumida;
		this.probabilidadFallo = probabilidadFallo;
		this.primerProbabilidad = primerProbabilidad;
		this.segundaProbabilidad = segundaProbabilidad;
		this.efectoSecundario = efectoSecundario;
		this.efectoSecundario = efectoSecundario;
		this.efectosTurnosMin = efectosTurnosMin;
		this.efectosTurnosMax = efectosTurnosMax;
}



public Ataques(String nombre,int ataqueMinimoPrimeraProbabilidad, int ataqueMaximoPrimeraProbabilidad, 
		int energiaConsumida, int probabilidadFallo){
	    this(nombre ,ataqueMinimoPrimeraProbabilidad, ataqueMaximoPrimeraProbabilidad, 0, 0,
		 energiaConsumida, probabilidadFallo, 100 - probabilidadFallo, 0, null, 0, 0);
}

public Ataques(String nombre,int ataqueMinimoPrimeraProbabilidad, int ataqueMaximoPrimeraProbabilidad, 
		int energiaConsumida, int probabilidadFallo,  EfectoSecundario efectoSecundario){
	    this(nombre,ataqueMinimoPrimeraProbabilidad, ataqueMaximoPrimeraProbabilidad, 0, 0,
		 energiaConsumida, probabilidadFallo, 100 - probabilidadFallo, 0, efectoSecundario, 0, 0);
}

public Ataques(String nombre,int ataqueMinimoPrimeraProbabilidad, int ataqueMaximoPrimeraProbabilidad, int ataqueMinimoSegundaProbabilidad, int ataqueMaximoSegundaProbabilidad, 
		int energiaConsumida, int probabilidadFallo, int primerProbabilidad, int segundaProbabilidad, EfectoSecundario efectoSecundario){
	    this(nombre,ataqueMinimoPrimeraProbabilidad, ataqueMaximoPrimeraProbabilidad, ataqueMinimoSegundaProbabilidad, ataqueMaximoSegundaProbabilidad, 
		 energiaConsumida, probabilidadFallo, primerProbabilidad, segundaProbabilidad, efectoSecundario, 0, 0);
	   
}

public Ataques(String nombre,int ataqueMinimoPrimeraProbabilidad, int ataqueMaximoPrimeraProbabilidad, int ataqueMinimoSegundaProbabilidad, int ataqueMaximoSegundaProbabilidad, 
		int energiaConsumida, int probabilidadFallo, int primerProbabilidad, int segundaProbabilidad){
	    this(nombre,ataqueMinimoPrimeraProbabilidad, ataqueMaximoPrimeraProbabilidad, ataqueMinimoSegundaProbabilidad, ataqueMaximoSegundaProbabilidad, 
		 energiaConsumida, probabilidadFallo, primerProbabilidad, segundaProbabilidad, null, 0, 0);
	   
}

public Ataques(String nombre,int ataqueMinimoPrimeraProbabilidad, int ataqueMaximoPrimeraProbabilidad, int ataqueMinimoSegundaProbabilidad, int ataqueMaximoSegundaProbabilidad, 
		int ataqueMinimoTerceraProbabilidad, int ataqueMaximoTerceraProbabilidad, int energiaConsumida, int probabilidadFallo, int primerProbabilidad, int segundaProbabilidad, int terceraProbabilidad){
	    this( nombre,ataqueMinimoPrimeraProbabilidad, ataqueMaximoPrimeraProbabilidad, ataqueMinimoSegundaProbabilidad, ataqueMaximoSegundaProbabilidad, 
		 energiaConsumida, probabilidadFallo, primerProbabilidad, segundaProbabilidad, null, 0, 0);
	    this.ataqueMaximoPrimeraProbabilidad = ataqueMaximoPrimeraProbabilidad;
	    this.ataqueMaximoSegundaProbabilidad = ataqueMaximoSegundaProbabilidad;
	    this.terceraProbabilidad = terceraProbabilidad;
	   
}


}

