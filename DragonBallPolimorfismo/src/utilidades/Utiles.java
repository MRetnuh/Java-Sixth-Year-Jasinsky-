package utilidades;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public final class Utiles {
	
 private Utiles() {
	 
 }
public static Scanner s = new Scanner (System.in);
public static Random r = new Random();

public static int generarRandomEntreNumeros(final int MIN, final int MAX) {
	return (MAX - MIN + 1) + MIN;
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
		}
		finally {
			s.nextLine();
		}
	}while(error);
	return num;
}
}
