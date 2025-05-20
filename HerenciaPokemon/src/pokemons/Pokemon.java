package pokemons;

import java.util.ArrayList;

public abstract class Pokemon {
private String nombre;
protected ArrayList<Tipos> tipo = new ArrayList<>();
private int vida;
protected int cantAtaques = 0;

public Pokemon(String nombre, int vida) {
	this.nombre = nombre;
	this.vida = vida;
}
public void mostrarDatos() {
    System.out.print("Nombre: " + this.nombre + " Tipo: ");
    
    if (this.tipo.size() == 1) {
        System.out.print(this.tipo.get(0));
    } else {
        for (int i = 0; i < this.tipo.size(); i++) {
            System.out.print(this.tipo.get(i));
            if (i < this.tipo.size() - 1) {
                System.out.print(" / ");
            }
        }
    }

    System.out.println(" Vida: " + this.vida + " hp");
}
public String getNombre() {
    return nombre;
}
public int getCantAtaques() {
	return this.cantAtaques;
}
public void quitarVida(int danio) {
	this.vida -= danio;
}
public int getVida() {
	return this.vida;
}
}
