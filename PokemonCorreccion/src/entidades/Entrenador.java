package entidades;

public class Entrenador {
private String nombre;
private int edad;
private int dinero = 8000;
private int dineroGastado;
private int nivelSuma;
private boolean capturaIniciada = false;
private Pokemon pokemonMenorNivel;
private Pokemon pokemonMayorNivel;
private final int CANTIDADMAXPOKEMONES = 10;
private int pokemonesContador = 0;
Pokemon[] mochila = new Pokemon[CANTIDADMAXPOKEMONES];
private Regiones regionOrigen;

public Entrenador(String nombre, int edad, Regiones regionOrigen) {
	this.nombre = nombre;
	this.edad = edad;
	this.regionOrigen = regionOrigen;
}
public int getDinero() {
	return this.dinero;
}
public int getCANTIDADMAXPOKEMONES() {
	return this.CANTIDADMAXPOKEMONES;
}
public int getPokemonesContador() {
	return this.pokemonesContador;
}
public void conseguirPokemon(Pokemon pokemon) {
	this.mochila[this.pokemonesContador] = pokemon;
	this.pokemonesContador++;
	this.dinero -= pokemon.getCostoCaptura();
	this.capturaIniciada = true;
}
public void mostrarDatos() {
	System.out.println("Tus dato son:");
	System.out.println("Nombre: " + this.nombre + " Edad: " + this.edad + " Dinero: " + this.dinero + 
	" Region: " + this.regionOrigen);
}
public void mostrarPokemones() {
	this.dineroGastado = 0;
	this.nivelSuma = 0;
	if(this.capturaIniciada) {
		System.out.println("Tus pokemones capturados son:");
	for(int i = 0; i < this.pokemonesContador; i++) {
	System.out.println("Nombre: " + this.mochila[i].getNombre() + " Tipo: " + this.mochila[i].getTipo() +
	" Nivel: " + this.mochila[i].getNivel() + " Costo de pokebola: " + this.mochila[i].getCostoCaptura());
	this.dineroGastado += this.mochila[i].getCostoCaptura();
	this.nivelSuma +=  this.mochila[i].getNivel();
	}
	}
	else {
		System.out.println("No hubieron pokemones capturados");
	}
}
public void mostrarPromedioEquipo() {
	if(this.capturaIniciada) {
	System.out.println("El promedio del equipo es: " + (float) this.nivelSuma / (this.pokemonesContador + (this.pokemonesContador < 5 ? 1 : 0 )));
	}
	}
public void mostrarPokemonMayorYMenorNivel() {
if(this.capturaIniciada) {
	this.pokemonMenorNivel = this.mochila[0];
	this.pokemonMayorNivel = this.mochila[0];
    int i = 0;
    while(i < pokemonesContador) {
    	if(this.pokemonMenorNivel.getNivel() > this.mochila[i].getNivel()) {
    		this.pokemonMenorNivel = this.mochila[i];
    	}
    	if(this.pokemonMayorNivel.getNivel() < this.mochila[i].getNivel()) {
    		this.pokemonMayorNivel = this.mochila[i];
    	}
    	i++;
    }
    System.out.println("El pokemon de menor nivel es " + this.pokemonMenorNivel.getNombre() + " de tipo: " + this.pokemonMenorNivel.getTipo() +
    " Nivel: " + this.pokemonMenorNivel.getNivel() + " Costo de pokebola: " + this.pokemonMenorNivel.getCostoCaptura());
    System.out.println("El pokemon de mayor nivel es " + this.pokemonMayorNivel.getNombre() + " de tipo: " + this.pokemonMayorNivel.getTipo() +
    	    " Nivel: " + this.pokemonMayorNivel.getNivel() + " Costo de pokebola: " + this.pokemonMayorNivel.getCostoCaptura());

}
}
public void mostrarDineroGastado() {
System.out.println("El dinero invertido fue " + this.dineroGastado);
}
}
