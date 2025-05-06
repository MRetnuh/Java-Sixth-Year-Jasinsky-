package entidades;

import utilidades.Utiles;

public class Jugador {

	private String nombre;
	public int dinero;
	
	public Jugador(String nombre) {
		this.nombre = nombre;
		this.dinero = 100;
	}

	public int ingresarApuesta() {
		int apuesta = -1;
		if(dinero>0) {
			System.out.println("Ingrese su apuesta (1-"+dinero+")");
			apuesta = Utiles.ingresarEntero(1, dinero);
			dinero -= apuesta;
		} else {
			System.out.println("No se admite gente sin dinero");
		}
		return apuesta;
	}
	
	public void mostrarDatos() {
		System.out.println("Datos del jugador");
		System.out.println("Nombre: " + this.nombre);
		System.out.println("Dinero $: " + this.dinero);
		System.out.println();
	}
}
