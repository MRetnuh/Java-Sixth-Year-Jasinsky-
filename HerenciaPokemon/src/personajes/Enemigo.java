package personajes;

import pokemons.Bulbasaur;
import pokemons.Ekans;
import pokemons.Staryu;
import utilidades.Utiles;

public class Enemigo extends Personaje {
	private Bulbasaur p1;
	private Staryu p2;
	private Ekans p3;
public Enemigo() {
	super("Gary Oak");
	this.p1 = new Bulbasaur();
	this.p2 = new Staryu();
	this.p3 = new Ekans();
}
public void mostrarPokemonActivo() {
    switch(super.pokemonActivo){
        case 1:
            this.p1.mostrarDatos();
            break;
        case 2:
            this.p2.mostrarDatos();
            break;
        case 3:
            this.p3.mostrarDatos();
            break;
        default:
            System.out.println("No hay pokemon activo");
    }
}
public void elegirPokemonAleatorio(int opcion) {
	super.pokemonActivo = Utiles.r.nextInt(3) + 1;
}
public void quitarVidaPokemonActivo(int danio) {
	switch(super.pokemonActivo) {
	case 1:
		this.p1.quitarVida(danio);
		if(this.p1.getVida() <= 0) {
		       System.out.println("El pokemon " + this.p1.getNombre() + " fue culeado");
		       super.pokemonActivo = 2;
		       super.pokemonesDerrotados++;
		}
		break;
	case 2:
		this.p2.quitarVida(danio);
		if(this.p2.getVida() <= 0) {
		       System.out.println("El pokemon " + this.p2.getNombre() + " fue culeado");
		       super.pokemonActivo = 3;
		       super.pokemonesDerrotados++;
		}
		break;
	case 3:
		this.p3.quitarVida(danio);
		if(this.p3.getVida() <= 0) {
		       System.out.println("El pokemon " + this.p3.getNombre() + " fue culeado");
		       super.pokemonActivo = 0;
		       super.pokemonesDerrotados++;
		}
		break;
	  default:
          System.out.println("No hay pokemon activo");
	}
	
}
public void atacar(Jugador jugador) {
	System.out.println("Ataque del enemigo: ");
	int opcAtaque = Utiles.r.nextInt(4) + 1;
	int danio = 0;
	int nroRandom = Utiles.r.nextInt(100) + 1;
	switch(super.pokemonActivo) {
	case 1:
		if(nroRandom > this.p1.getPrecAtaque(opcAtaque)) {
			System.out.println("Ataque fallido");
		}
		else {
			danio = p1.obtenerDanoAtaque(opcAtaque) ;
			jugador.quitarVidaPokemonActivo(danio);
			System.out.println(this.p1.getNombre() + " ha usado " + this.p1.getNombreAtaque(opcAtaque) + " y su danio fue " + danio);
		}
		break;
	case 2:
		if(nroRandom > this.p2.getPrecAtaque(opcAtaque)) {
			System.out.println("Ataque fallido");
		}
		else {
			danio = p2.obtenerDanoAtaque(opcAtaque) ;
			jugador.quitarVidaPokemonActivo(danio);
		}
		break;
	case 3: 
		if(nroRandom > this.p3.getPrecAtaque(opcAtaque)) {
			System.out.println("Ataque fallido");
		}
		else {
			danio = p3.obtenerDanoAtaque(opcAtaque) ;
			jugador.quitarVidaPokemonActivo(danio);
		}
		break;
		default: 
			 System.out.println("No hay pokemon activo");
	}
	
}
}

