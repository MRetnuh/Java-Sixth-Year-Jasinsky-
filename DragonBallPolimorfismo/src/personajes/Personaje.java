package personajes;

import ataques.Ataques;

public abstract class Personaje {
	
private String nombre;
private int vida;
private int energia;
protected Ataques[] ataques = new Ataques[0];
public Personaje(String nombre, int vida, int energia) {
	this.nombre = nombre;
	this.vida = vida;
	this.energia = energia;
}

public boolean comprobarDerrota(Personaje enemigo) {
	if(enemigo.getVida() <= 0) {
		return true;
	}
	else {
		return false;
	}
}

public void atacar(Personaje enemigo) {
}

public void elegirAtaque() {
	
}

public String getNombre() {
	return this.nombre;
}

public int getVida() {
	return this.vida;
}


}
