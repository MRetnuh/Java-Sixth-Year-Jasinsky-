package utilidades;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

import personaje.Jugador;

public final class Utiles {

public static Scanner s = new Scanner(System.in);
public static Random r = new Random();
public static Jugador jugador;	

	private Utiles() {
		
	}
	
public static int ingresarEntero(final int MIN, final int MAX) {
	int num = 0;
	boolean error = false;
	
	do {
		error = false;
		
		try {
			num = s.nextInt();
			
			if(num < MIN || num > MAX) {
				System.out.println("Ingrese un numero valido");
				error = true;
			}
			
		}catch(InputMismatchException e) {
			System.out.println("Ingrese un numero");
			error = true;
		}catch(Exception e) {
			System.err.println("Error");
		}finally {
			String resto = s.nextLine();
			if(resto.equalsIgnoreCase("Cheat")) {
			jugador.activarCheat();
			}
		}
		
	}while(error);
	
	return num;
}
}
