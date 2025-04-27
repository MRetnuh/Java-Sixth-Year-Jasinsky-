import Entidades.Alcalde;
import Entidades.Ciudad;
import Entidades.Tienda;
import Utilidades.Utiles;

public class Principal {
	public static void main(String argc[]) {
		Alcalde jugador;
		Tienda tienda = new Tienda();
		Ciudad ciudad;
		String cheat;
		System.out.println("Bienvenido, ingrese su nombre");
		String nombreJugador = Utiles.s.nextLine();
		System.out.println("Ingrese su apellido");
		String apellido = Utiles.s.nextLine();
		jugador = new Alcalde(nombreJugador, apellido);
		System.out.println("Ahora ingrese el nombre de la ciudad");
		String nombreCiudad = Utiles.s.nextLine();
		System.out.println("Confirme que va a comenzar el juego ingresando algo");
		cheat = Utiles.s.nextLine();
		ciudad = new Ciudad(nombreCiudad, jugador);
		if(cheat.equalsIgnoreCase("TORG")){
			System.out.println("Cheat activado. Dinero obtenido: 2000000000");
			ciudad.getAlcalde().dinero += 2000000000;
		}
		ciudad.mostrarDatos();
		tienda.comprarEdificios(ciudad);
		ciudad.mostrarCiudadFormadaYJugador();
}
}