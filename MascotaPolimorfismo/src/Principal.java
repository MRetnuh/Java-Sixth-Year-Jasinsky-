import comidas.Comida;
import comidas.Tienda;
import hilos.Tiempo;
import juegos.CaraOSeca;
import juegos.Craps;
import juegos.Juego;
import mascotas.Kibo;
import mascotas.Koi;
import mascotas.Mascota;
import mascotas.MascotaDisponible;
import mascotas.Mecca;
import opciones.Opcion;
import personaje.Jugador;
import utilidades.Utiles;

public class Principal {
private static String[] nombresDisponibles = {"Juan", "Akame", "Najenda", "Pepe", "Rodolfo", "Leone", "Esdeath", "Seryu", 
"Koro", "Simon", "Vegeta"};
private static Jugador jugador;
private static boolean finJuego = false;
private static  Tiempo tiempoContador = new Tiempo();
	public static void main(String[] args) {
		crearJugador();
		escogerNombreMascota();
		Utiles.jugador = jugador;
		empezarJuego();
		tiempoContador.start();
		Utiles.s.close();
	}
	
	
	private static void empezarJuego() {
		do {
			tiempoContador.start();
			jugador.mostrarEstadisticas();
            System.out.println("Que desea hacer?");
			mostrarMenuElegirOpc();
			int opc = Utiles.ingresarEntero(1, Opcion.values().length);
			mostrarOpciones(opc);
		}while(!finJuego);
	}
	

    private static void mostrarOpciones(int opc) {
    	 switch(opc){
         case 1:
        	 System.out.println("Elija a que juego desea jugar");
             System.out.println("1. Cara o Ceca");
             System.out.println("2. Craps");
             System.out.println("3. Ninguno");
             int opcJuego = Utiles.ingresarEntero(1, 3);
             
             if(jugador.getDinero() <= 0) {
            	 System.out.println("No tenes plata wacho");
            	 return;
             }
             
             if(opcJuego == 3) {
                 System.out.println("Decida jugar cuando usted quiera");
                 return;
             }
             else {
            	 Juego juegoElegido = elegirJuego(opcJuego);
            	 juegoElegido.empezarJuego(jugador);
             }
             
             break;
         case 2:
        	 Comida comidaElegida = jugador.alimentarMascota();
        	 if(comidaElegida != null) {
        		 jugador.getMascota().comer(comidaElegida);
        	 }
             break;
         case 3:
        	 Tienda.comprarComida(jugador);
             break;
         case 4:
        	 jugador.getMascota().baniarse();
             break;
         case 5:
             break;
         case 6:
        	 jugador.getMascota().mostrarEstadisticas();
             break;
         case 7:
        	 jugador.getMascota().dormir();
             break;
         case 8:
        	 finJuego = true;
             System.out.println("Gracias por jugar. ¡Hasta la próxima!");
             break;
     }
 }
	
    private static Juego elegirJuego(int opc) {
    	Juego juegoElegido = new CaraOSeca();
    	if(opc == 2) {
    		juegoElegido = new Craps();
    	}
        return juegoElegido;
     }
    


	private static void mostrarMenuElegirOpc() {
         Utiles.mostrarLista(Opcion.values());
    }
	
	private static void crearJugador() {
		Mascota mascotaElegida;
		String nombreJugador;
		int opcion;
		int mascota;
		System.out.println("Bienvenido a un simulador de comprar y cuidar una mascota");
		System.out.println("Cree su jugador. Elija si quiere ponerse un nombre o tener uno al azar");
		System.out.println("1) Elegir nombre");
		System.out.println("2) Al azar");
		opcion = Utiles.ingresarEntero(1, 2);
		
		if(opcion == 1) {
			System.out.println("Ingrese su nombre");
			nombreJugador = Utiles.s.nextLine();
		}
		else {
			nombreJugador = nombresDisponibles[Utiles.r.nextInt(nombresDisponibles.length)];
		}
		
		System.out.println("Elija su mascota:");
		Utiles.mostrarLista(MascotaDisponible.values());
		
		mascota = Utiles.ingresarEntero(1, MascotaDisponible.values().length);
		
	    mascotaElegida = elegirMascota(mascota);
	    
	    System.out.println("Su mascota es un " + (MascotaDisponible.values()[mascota - 1].getNombrePredeterminado()));
		
		jugador = new Jugador(nombreJugador, mascotaElegida);
	}
	
	private static void escogerNombreMascota() {
		String mascotaNombre;
		System.out.println("Desea ponerle un nombre a su mascota o que sea al azar?");
		System.out.println("1) Elegir nombre");
		System.out.println("2) Al azar");
        int opcion = Utiles.ingresarEntero(1, 2);
		if(opcion == 1) {
			System.out.println("Ingrese el nombre");
			mascotaNombre = Utiles.s.nextLine();
		}
		else {
			mascotaNombre = nombresDisponibles[Utiles.r.nextInt(nombresDisponibles.length)];
		}
		
		jugador.getMascota().cambiarNombre(mascotaNombre);
	}
	
	private static Mascota elegirMascota(int opc) {
		Mascota mascotaElegida = new Mecca();
		
		switch(opc) {
		case 1: 
			mascotaElegida = new Mecca();
			break;
		case 2: 
			mascotaElegida = new Kibo();
			break;
		case 3: 
			mascotaElegida = new Koi();
			break;
		}
		return mascotaElegida;
	}
	
}
