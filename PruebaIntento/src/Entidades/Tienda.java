package Entidades;

import Utilidades.Utiles;

public class Tienda {
	final int tipoColumna = 1;
	final int nombreColumna = 0;
	final int seguridadColumna = 2;
	final int prevIncendiosColumna = 3;
	final int felicidadColumna = 4;
	final int precioColumna = 5;
final String[][] edificios = {
		{"Rascascielos","Maravilla","0","0","10","900000"},
		{"Torre Eiffel","Maravilla","0","0","10","850000"},
		{"Arco del triunfo","Maravilla","0","0","9","700000"},
		{"Pirámide","Maravilla","0","0","9","600000"},
		{"Obelisco","Maravilla","0","0","8","450000"},
		{"Planta de energía eólica","Planta energética","0","0","10","500000"},
		{"Planta de energía solar","Planta energética","0","0","9","400000"},
		{"Planta de energía hidroeléctrica","Planta energética","0","0","8","300000"},
		{"Planta de energía de carbón","Planta energética","0","0","4","150000"},
		{"Empresa de agua corriente","Planta de agua","0","0","10","750000"},
		{"Obras de cañerias para agua potable","Planta de agua","0","0","9","500000"},
		{"Tanques de agua por manzana","Planta de agua","0","10","9","350000"},
		{"Pozos de agua","Planta de agua","0","0","7","200000"},
		{"Mega estación de policía","Seguridad","10","0","10","400000"},
		{"Estación de polocía grande","Seguridad","9","0","9","300000"},
		{"Estación de policía mediana","Seguridad","7","0","5","200000"},
		{"Estación de polocía chica","Seguridad","5","0","2","100000"},
		{"Mega estación de bomberos","Incendios","0","10","10","450000"},
		{"Estación de bomberos grande","Incendios","0","8","8","350000"},
		{"Estación de bomberos mediana","Incendios","0","7","6","250000"},
		{"Estación de bomberos chica","Incendios","0","6","5","150000"},
		{"Rutas","Caminos","0","0","10","400000"},
		{"Autopistas","Caminos","0","0","9","300000"},
		{"Avenidas","Caminos","0","0","8","200000"},
		{"Calles de asfalto","Caminos","0","0","6","150000"},
		{"Calles de tierra","Caminos","0","0","1","50000"},
		{"Reserva natural","Ecología","0","0","10","500000"},
		{"Parque polideportivo","Ecología","0","0","9","300000"},
		{"Parque grande","Ecología","0","0","8","200000"},
		{"Plaza","Ecología","0","0","7","100000"}};

public void comprarEdificios(Ciudad ciudad) {
	System.out.println("Bienvenido a la tienda");
	System.out.println("Que desea hacer?");
	boolean compraRealizada = false;
	final int cantEdificiosTipo = 6;
	final int opcionIrse = 1;
	final int opcionQuedarse= 2;
	do {
		System.out.println("1) Quedarse y seguir comprando");
		System.out.println("2) Irse");
		int opcion = Utiles.ingresarEntero(opcionIrse, opcionQuedarse);
		if(opcion == 1){
			comprar(ciudad);
		}
		if(opcion == 2) {
			if(ciudad.getEdificiosComprados() >= cantEdificiosTipo) {
				compraRealizada = true;
			}
			else {
				System.out.println("Todavia no compro la minima cantidad de edificios");
			}
		}
	}while(!compraRealizada);
}
public void comprar(Ciudad ciudad) {
	mostrarEdificios();
	boolean comprobador = false;
	final int min = 1;
	int opcion = Utiles.ingresarEntero(min, edificios.length);
	comprobador = ciudad.comprobadorEdificio(edificios[opcion - 1][tipoColumna]);
	if(Integer.valueOf(edificios[opcion - 1][precioColumna]) > ciudad.getAlcaldeDinero()) {
		System.out.println("No posee la plata suficiente");
	}
	if(comprobador) {
		System.out.println("Usted ya compro un edificio de ese tipo");
	}
	else {
		Edificios edificioComprado = new Edificios(edificios[opcion - 1][tipoColumna], edificios[opcion - 1][nombreColumna]
		, Integer.valueOf(edificios[opcion - 1][seguridadColumna]), Integer.valueOf(edificios[opcion - 1][prevIncendiosColumna]),  
		Integer.valueOf(edificios[opcion - 1][felicidadColumna]), Integer.valueOf(edificios[opcion - 1][precioColumna]));
		System.out.println("Acaba de adquirir el edificio:");
		System.out.println("Nombre: " + edificios[opcion - 1][nombreColumna] + " Tipo: " + edificios[opcion - 1][tipoColumna] + " Seguridad: " + edificios[opcion - 1][seguridadColumna]
				+ " PrevIncendios: " + edificios[opcion - 1][prevIncendiosColumna] + " Felicidad: "+ edificios[opcion - 1][felicidadColumna] + " Precio: " + edificios[opcion - 1][precioColumna]);
				
		ciudad.getAlcalde().dinero -= Integer.valueOf(edificios[opcion - 1][precioColumna]);
		ciudad.getEdificio(edificioComprado);
	}
}
public void mostrarEdificios() {
	for(int i = 0; i < edificios.length; i++) {
		System.out.println(i + ") " + "Nombre: " + edificios[i][nombreColumna] + " Tipo: " + edificios[i][tipoColumna] + " Seguridad: " + edificios[i][seguridadColumna]
	+ " PrevIncendios: " + edificios[i][prevIncendiosColumna] + " Felicidad: "+ edificios[i][felicidadColumna] + " Precio: " + edificios[i][precioColumna]);
	
	}
}
}
