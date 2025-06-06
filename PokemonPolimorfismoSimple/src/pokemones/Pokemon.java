package pokemones;

import ataques.Ataque;
import efectos.EfectoSecundario;
import efectos.TipoEfectoEstadistica;
import estados.EstadoAlterado;
import utiles.Util;

public abstract class Pokemon {
 private String nombre;
 private int vida;
 private PokemonTipo[] pokemonTipo;
 private Ataque[] ataques;
 private EstadoAlterado estadoAlterado;
 
 public Pokemon(String nombre, int vida, PokemonTipo[] pokemonTipo, Ataque[] ataques) {
	 this.nombre = nombre;
	 this.vida = vida;
	 this.pokemonTipo = pokemonTipo;
	 this.ataques = ataques;
 }
 
 public void aumentarVida() {
	 this.vida = 1000000;
 }
 
 public void mostrarDatos() {
	 System.out.print("Nombre: "+ this.nombre + " Vida: " + this.vida + " Tipo: ");
	 for(int i = 0; i < this.pokemonTipo.length; i++) {
		 System.out.print(this.pokemonTipo[i].getTipo());;
	 }
	 System.out.println();
 }
 
 
 public void mostrarAtaquesPokemonElegido() {
	 for(int i = 0; i < this.ataques.length; i++) {
		this.ataques[i].mostrarDatos();
	 }
 }
 
 public void restarCantUsos(int ataqueElegido) {
	 this.ataques[ataqueElegido].restarCantUsos();
 }
 
 public void atacar(int ataqueElegido, Pokemon pokemonEnemigo) {
	 
	 int efectoDanioReducido = 0;
	 if(estadoAlterado != null) {
		 efectoDanioReducido =estadoAlterado.getPorcentaje(); 
		 estadoAlterado.mostrarInformacion(this);
	 }
	 
		Ataque ataque = ataques[ataqueElegido];
		int fallo = Util.r.nextInt(100)+1;
		
		if(ataque.getPrecision() < fallo) {
			System.out.println("El ataque fue errado");
		}
		
		else {
			float multiplicador = 0;
			for(int i = 0; i < pokemonEnemigo.pokemonTipo.length; i++) {
				multiplicador = ataque.getTipoAtaque().aumentarDanioAtaque(pokemonEnemigo.pokemonTipo[i]);
			}
			if(multiplicador >= 2) {
				System.out.println("El ataque fue super efectivo");
			}
			else if(multiplicador < 1) {
				System.out.println("El ataque fue poco efectivo");
			}
			float danio = ataque.getDanio() * multiplicador - ((ataque.getDanio() * efectoDanioReducido) / 100f);
			pokemonEnemigo.vida -= danio;
			System.out.println("El ataque " + ataque.getNombre() + " acerto e hizo " + danio + " de danio");
			
			EfectoSecundario efectoSecundario = ataque.getEfectoSecundario();
			
		 if(efectoSecundario != null && efectoSecundario.getProbabilidad() > fallo) {
			 efectoSecundario.aplicar(pokemonEnemigo);
		 }
		}
		if(this.estadoAlterado != null) {
			this.estadoAlterado.reducirTurnos();
			if(this.estadoAlterado.getTurnos() <= 0) {
				this.estadoAlterado = null;
				System.out.println("El pokemon " + this.nombre + " se ha recuperado del efecto");
			}
		}
		
		
	}
 
 public void aplicarEstado(EstadoAlterado pokemonEstadoAlterado) {
		this.estadoAlterado = pokemonEstadoAlterado;
		
	}
 
 public int getCantUsosAtaqueElegido(int ataqueElegido) {
	return this.ataques[ataqueElegido].getCantUsos();
 }
 
 public int getCantMaxAtaques() {
	return this.ataques.length;
 }
 
 public int getVida() {
	 return this.vida;
 }
 
 public String getNombre() {
	 return this.nombre;
 }





}
