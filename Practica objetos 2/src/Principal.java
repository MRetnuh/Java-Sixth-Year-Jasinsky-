import entidades.Jugador;
import juegos.Juego;
import utilidades.Utiles;

public class Principal {
	
	private static boolean finJuego = false;
	private static Jugador jugador;		
	private static Juego juego;	
	
	public static void main(String[] args) {
		System.out.println("Bienvenidos al cara o ceca");
		System.out.println("Ingrese su nombre");
		String nombre = Utiles.s.nextLine();
		
		jugador = new Jugador(nombre);
		juego = new Juego();
		
		do {
			
			System.out.println("MENU");
			System.out.println("1) Jugar");
			System.out.println("2) Salir");
			int opc = Utiles.ingresarEntero(1, 2);
			
			switch(opc) {
			case 1:
				jugarJuego();
				break;
			case 2:
				System.out.println("Adios");
				finJuego = true;
				break;
			default:
				System.out.println("La opción ingresada no es correcta");
			}		
			
		} while(!finJuego);
		
	}

	private static boolean jugarJuego() {
		jugador.mostrarDatos();			
		
		int apuesta = jugador.ingresarApuesta();		
		if(apuesta>0) {
			int ganancia = juego.jugar(apuesta);
			jugador.dinero += ganancia;
		} else {
			System.out.println("Fuera de mi casino");
		}
		if(jugador.dinero < 1) {
			System.out.println("Se te terminó la guita. Nos vemos");
			finJuego = true;
		}
		return finJuego;
	}

}