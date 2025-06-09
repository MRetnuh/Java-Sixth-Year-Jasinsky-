package personajes;

import utilidades.Utiles;

public class Usuario {
private Personaje personajeElegido;
private String nombre;

public Usuario(String nombre) {
	this.nombre = nombre;
}

public void elegirPersonaje(Personaje personajeEscogido) {
	this.personajeElegido = personajeEscogido;
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


public Personaje getPersonajeElegido() {
	return this.personajeElegido;
}

}
