package comidas;

import interfaces.Mostrable;

public abstract class Comida implements Mostrable{
private int hambreReducida;
private int costo;
private String nombre;
private int cantidad = 1;
private int suenio =7;
private int suciedad = 5;

public Comida(String nombre, int costo, int hambreReducida) {
	this.nombre = nombre;
	this.hambreReducida = hambreReducida;
	this.nombre = nombre;
}

public void aumentarCantidad() {
	this.cantidad++;
}

public void reducirCantidad() {
	this.cantidad--;
}

public void mostrarDatos() {
	System.out.println("Nombre: " + this.nombre + " Hambre reducida: " + this.hambreReducida + " Cantidad: " + this.cantidad);
}

@Override
public void mostrar() {
    System.out.println(this.nombre);
}

public int getSuciedad() {
	return this.suciedad;
}

public int getSuenio() {
	return this.suenio;
}

public int getCosto() {
	return this.costo;
}

public int getCantidad() {
	return this.cantidad;
}

public String getNombre() {
	return this.nombre;
}


}
