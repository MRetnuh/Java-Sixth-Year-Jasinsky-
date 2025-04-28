package Utiles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Utilidades {
 public static Scanner s = new Scanner(System.in);
 public static int ingresarEntero(final int min, final int max) {
	 int num = 0;
	 boolean error = false;
	 do {
		 error = false;
		 try {
			 num = s.nextInt();
			 if(num > max || num < min) {
				 System.out.println("Ingrese un numero valido");
				 error = true;
			 }
		 }catch(InputMismatchException e) {
			 System.out.println("Ingrese un numero");
			 error = true;
		 }catch(Exception e) {
			 System.out.println("Ingrese un numero");
			 error = true;
		 }finally {
			 s.nextLine();
		 }
	 }while(error);
	 return num;
 }
}
