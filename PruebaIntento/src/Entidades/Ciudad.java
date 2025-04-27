package Entidades;

public class Ciudad {
private String nombre;
final int cantEdificiosCompradosMaxima = 5;
private Edificios[] edificios = new Edificios[cantEdificiosCompradosMaxima];
private Alcalde jugador;
private int edificiosComprados = 0;
public Ciudad(String nombre, Alcalde jugador) {
	this.nombre = nombre;
	this.jugador = jugador;
}
public void getEdificio(Edificios edificios) {
	this.edificios[edificiosComprados] = edificios;
	if(!edificios.getTipo().equals("Maravilla"))
	edificiosComprados++;
}
public boolean comprobadorEdificio(String tipo) {
	boolean comprobador = false;
	int i = 0;
	while(i < edificiosComprados) {
		if(edificios[i].getTipo().equals(tipo)) {
			comprobador = true;
		}
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
