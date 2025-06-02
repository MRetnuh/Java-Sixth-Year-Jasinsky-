package personajes;

public abstract class Personaje {
	
private String nombre;
private int vida;
private int energia;

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

public String getNombre() {
	return this.nombre;
}

public int getVida() {
	return this.vida;
}


}
