package personaje;

import java.util.ArrayList;

import comidas.Comida;
import mascotas.Mascota;
import utilidades.Utiles;

public class Jugador {
private String nombre;
private Mascota mascotaElegida;
private int dinero = 10000;   
private ArrayList<Comida> comidas = new ArrayList<>();
public Jugador(String nombre, Mascota mascotaElegida) {
	this.nombre = nombre;
	this.mascotaElegida = mascotaElegida;
}


public void mostrarEstadisticas() {
	System.out.println("Nombre: " + this.nombre);
	System.out.println("Dinero: " + this.dinero);
	System.out.println("Mascota: ");
	this.mascotaElegida.mostrarEstadisticas();
}

public void gastarPlata(int cantidad) {
	this.dinero -= cantidad;
}

public void activarCheat() {
	System.out.println("Cheat activado");
	this.dinero = 1000000000;
}

public void recuperarPlata(int cantidad) {
	this.dinero += cantidad;
}

public void comprarComida(Comida comidaElegida) {
	boolean compradoAntes = comprobarSiExiste(comidaElegida);
	if(!compradoAntes) {
	this.comidas.add(comidaElegida);
	}
}

public Comida alimentarMascota() {
	Comida comidaElegida = null;
	System.out.println("Con que comida quiere a su mascota");
	mostrarComidas();
	if(this.comidas.size() == 0) {
		System.out.println("No tiene ninguna comida");
		return null;
	}
	
	else {

		int opc = Utiles.ingresarEntero(1, this.comidas.size()) - 1;
		comidaElegida = this.comidas.get(opc);
		this.comidas.get(opc).reducirCantidad();
		if(this.comidas.get(opc).getCantidad() == 0) {
			this.comidas.remove(opc);
		}
	}
	
	return comidaElegida;
}

private void mostrarComidas() {
	for(int i = 0; i < this.comidas.size(); i++) {
		this.comidas.get(i).mostrarDatos();
	}
}

private boolean comprobarSiExiste(Comida comidaComprada) {
	int i = 0;
	boolean compradoAntes = false;
	while(i < this.comidas.size() && !compradoAntes) {
		if(this.comidas.get(i).getNombre().equals(comidaComprada.getNombre())){
			this.comidas.get(i).aumentarCantidad();
			compradoAntes = true;
		}
		i++;
	}
	return compradoAntes;
}

public int getDinero() {
	return this.dinero;
}

public Mascota getMascota() {
	return this.mascotaElegida;
}
}
