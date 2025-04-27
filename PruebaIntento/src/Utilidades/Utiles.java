package Utilidades;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Utiles {
public static Scanner s = new Scanner(System.in);
public static int ingresarEntero(final int numeroMin, final int numeroMax) {
	int num = 0;
    boolean error = false;
    do {
    	error = false;
    	try {
    		num = s.nextInt();
    		if(num > numeroMax || num < numeroMin) {
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
