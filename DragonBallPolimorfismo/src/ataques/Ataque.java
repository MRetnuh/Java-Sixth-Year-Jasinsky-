package ataques;

import efectos.EfectoSecundario;
import utilidades.Utiles;

public abstract class Ataque {

private String nombre;	
	
private int danioMinimoPrimeraProbabilidad;
private int danioMaximoPrimeraProbabilidad;
private int danioMinimoSegundaProbabilidad;
private int danioMaximoSegundaProbabilidad;
private int energiaConsumida;
private int probabilidadFallo;
private int primerProbabilidad;
private int segundaProbabilidad;

private EfectoSecundario efectoSecundario;


public Ataque(String nombre, int danioMinimoPrimeraProbabilidad, int danioMaximoPrimeraProbabilidad, int danioMinimoSegundaProbabilidad,
		int danioMaximoSegundaProbabilidad, int energiaConsumida, int probabilidadFallo,
		int primerProbabilidad, int segundaProbabilidad, EfectoSecundario efectoSecundario) {
	this.nombre = nombre;
	this.danioMinimoPrimeraProbabilidad = danioMinimoPrimeraProbabilidad;
	this.danioMaximoPrimeraProbabilidad = danioMaximoPrimeraProbabilidad;
	this.danioMinimoSegundaProbabilidad = danioMinimoSegundaProbabilidad;
	this.danioMaximoSegundaProbabilidad = danioMaximoSegundaProbabilidad;
	this.energiaConsumida = energiaConsumida;
	this.probabilidadFallo = probabilidadFallo;
	this.primerProbabilidad = primerProbabilidad;
	this.segundaProbabilidad = segundaProbabilidad;
	this.efectoSecundario = efectoSecundario;
	
}

public Ataque(String nombre, int danioMinimoPrimeraProbabilidad, int danioMaximoPrimeraProbabilidad, int danioMinimoSegundaProbabilidad,
		int danioMaximoSegundaProbabilidad, int energiaConsumida, int probabilidadFallo,
		int primerProbabilidad, int segundaProbabilidad) {
	this(nombre, danioMinimoPrimeraProbabilidad, danioMaximoPrimeraProbabilidad,  danioMinimoSegundaProbabilidad,
		 danioMaximoSegundaProbabilidad,  energiaConsumida,  probabilidadFallo,
		primerProbabilidad,  segundaProbabilidad, null);
}

public Ataque(String nombre, int danioMinimo, int danioMaximo, int energiaConsumida, int probabilidadFallo) {
	this(nombre, danioMinimo, danioMaximo, 0,0, energiaConsumida, probabilidadFallo, 100 - probabilidadFallo,100 - probabilidadFallo);
}

public Ataque(String nombre, int energiaConsumida, int probabilidadFallo,
		int primerProbabilidad, int segundaProbabilidad, EfectoSecundario efectoSecundario) {
	this(nombre, 0,0,0,0, energiaConsumida, probabilidadFallo, primerProbabilidad, segundaProbabilidad, efectoSecundario);
}

public Ataque(String nombre, int energiaConsumida, int probabilidadFallo,EfectoSecundario efectoSecundario) {
	this(nombre, energiaConsumida, probabilidadFallo, 0, 0);
}

public void mostrarDatos() {
	System.out.println("Nombre: " + this.nombre+  "Danio minimo: " + this.danioMinimoPrimeraProbabilidad + " Danio maximo: " + this.danioMaximoSegundaProbabilidad
			+ "Energia requerida: " + this.energiaConsumida + " Probabilidad de fallo: " + this.probabilidadFallo);
}


public int ejecutarAtaque() {
	int danio;
	int precision = Utiles.generarRandomEntreNumeros(this.probabilidadFallo, 100);
	
	if(precision < this.probabilidadFallo) {
		danio = 0;
	}
	
	else if(precision < this.segundaProbabilidad) {
		danio= Utiles.generarRandomEntreNumeros(this.danioMinimoPrimeraProbabilidad, this.danioMaximoPrimeraProbabilidad);
	}
	
	else {
		danio = Utiles.generarRandomEntreNumeros(this.danioMinimoSegundaProbabilidad, this.danioMaximoSegundaProbabilidad);
	}
	
	return danio;
}

public int getEnergia() {
	return this.energiaConsumida;
}

public EfectoSecundario getEfectoSecundario() {
	return this.efectoSecundario;
}

public int getDanio() {
	return this.danioMinimoPrimeraProbabilidad;
}

public String getNombre() {
	return this.nombre;
}

}

