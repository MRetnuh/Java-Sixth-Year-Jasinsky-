package personajes;

import pokemons.Charmander;
import pokemons.Pikachu;
import pokemons.Squirtle;
import utilidades.Utiles;

public class Jugador extends Personaje{
	private Pikachu p1;
	private Charmander p2;
	private Squirtle p3;
	
public Jugador(String nombre) {
	super(nombre);
	this.p1 = new Pikachu();
	this.p2 = new Charmander();
	this.p3 = new Squirtle();
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

public void mostrarMenuAtaques(Enemigo enemigo) {
	System.out.println("Seleccione el ataque que desee usar: ");
	int opcAtaque;
	int danio = 0;
	boolean ataqueValido = true;
	int nroRandom = Utiles.r.nextInt(100) + 1;
	int cantUsos;
	switch(super.pokemonActivo) {
	case 1:
		p1.ejecutarMenuAtaques();
		do {
         ataqueValido = true;
		opcAtaque = Utiles.ingresarEntero(1, this.p1.getCantAtaques());
		cantUsos = this.p1.getCantUsosAtaque(opcAtaque);
		if(cantUsos != 0) {
		if(nroRandom > this.p1.getPrecAtaque(opcAtaque)) {
			System.out.println("Ataque fallido");
		}
		else {
			danio = p1.obtenerDanoAtaque(opcAtaque) ;
			System.out.println(this.p1.getNombre() + " ha usado " + this.p1.getNombreAtaque(opcAtaque) + " y su danio fue " + danio);
            enemigo.quitarVidaPokemonActivo(danio);
		}
		}
		else {
			 System.out.println("El ataque que seleccionó no puede ser utilizado");
             System.out.println("Vuelva a ingresar el ataque que desea ejecutar");
             ataqueValido = false;
		}
		}while(!ataqueValido);
		break;
	case 2:
		p2.ejecutarMenuAtaques();
		do {
         ataqueValido = true;
		opcAtaque = Utiles.ingresarEntero(1, this.p2.getCantAtaques());
		cantUsos = this.p2.getCantUsosAtaque(opcAtaque);
		if(cantUsos != 0) {
		if(nroRandom > this.p1.getPrecAtaque(opcAtaque)) {
			System.out.println("Ataque fallido");
		}
		else {
			danio = p2.obtenerDanoAtaque(opcAtaque) ;
			System.out.println(this.p2.getNombre() + " ha usado " + this.p2.getNombreAtaque(opcAtaque) + " y su danio fue " + danio);
            enemigo.quitarVidaPokemonActivo(danio);
		}
		}
		else {
			 System.out.println("El ataque que seleccionó no puede ser utilizado");
             System.out.println("Vuelva a ingresar el ataque que desea ejecutar");
             ataqueValido = false;
		}
		}while(!ataqueValido);
		break;
	case 3: 
		p3.ejecutarMenuAtaques();
		do {
         ataqueValido = true;
		opcAtaque = Utiles.ingresarEntero(1, this.p3.getCantAtaques());
		cantUsos = this.p1.getCantUsosAtaque(opcAtaque);
		if(cantUsos != 0) {
		if(nroRandom > this.p3.getPrecAtaque(opcAtaque)) {
			System.out.println("Ataque fallido");
		}
		else {
			danio = p3.obtenerDanoAtaque(opcAtaque) ;
			System.out.println(this.p3.getNombre() + " ha usado " + this.p3.getNombreAtaque(opcAtaque) + " y su danio fue " + danio);
            enemigo.quitarVidaPokemonActivo(danio);
		}
		}
		else {
			 System.out.println("El ataque que seleccionó no puede ser utilizado");
             System.out.println("Vuelva a ingresar el ataque que desea ejecutar");
             ataqueValido = false;
		}
		}while(!ataqueValido);
		break;
		default: 
			 System.out.println("No hay pokemon activo");
	}
	
}

public void quitarVidaPokemonActivo(int danio) {
	switch(super.pokemonActivo) {
	case 1:
		this.p1.quitarVida(danio);
		if(this.p1.getVida() <= 0) {
		       System.out.println("Tu pokemon " + this.p1.getNombre() + " fue culeado");
		       super.pokemonActivo = 2;
		       super.pokemonesDerrotados++;
		}
		break;
	case 2:
		this.p2.quitarVida(danio);
		if(this.p2.getVida() <= 0) {
		       System.out.println("Tu pokemon " + this.p2.getNombre() + " fue culeado");
		       super.pokemonActivo = 3;
		       super.pokemonesDerrotados++;
		}
		break;
	case 3:
		this.p3.quitarVida(danio);
		if(this.p3.getVida() <= 0) {
		       System.out.println("Tu pokemon " + this.p3.getNombre() + " fue culeado");
		       super.pokemonActivo = 0;
		       super.pokemonesDerrotados++;
		}
		break;
	  default:
          System.out.println("No hay pokemon activo");
	}
	
}
}
