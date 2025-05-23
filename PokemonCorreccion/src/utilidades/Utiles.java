package utilidades;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Utiles {
public static Scanner s = new Scanner(System.in);
public static int ingresarEntero(final int MIN, final int MAX) {
	boolean error = false;
	int num = 0;
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
