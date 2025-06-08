package juegos;

import personaje.Jugador;
import utilidades.Utiles;

public class CaraOSeca extends Juego{

	public CaraOSeca() {
		super("Cara o Seca");
	}

	@Override
	public void empezarJuego(Jugador jugador) {
		final int MIN = 1;
		final int MAX = 50;
		Moneda eleccion;
		System.out.println("Bienvenido al cara o ceca");
		System.out.println("Ponga cuanto quiere apostar. El minimo es " + MIN + "  y el maximo es " + MAX);
		 System.out.println("Su dinero: " + jugador.getDinero()); 
		int apuesta = Utiles.ingresarEntero(1, 50);
		jugador.gastarPlata(apuesta);
		
		System.out.println("Elija:");
		for(int i = 0; i < Moneda.values().length; i++) {
			System.out.println((i+ 1) + ")"+ Moneda.values()[i].getNombre());
		}
		
		int opcion = Utiles.ingresarEntero(1, 2);
		eleccion = Moneda.values()[opcion - 1];
		Moneda resultado = Moneda.tirarMoneda();
		
		if(eleccion.equals(resultado)) {
			System.out.println("Acertaste");
			System.out.println("Ganaste " + apuesta * 2);
			jugador.recuperarPlata(apuesta * 2);
			jugador.getMascota().aumentarFelicidad((int)(apuesta * 0.10));
		}
		
		else {
		System.out.println("Fallaste. Era " + resultado.getNombre());
		jugador.getMascota().reducirFelicidad((int)(apuesta * 0.03));
		}
		
        jugador.getMascota().reducirEnergia(5);
        jugador.getMascota().aumentarHambre(3);
        jugador.getMascota().aumentarSuciedad(5);
	}
}
