
package Entidades;

public class Ciudad {
private String nombre;
final int cantEdificiosCompradosMaxima = 30;
private Edificios[] edificios = new Edificios[cantEdificiosCompradosMaxima];
private Alcalde jugador;
private int edificiosComprados = 0;
public Ciudad(String nombre, Alcalde jugador) {
	this.nombre = nombre;
	this.jugador = jugador;
}
public void mostrarDatos() {
	System.out.println("Nombre del alcalde: " + jugador.getNombre() + " Dinero: " + jugador.getDinero() + " Nombre de Ciudad: " + this.nombre);
}
public void mostrarCiudadFormadaYJugador() {
	mostrarDatos();
	System.out.println("Ciudad formada: ");
	for(int i = 0; i < edificiosComprados; i++) {
		System.out.println((i + 1) + ") " + "Nombre: " + edificios[i].getNombre() + " Tipo: " + edificios[i].getTipo() + " Seguridad: " + edificios[i].getSeguridad()
	+ " PrevIncendios: " + edificios[i].getprevIncendios() + " Felicidad: "+ edificios[i].getFelicidad() + " Precio: " + edificios[i].getPrecio());
	
}
}
public void getEdificio(Edificios edificios) {
	this.edificios[edificiosComprados] = edificios;
	if(!edificios.getTipo().equals("Maravilla")) {
	edificiosComprados++;
}
}
public boolean comprobadorEdificio(String tipo) {
	boolean comprobador = false;
	int i = 0;
	while(i < edificiosComprados) {
		if(tipo.equals(this.edificios[i].getTipo())) {
			comprobador = true;
		}
		i++;
	}
	return comprobador;
}
public int getAlcaldeDinero() {
	return this.jugador.getDinero();
}
public Alcalde getAlcalde() {
	return this.jugador;
}
public int getEdificiosComprados() {
	return edificiosComprados;
}
}
