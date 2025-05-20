package utilidades;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public final class Utiles {
public static Scanner s = new Scanner (System.in);
public static Random r = new Random(); //no se permite en una prueba poner una variable random en Utiles
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
			s.nextLine();
		}
	}while(error);
	return num;
}
}
