package utilidades;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Utiles {
	
	public static Scanner s = new Scanner(System.in);
	
	public static int ingresarEntero(final int MIN, final int MAX) {
		
		
		
		int opc = 0;
		boolean error = false;
		
		do {
			error = false;
			
			try {
				opc = s.nextInt();
				if(opc < MIN || opc > MAX) {
					error = true;
					System.out.println("Error. El número esta fuera del rango. Debe estar entre " + MIN + " y " + MAX);
				}
			} catch(InputMismatchException e) {
				error = true;
				System.out.println("Error. Tipo de dato mal ingresado.");
			} catch(Exception e) {
				System.out.println("Error no contemplado");
			} finally {
				s.nextLine();
				if(error) {
					System.out.println("Vuelva a ingresar");
				}
			}
			
		} while(error);
		
		return opc;
		
	}
}
	
	