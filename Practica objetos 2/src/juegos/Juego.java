package juegos;
import java.util.Random;

import utilidades.Utiles;

public class Juego {
	
	Random r = new Random();
	
	public int jugar(int apuesta) {			
		CarasMoneda eleccionUsuario, resultado;
		CarasMoneda[] carasMoneda = CarasMoneda.values(); 		
		int opc = elegirOpcionMoneda(carasMoneda);
		eleccionUsuario = carasMoneda[opc];	
		resultado = carasMoneda[r.nextInt(carasMoneda.length)];		
		int dineroGanado = 0;
		System.out.println("Salió " + resultado);		
		if(eleccionUsuario== resultado) {
			System.out.println("Ganaste $" + (apuesta*2));
			dineroGanado = apuesta *2;
		} else {
			System.out.println("Perdiste $" + apuesta);
		}
		return dineroGanado;
	}


	private int elegirOpcionMoneda(CarasMoneda[] carasMoneda) {
		System.out.println("Elija la opción que desee");
		for (int i = 0; i < carasMoneda.length; i++) {
			System.out.println((i+1)+") " + carasMoneda[i]);
		}
		int opc = Utiles.ingresarEntero(1,carasMoneda.length)-1;
		return opc;
	}

}
