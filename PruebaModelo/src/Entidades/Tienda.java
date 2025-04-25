package Entidades;

import java.util.Random;

import Utilidades.Utiles;

public class Tienda {
	final int columnaNombreArma= 0;
	final int columnaDanio = 1;
	final int columnaVelocidadCambioArma = 2;
	final int columnaPrecioArma = 3;
	final int columnaTipoArmadura= 0;
	final int columnaNombreArmadura = 1;
	final int columnaPrecioArmadura = 2;
	final int columnaVidaAgregada = 3;
	final int columnaVelocidadCambioArmadura = 4;
final private String [][] elementosArmadura = {
		{"Casco","Casco de cuero","500","5","0"},
		{"Casco","Casco de bronce","800","10","2"},
		{"Casco","Casco de plata","1000","15","2"},
		{"Casco","Casco de oro","1200","20","1"},
		{"Casco","Casco de platino","1500","25","0"},
		{"Casco","Casco de diamante","1800","30","0"},
		{"Peto","Peto de cuero","700","10","0"},
		{"Peto","Peto de bronce","1200","15","3"},
		{"Peto","Peto de plata","1500","25","3"},
		{"Peto","Peto de oro","1800","30","2"},
		{"Peto","Peto de platino","2000","35","1"},
		{"Peto","Peto de diamante","2500","50","0"},
		{"Grebas","Grebas de cuero","600","5","1"},
		{"Grebas","Grebas de bronce","1300","10","2"},
		{"Grebas","Grebas de plata","1500","20","3"},
		{"Grebas","Grebas de oro","1800","30","2"},
		{"Grebas","Grebas de platino","2000","35","1"},
		{"Grebas","Grebas de diamante","2500","40","0"},
		{"Botas","Botas de cuero","400","5","0"},
		{"Botas","Botas de bronce","600","5","2"},
		{"Botas","Botas de plata","800","5","1"},
		{"Botas","Botas de oro","1500","5","0"},
		{"Botas","Botas de platino","2000","5","0"},
		{"Botas","Botas de diamante","2200","5","0"}
		};
final private String[][] armas = {
		{"Daga filosa","3","10","500"},
		{"Daga Dorada","5","12","1500"},
		{"Daga prohibida","10","20","2500"},
		{"Espada de madera","5","18","800"},
		{"Espada de piedra","15","10","1500"},
		{"Espada de tantalio","20","25","2800"},
		{"Espada de grafito","20","30","3200"},
		{"Maza de piedra","20","8","800"},
		{"Maza de hierro","25","10","1300"},
		{"Maza de platino","35","15","2200"},
		{"Maza de materia oscura","50","18","4500"},
		{"Arco liviano","5","20","700"},
		{"Arco preciso","8","15","1000"},
		{"Arco de diamante","10","20","2000"},
		{"Arco encantado","15","18","2200"},
		{"Hacha vieja","15","10","1200"},
		{"Hacha pesada","25","12","1800"},
		{"Hacha Vikinga","35","15","2400"}
};
public void comprarElementoArmadura(Jugador jugador) {
	int opcion;
	boolean seguirComprando = true;
	final int opcionMinima = 1;
	final int opcionMaxima = 3;
	System.out.println("Bienvenido jugador " + jugador.getNombre());
	System.out.println("Su dinero es " + jugador.getDinero());
	do {
		System.out.println("Que va a hacer?");
		System.out.println("1) Comprar partes de armadura");
		System.out.println("2) Comprar armas");
		System.out.println("3) Salir");
		opcion = Utiles.ingresarEntero(opcionMinima, opcionMaxima);
		switch(opcion) {
		case 1:
			comprarParteArmadura(jugador);
			break;
		case 2:
			comprarArmas(jugador);
			break;
		case 3:
			System.out.println("Compras finalizadas");
			seguirComprando = false;
			break;
		}
	}while(seguirComprando);
}
public void comprarParteArmadura(Jugador jugador) {
	final int limitePartesAdquiridas = 4;
	Armadura armadura;
	boolean comprobador;
	mostrarPartesArmadura();
	int opcion;
	System.out.println("0) Volver a la parte de antes");
	opcion = Utiles.ingresarEntero(0, elementosArmadura.length);
	if(opcion == 0) {
		return;
	}
	if(jugador.getCantidadObjetosAdquiridos() >= limitePartesAdquiridas) {
		System.out.println("Ya completaste tu armadura, no podes seguir comprando");
	}
	if(Integer.valueOf(elementosArmadura[opcion - 1][columnaPrecioArmadura]) > jugador.getDinero()) {
		System.out.println("No tiene la plata suficiente");
	}
	else {
		armadura = new Armadura(elementosArmadura[opcion -1][columnaNombreArmadura], elementosArmadura[opcion -1][columnaTipoArmadura],
		Integer.valueOf(elementosArmadura[opcion -1][columnaPrecioArmadura]),Integer.valueOf(elementosArmadura[opcion -1][columnaVidaAgregada]), 
		Integer.valueOf(elementosArmadura[opcion-1][columnaVelocidadCambioArmadura]));
		comprobador = jugador.comprobadorParteArmadura(armadura.getTipo());
		if(!comprobador) {
			System.out.println("Ya posee esa parte");
		}
		else {
			jugador.adquirirArmadura(armadura);
			System.out.println();
			System.out.println("Adquirio: " + armadura.getNombre());
			System.out.println("Plata restante: " + jugador.getDinero());
			
		}
	}
	
}
public void comprarArmas(Jugador jugador) {
	Arma arma;
	mostrarArmas();
	int opcion;
	System.out.println("0) Volver a la parte de antes");
	opcion = Utiles.ingresarEntero(0, armas.length);
	if(opcion == 0) {
		return;
	}
	if(Integer.valueOf(armas[opcion - 1][columnaPrecioArma]) > jugador.getDinero()) {
		System.out.println("No tiene la plata suficiente");
	}
	else {
		if(jugador.verificarPresenciaArma() == true) {
			System.out.println("Ya posees un arma");
		}
		else {
		arma = new Arma(armas[opcion - 1][columnaNombreArma], Integer.valueOf(armas[opcion - 1][columnaDanio]), 
		Integer.valueOf(armas[opcion - 1][columnaVelocidadCambioArma]), Integer.valueOf(armas[opcion - 1][columnaPrecioArma]));
		jugador.obtenerArma(arma);
		System.out.println();
		System.out.println("Adquirio: " + arma.getNombre());
		System.out.println("Plata restante: " + jugador.getDinero());
		}
	}
}
public void mostrarPartesArmadura() {
	System.out.println("Tienda de partes de armaduras");
	for(int i = 0; i < elementosArmadura.length; i++) {
	System.out.println("Numero: " + (i + 1) + " .Tipo: " + elementosArmadura[i][columnaTipoArmadura] + " .Nombre: " + elementosArmadura[i][columnaNombreArmadura] + 
	" .Precio: " + elementosArmadura[i][columnaPrecioArmadura] + " .Plus de Vida  " + elementosArmadura[i][columnaVidaAgregada] +" .Plus de Velocidad: " + elementosArmadura[i][columnaVelocidadCambioArmadura]);
	System.out.println();
	}
}
public void mostrarArmas() {
	System.out.println("Tienda de armas");
	for(int i = 0; i < armas.length; i++) {
	System.out.println("Numero: " + (i + 1) + " .Nombre: " + armas[i][columnaNombreArma]
	+ " .Danio: " +  armas[i][columnaDanio] + " .Precio: " + armas[i][columnaPrecioArma] + " .Plus de Velocidad: " + armas[i][columnaVelocidadCambioArma]);
	System.out.println();
	}
}
public void asignarParteAleatoria(String tipoElemento, Jugador enemigo) {
	String [][]parteArmadura = obtenerPartesAleatorias(tipoElemento);
	Random r = new Random();
	int elementoRandom = r.nextInt(parteArmadura.length);
	Armadura armadura = new Armadura(parteArmadura[elementoRandom][columnaNombreArmadura], parteArmadura[elementoRandom][columnaTipoArmadura], 
	Integer.valueOf(parteArmadura[elementoRandom][columnaPrecioArmadura]), Integer.valueOf(parteArmadura[elementoRandom][columnaVidaAgregada]),  
	Integer.valueOf(parteArmadura[elementoRandom][columnaVelocidadCambioArmadura]));
	enemigo.adquirirArmadura(armadura);
	
}
private String[][] obtenerPartesAleatorias(String tipoElemento) {
	final int columnaTipo= 0;
	int cantPartes = 0;
	final int tiposPartesTotales = 5;
	String [][] partesArmaduraAux = new String[elementosArmadura.length][tiposPartesTotales];
	int i = 0;
	while(i < elementosArmadura.length) {
		if(elementosArmadura[i][columnaTipoArmadura].equals(tipoElemento)) {
			partesArmaduraAux[cantPartes] = elementosArmadura[i];
			cantPartes++;
		}
		i++;
	}
	int j = 0;
	String [][] partesArmadura = new String[cantPartes][tiposPartesTotales];
	while(j < cantPartes) {
			partesArmadura[j] = partesArmaduraAux[j];
		j++;
	}
	return partesArmadura;
}
public void asignarArmaAleatoeria(Jugador enemigo) {
	Random r = new Random();
	int elementoRandom = r.nextInt(armas.length);
	Arma arma = new Arma(armas[elementoRandom][columnaNombreArma], Integer.valueOf(armas[elementoRandom][columnaDanio]), 
			Integer.valueOf(armas[elementoRandom][columnaVelocidadCambioArma]), Integer.valueOf(armas[elementoRandom][columnaPrecioArma]));
			enemigo.obtenerArma(arma);
			
}
}