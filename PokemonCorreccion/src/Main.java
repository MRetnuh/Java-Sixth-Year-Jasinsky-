import entidades.Entrenador;
import entidades.Regiones;
import entidades.ZonaCaptura;
import utilidades.Utiles;

public class Main {
public static void main(String[] args) {
	ZonaCaptura zonaCaptura = new ZonaCaptura();
	System.out.println("Bienvenido al juego de captura de pokemones");
	Entrenador entrenador = crearJugador();
	entrenador.mostrarDatos();
	zonaCaptura.ingresarZonaPokemones(entrenador);
	entrenador.mostrarDatos();
	entrenador.mostrarPokemones();
	entrenador.mostrarPromedioEquipo();
	entrenador.mostrarPokemonMayorYMenorNivel();
	entrenador.mostrarDineroGastado();
	
}
	private static Entrenador crearJugador() {
		final int EDADMINIMA = 10;
		final int EDADMAXIMA = 99;
		String nombre;
		int edad;
		int regionElegida;
		System.out.println("Ingrese su nombre");
		nombre = Utiles.s.nextLine();
		System.out.println("Ingrese su edad. Debe estar entre " + EDADMINIMA + " y " + EDADMAXIMA);
		edad = Utiles.ingresarEntero(EDADMINIMA, EDADMAXIMA);
		System.out.println("Elija la region:");
		for(int i = 0; i < Regiones.values().length; i++) {
			System.out.print((i + 1) + ")" + Regiones.values()[i] + " ");
		}
		regionElegida = Utiles.ingresarEntero(1, Regiones.values().length)-1;
		return new Entrenador(nombre, edad, Regiones.values()[regionElegida]);
	
}
}

