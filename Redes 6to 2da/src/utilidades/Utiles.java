package utilidades;

import java.util.InputMismatchException;
import java.util.Scanner;

public final class Utiles {

    public static Scanner s = new Scanner(System.in);

    private Utiles(){}

    public static int ingresarEntero(final int MIN, final int MAX) {
        int num = 0;
        boolean error;
        do {
            error = false;
            try {
                num = s.nextInt();
                if (num < MIN || num > MAX) {
                    System.out.println("Error. Debe ingresar un número entre " + MIN + " y " + MAX);
                    error = true;
                }
                s.nextLine();
            } catch (InputMismatchException e) {
                    System.out.println("Error. El valor ingresado no es un número entero");
                    s.nextLine();

                error = true;
            } catch (Exception e) {
                System.out.println("Error no contemplado " + e.getMessage());
            }
        } while (error);
    return num;
    }

    public static int ingresarEntero(final int MIN, final int MAX, Scanner s) {
        int num = 0;
        boolean error;
        do {
            error = false;
            try {
                num = s.nextInt();
                if (num < MIN || num > MAX) {
                    System.out.println("Error. Debe ingresar un número entre " + MIN + " y " + MAX);
                    error = true;
                }
                s.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Error. El valor ingresado no es un número entero");
                s.nextLine();

                error = true;
            } catch (Exception e) {
                System.out.println("Error no contemplado " + e.getMessage());
            }
        } while (error);
        return num;
    }

    public static String ingresarTexto() {
        return s.nextLine();
    }

    public static void cerrarEscaner(){
        s.close();
    }

    public static void esperar(int milis){
        try {
            Thread.sleep(milis);
        } catch (InterruptedException e) {
            System.out.println("Error al esperar: " + e.getMessage());
        }
    }

}
