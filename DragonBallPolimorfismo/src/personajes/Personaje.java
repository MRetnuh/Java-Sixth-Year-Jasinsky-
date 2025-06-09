package personajes;

import ataques.Ataque;
import efectos.EfectoCeguera;
import efectos.EfectoSecundario;
import estado.EstadoAlterado;
import utilidades.Utiles;

public abstract class Personaje {
	
private String nombre;
private int vida;
private int energia;
private EstadoAlterado estadoAlterado;

protected Ataque[] ataques;

public Personaje(String nombre, int vida, int energia, Ataque[] ataques) {
	this.nombre = nombre;
	this.vida = vida;
	this.energia = energia;
	this.ataques = ataques;
}

public boolean comprobarDerrota(Personaje enemigo) {
	if(enemigo.vida <= 0) {
		return true;
	}
	else {
		return false;
	}
}

public void atacar(Personaje enemigo) {
	if(estadoAlterado == null) {
	int ataqueEscogido = elegirAtaque();
	if(this.ataques[ataqueEscogido].getDanio() == 0) {
        this.ataques[ataqueEscogido].ejecutarAtaque();
	}
	
	else {
	int danio =  this.ataques[ataqueEscogido].ejecutarAtaque();
	
	if(danio > 0) {
	enemigo.vida -= danio;
	System.out.println("El ataque " + this.ataques[ataqueEscogido].getNombre() + " acerto y causo " + danio + " de danio");
	}
	
	else {
		System.out.println("El ataque fallo");
	}
	}
	}
	else {
		
	}
	
}

public int elegirAtaque() {
	boolean ataqueValido = true;
	int ataqueElegido;
	System.out.println("Elija un ataque:");
	do {
		for(int i = 0; i < this.ataques.length; i++) {
		this.ataques[i].mostrarDatos();
		}
	ataqueElegido = Utiles.ingresarEntero(1, this.ataques.length) - 1;
	if(this.energia < this.ataques[ataqueElegido].getEnergia()) {
		System.out.println("No tenes ki suficiente");
		System.out.println("Elija otro ataque");
		ataqueValido = false;
	}
	}while(!ataqueValido);
	
	return ataqueElegido;
}

public void mostrarDatos() {
	System.out.println("Personaje: " + this.nombre);
	System.out.println("Vida: " + this.vida);
	System.out.println("Energia: " + this.energia);
}

public String getNombre() {
	return this.nombre;
}

public int getVida() {
	return this.vida;
}

public Ataque[] getAtaques() {
return this.ataques;
}

}
