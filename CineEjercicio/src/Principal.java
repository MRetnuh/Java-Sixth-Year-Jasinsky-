
import java.util.Random;

import Entidades.Gestor;
import Entidades.LlenarDatos;
import Utiles.Utilidades;

public class Principal {
public static void main(String argc[]) {
	Gestor gestor = new Gestor();
	Generos[] generos = Generos.values();
	final String[] dias = {"Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo"};
	LlenarDatos llenarDatos = new LlenarDatos();
	System.out.println("Bienvenido al cine");
		System.out.println("Que desea hacer?");
		final int opcionMinima = 1;
		final int opcionMaxima = 8;
		boolean accionFinalizada = false;
		llenarDatos.asignarDatos(gestor);
		do {
			 mostrarOpciones();
             int opcion = Utilidades.ingresarEntero(opcionMinima, opcionMaxima);
			switch(opcion) {
	    case 1:
	    	mostrarPeliculas(gestor);
				break;
		case 2:
				filtrarGeneros(gestor, generos, opcionMinima);
				break;
		case 3:
			mostrarPeliculas2D(gestor);
			break;
		case 4:
			mostrarPeliculas3D(gestor);
			break;
		case 5:
			mostrarPeliculas(gestor);
			verAsientos(gestor, opcionMinima, dias);
			break;
		case 6:
			
			break;
		case 7:
			
			break;
		case 8:
			accionFinalizada = true;
			break;
			}
		}while(!accionFinalizada);
	}


	 private static void mostrarOpciones() {
		 System.out.println("1) Listar Peliculas");
		 System.out.println("2) Filtrar peliculas por genero");
		 System.out.println("3) Mostrar peliculas 2D");
		 System.out.println("4) Mostrar peliculas 3D");
		 System.out.println("5) Ver asientos");
		 System.out.println("6) Reservar asientos");
		 System.out.println("7) Ingresar descuentos");
		 System.out.println("8) Irse");
		 
	 }
	 private static void mostrarPeliculas(Gestor gestor) {
		 for(int i = 0; i < gestor.getArrayPeliculas().length; i++) {
			 System.out.println((i + 1) + ") "+ "Titulo: " +  gestor.getArrayPeliculas()[i].getTitulo() + " Genero: " +  gestor.getArrayPeliculas()[i].getGenero()
					 + " Formato: " +  gestor.getArrayPeliculas()[i].getFormato());
		 }
		 System.out.println();
	 }
	 private static void filtrarGeneros(Gestor gestor, Generos[] generos,  final int opcionMinima) {
		 String generoElegido;
		 System.out.println("De que genero quiere ver las peliculas?");
		 for(int i = 0; i < generos.length; i++) {
			 System.out.print((i + 1) + ") " + generos[i]+ " ");
		 }
		 System.out.println();
		 int i = 0;
		 int peliculasGenero = 0;
		 int opcion = Utilidades.ingresarEntero(opcionMinima,  generos.length);
		 generoElegido = String.valueOf(generos[opcion - 1]);
			 while(i < gestor.getArrayPeliculas().length) {
				 if(gestor.getArrayPeliculas()[i].getGenero().equalsIgnoreCase(generoElegido)) {
					 System.out.println((peliculasGenero + 1) + ") "+ "Titulo: " +  gestor.getArrayPeliculas()[i].getTitulo() + " Genero: " +  gestor.getArrayPeliculas()[i].getGenero()
							 + " Formato: " +  gestor.getArrayPeliculas()[i].getFormato());
					 peliculasGenero++;
				 }
				 i++;
			 }

			 System.out.println();
		 }
	 private static void mostrarPeliculas2D(Gestor gestor) {
		 int i = 0;
		int peliculas2D = 0;
		 while(i < gestor.getArrayPeliculas().length) {
			 if(gestor.getArrayPeliculas()[i].getFormato().equalsIgnoreCase("2D")) {
				 System.out.println((peliculas2D + 1) + ") "+ "Titulo: " +  gestor.getArrayPeliculas()[i].getTitulo() + " Genero: " +  gestor.getArrayPeliculas()[i].getGenero()
						 + " Formato: " +  gestor.getArrayPeliculas()[i].getFormato());
				 peliculas2D++;
			 }
			 i++;
		 }

		 System.out.println();
	 }
	 private static void mostrarPeliculas3D(Gestor gestor) {
		 int i = 0;
		int peliculas2D = 0;
		 while(i < gestor.getArrayPeliculas().length) {
			 if(gestor.getArrayPeliculas()[i].getFormato().equalsIgnoreCase("3D")) {
				 System.out.println((peliculas2D + 1) + ") "+ "Titulo: " +  gestor.getArrayPeliculas()[i].getTitulo() + " Genero: " +  gestor.getArrayPeliculas()[i].getGenero()
						 + " Formato: " +  gestor.getArrayPeliculas()[i].getFormato());
				 peliculas2D++;
			 }
			 i++;
		 }

		 System.out.println();
	 }
	 private static void verAsientos(Gestor gestor,  final int opcionMinima, final String[] dias) {
		 int [][] sala;
		 final int ocupado = 2;
		 Random r = new Random();
		 System.out.println("Que pelicula desea ver?");
		 final int minimoHorario = 16;
		 final int maximoHorario = 24;
		  int salaElegida = 0;
		  int numeroSala = 0;
		 int peliculaElegida = Utilidades.ingresarEntero(opcionMinima, gestor.getArrayPeliculas().length) - 1;
		 for(int i = 0; i < dias.length; i++) {
			 System.out.print((i + 1) + ") " + dias[i] + " ");
		 }
		 System.out.println();
		 System.out.println("Seleccione el dia: ");
		 int diaElegido = Utilidades.ingresarEntero(opcionMinima, dias.length) - 1;
		 System.out.println("Seleccione el horario. Tiene que estar entre " + minimoHorario + " y " + maximoHorario);
		 int horarioElegido = Utilidades.ingresarEntero(minimoHorario, maximoHorario);
		 int i = 0;
		 while(i < gestor.getArrayFunciones().length) {
			 if(peliculaElegida == gestor.getArrayFunciones()[i].getIndicePelicula() && diaElegido == gestor.getArrayFunciones()[i].getDia() && horarioElegido == 
			 gestor.getArrayFunciones()[i].getHora()) {
				salaElegida = gestor.getArrayFunciones()[i].getSala();
				 
			 }
			 i++;
		 }
		 int j = 0;
		 while(j < gestor.getArraySalas().length) {
			 if(gestor.getArraySalas()[j].getNumeroSala() == salaElegida) {
				 numeroSala = gestor.getArraySalas()[j].getNumeroSala();
			 }
			 j++;
		 }
		 sala = new int[gestor.getArraySalas()[numeroSala].getFilas()][gestor.getArraySalas()[numeroSala].getColumnas()];
		 for(int filas = 0; filas < gestor.getArraySalas()[numeroSala].getFilas(); filas++) {
			 for(int columnas = 0; columnas < gestor.getArraySalas()[numeroSala].getColumnas(); columnas++) {
				 int asiento = r.nextInt(ocupado) + 1;
				 sala[filas][columnas] = asiento;
			 }
		 }
		 for(int numeros = 1;numeros <= gestor.getArraySalas()[numeroSala].getColumnas(); numeros++) {
			 System.out.print(" " + numeros);
		 }
		 System.out.println();
		 for(int filasReal = 0; filasReal < gestor.getArraySalas()[numeroSala].getFilas(); filasReal++) {
			  char fila = (char) ('A' + filasReal);
			  System.out.print(fila + " ");
			  for(int columnasReal = 0; columnasReal < gestor.getArraySalas()[numeroSala].getColumnas(); columnasReal++) {
				  if(sala[filasReal][columnasReal] == 2) {
					    System.out.print("- ");
				  }
				  if(j == 2) {
					  System.out.print(" ");  
				  }
				  else if(sala[filasReal][columnasReal] == 1){
					  System.out.print("x ");
				  }
				
			  }
			  System.out.println();
	 }
	 }
}

