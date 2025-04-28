package Entidades;

import Utiles.Utilidades;

public class LlenarDatos {
	final int nombrePelicula = 0;
	final int tipoPelicula = 1;
	final int formato = 2;
	final int indicePelicula = 0;
	final int numSala = 1;
	final int numeroDia = 2;
	final int hora = 3;
	final int cantidadColumnasSalaChiquita = 10;
	final int cantidadFilasSalaChiquita =8;
	final int cantidadColumnasSalaMediana = 20;
	final int cantidadFilasSalaMediana =12;
	final int cantidadColumnasSalaGrande = 25;
	final int cantidadFilasSalaGrande=20;
	final int cantidadColumnasSalaExtraGrande = 50;
	final int cantidadFilasSalaExtraGrande =25;
final private int cantidadSalasTotales = 10;
final private int peliculasTotales = 45;
 String[][] peliculas = {
		 {"Mortal Kombat","Acción","2D"}, //0
		 {"Mortal Kombat","Acción","3D"}, //1
		 {"Capone","Drama","2D"},         //2
		 {"La excavación","Drama","2D"},  //3
		 {"Nuevo orden","Thriller","2D"}, //4
		 {"Una noche en Miami","Drama","2D"}, //5
		 {"Godzilla vs. Kong","Ciencia ficción","2D"}, //6
		 {"Godzilla vs. Kong","Ciencia ficción","3D"}, //7
		 {"Cruella","Comedia","2D"},   //8
		 {"Cruella","Comedia","3D"},   //9
		 {"Bajocero","Thriller","2D"}, //10
		 {"Sweat","Drama","2D"},       //11
		 {"Palm Springs","Comedia","2D"},   //12
		 {"Judas y el mesías negro","Thriller","2D"},  //13
		 {"The Assistant","Drama","2D"},               //14
		 {"Cazafantasmas: Más allá","Fantástico","2D"},//15
		 {"Cazafantasmas: Más allá","Fantástico","3D"},//16
		 {"Spiral: Saw","Terror","2D"},      //17
		 {"Spiral: Saw","Terror","3D"},      //18
		 {"Fast & Furious 9","Acción","2D"}, //19
		 {"Fast & Furious 9","Acción","3D"}, //20
		 {"Expediente Warren","Terror","2D"},//21
		 {"Venom: Habrá Matanza","Acción","2D"}, //22
		 {"Venom: Habrá Matanza","Acción","3D"}, //23
		 {"Top Gun: Maverick","Acción","2D"},    //24
		 {"Top Gun: Maverick","Acción","3D"},    //25
		 {"Minions: El origen de Gru","Animación","2D"}, //26
		 {"Minions: El origen de Gru","Animación","3D"}, //27
		 {"La Purga: Infinita","Thriller","2D"},         //28
		 {"Space Jam: Nuevas leyendas","Animación","2D"},//29
		 {"Space Jam: Nuevas leyendas","Animación","3D"},//30
		 {"Uncharted","Acción","2D"},            //31
		 {"Uncharted","Acción","3D"},            //32
		 {"El Escuadrón Suicida","Acción","2D"}, //33
		 {"Eternals","Acción","2D"},             //34
		 {"Eternals","Acción","3D"},             //35
		 {"Mission: Impossible 7","Acción","2D"},//36
		 {"House of Gucci","Drama","2D"},        //37
		 {"Matrix Resurrections","Ciencia ficción","2D"}, //38
		 {"Matrix Resurrections","Ciencia ficción","3D"}, //39
		 {"Sherlock Holmes","Drama","2D"},                //40
		 {"Pinocho","Animación","2D"},                    //41
		 {"Ejército de los muertos","Acción","2D"},       //42
		 {"Tomb Raider 2","Acción","2D"},                 //43
		 {"Tomb Raider 2","Acción","3D"}};        //45
 
 int [][] funcionesDisponibles = { //Indice película - Nro Sala - Nro Día (0 lunes - 6 domingo) - Hora
		 {24,1,0,17},{24,1,1,19},{24,1,2,17},{24,1,4,21},{24,5,0,21},{24,5,1,23},{24,5,2,21},{24,5,3,23},{24,5,4,19},{24,5,5,21},{24,5,6,19},
		 {25,9,6,16},{21,1,0,19},{21,1,1,17},{21,1,2,23},{21,1,3,23},{21,5,0,23},{21,5,1,21},{21,5,2,19},{21,5,3,21},{21,5,4,21},{21,5,5,23},
		 {21,5,6,23},{21,9,3,21},{28,1,0,21},{28,1,1,23},{28,1,2,21},{28,1,3,19},{28,1,4,19},{28,1,5,19},{28,1,6,23},{28,7,0,23},{28,7,1,21},
		 {28,7,3,21},{28,7,4,23},{28,7,6,21},{10,1,0,23},{10,1,1,21},{10,1,2,19},{10,1,3,21},{10,1,4,23},{10,1,5,21},{10,1,6,19},{10,6,0,21},
		 {10,6,2,20},{10,6,3,18},{10,6,5,18},{10,6,6,16},{41,1,3,17},{41,1,4,17},{41,1,5,17},{41,1,6,21},{42,1,5,23},{42,1,6,17},{0,2,0,16},
		 {0,2,2,16},{0,2,3,19},{0,2,4,21},{0,2,5,16},{0,8,0,23},{0,8,1,18},{0,8,6,18},{1,10,2,18},{1,10,4,23},{1,10,5,19},{37,2,0,19},{37,2,1,17},
		 {37,2,2,19},{37,2,3,17},{37,2,4,17},{37,2,5,22},{37,2,6,19},{26,2,0,21},{26,2,5,24},{26,7,0,21},{26,7,1,23},{26,7,2,21},{26,7,3,19},
		 {26,7,4,19},{26,7,5,21},{26,7,6,23},{27,8,0,16},{27,8,1,16},{27,8,2,21},{27,8,4,21},{27,8,5,17},{27,8,6,16},{27,10,0,21},{27,10,2,16},
		 {11,2,0,23},{11,2,1,21},{11,2,2,21},{11,2,3,23},{11,2,4,19},{11,2,6,16},{11,6,0,23},{11,6,1,18},{11,6,3,16},{11,6,6,18},{5,2,1,19},
		 {5,2,3,21},{5,2,5,19},{5,2,6,21},{5,6,0,19},{5,6,2,22},{5,6,5,21},{40,2,1,23},{40,2,2,23},{40,2,4,23},{40,2,6,23},{40,5,2,17},{40,5,4,17},
		 {40,5,6,17},{36,3,0,16},{36,3,1,23},{36,3,2,19},{36,3,4,21},{36,3,5,23},{36,3,6,17},{36,7,1,17},{36,7,2,17},{36,7,4,17},{12,3,0,18},
		 {12,3,1,20},{12,3,2,23},{12,3,3,21},{12,3,4,19},{12,3,5,19},{12,3,6,21},{12,6,1,16},{12,6,2,16},{12,6,4,18},{14,3,0,21},{14,3,1,18},
		 {14,3,2,16},{14,3,3,19},{14,3,4,23},{14,3,5,21},{14,3,6,19},{14,6,1,24},{14,6,2,24},{14,6,3,24},{14,6,4,16},{45,3,0,23},{45,3,1,16},
		 {45,3,2,21},{45,3,3,23},{45,6,1,20},{45,6,3,20},{45,6,4,22},{45,6,5,16},{45,6,6,23},{45,9,2,18},{45,9,4,16},{15,3,3,17},{15,3,4,17},
		 {15,3,5,17},{15,8,0,18},{15,8,1,20},{15,8,4,23},{15,8,6,23},{16,10,1,23},{16,10,2,21},{16,10,4,19},{16,10,5,17},{43,4,0,17},{43,4,1,19},
		 {43,4,2,19},{43,8,1,22},{43,8,4,19},{44,8,5,23},{44,10,3,23},{38,4,0,19},{38,4,1,17},{38,4,2,16},{38,4,3,17},{38,4,4,19},{38,4,5,17},
		 {38,4,6,19},{38,7,2,23},{38,7,5,23},{39,9,2,22},{39,9,4,23},{39,9,6,24},{39,10,2,23},{39,10,6,24},{34,4,0,21},{34,4,2,21},
		 {34,4,3,21},{34,4,4,21},{34,4,5,19},{34,4,6,21},{34,5,0,17},{34,5,1,19},{34,5,3,17},{34,5,5,17},{35,9,1,16},{31,4,0,23},{31,4,1,21},{31,4,2,23},{31,4,3,19},{31,4,4,23},{31,4,5,23},{31,4,6,16},{31,7,0,19},{31,7,1,19},{31,7,3,23},{31,7,4,21},{31,7,5,19},{31,7,6,19},
		 {32,8,2,19},{32,8,3,16},{33,4,1,23},{33,4,3,23},{33,4,4,17},{33,4,5,21},{33,4,6,23},{33,7,0,17},{33,7,2,19},{33,7,3,17},{33,7,5,17},
		 {33,7,6,17},{33,8,2,17},{29,5,0,19},{29,5,1,16},{29,5,2,23},{29,5,3,19},{29,5,4,23},{29,5,5,19},{29,5,6,21},{29,9,0,17},{29,9,1,18},
		 {30,9,2,24},{30,9,2,17},{30,10,1,17},{3,6,0,16},{3,6,1,22},{3,6,2,18},{3,6,6,21},{2,6,3,22},{2,6,4,20},{2,6,5,23},{2,9,2,20},{2,9,5,18},
		 {2,9,6,22},{19,8,0,21},{19,8,1,24},{19,8,2,23},{19,8,3,21},{19,8,4,17},{19,8,5,21},{20,10,0,23},{20,10,4,21},{20,10,5,23},{20,10,6,18},
		 {6,8,3,18},{6,8,3,23},{6,8,5,19},{6,8,6,20},{7,10,0,19},{7,10,1,21},{7,10,4,17},{7,10,5,21},{7,10,6,22},{8,9,0,19},{8,9,3,23},{8,9,5,20},
		 {8,9,6,20},{9,10,3,19},{9,10,6,20},{22,9,2,16},{22,9,5,16},{22,9,6,18},{22,10,0,16},{22,10,6,16},{23,9,0,21},{23,9,1,24},{23,9,4,19},
		 {23,10,3,17},{17,9,0,23},{17,9,4,21},{17,9,5,24},{18,10,1,19},{18,10,3,21}};
public void asignarDatos(Gestor gestor) {
	asignarDatosPeliculasYSalas(gestor);
	asignarFunciones(gestor);
	
}
 public void asignarDatosPeliculasYSalas(Gestor gestor) {
	 for(int i = 0; i < peliculasTotales; i++) {
		 Pelicula pelicula = new Pelicula(peliculas[i][nombrePelicula], peliculas[i][tipoPelicula], peliculas[i][formato]);
		 gestor.getPeliculas(pelicula);
	 }
	 for(int i = 0; i < cantidadSalasTotales; i++) {
		 if(i >= 0 && i <= 4) {
			 Sala sala = new Sala(i, cantidadFilasSalaChiquita, cantidadColumnasSalaChiquita);
			 gestor.getSalas(sala);
		 }
		 else if(i >= 5 && i <= 7) {
			 Sala sala = new Sala(i, cantidadFilasSalaMediana, cantidadFilasSalaMediana);
			 gestor.getSalas(sala);
		 }
		 else if(i >= 8 && i <= 9) {
			 Sala sala = new Sala(i, cantidadFilasSalaGrande, cantidadFilasSalaGrande);
			 gestor.getSalas(sala);
		 }
		 else {
			 Sala sala = new Sala(i, cantidadFilasSalaExtraGrande, cantidadFilasSalaExtraGrande);
			 gestor.getSalas(sala);
		 }
	 }
 }
public void asignarFunciones(Gestor gestor) {
	for(int i = 0; i < funcionesDisponibles.length; i++) {
		Funcion funcion = new Funcion(funcionesDisponibles[i][indicePelicula], funcionesDisponibles[i][numSala], funcionesDisponibles[i][numeroDia], funcionesDisponibles[i][hora]);
		gestor.getFunciones(funcion);
	}
}
}
