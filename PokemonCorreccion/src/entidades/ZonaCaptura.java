package entidades;

import utilidades.Utiles;

public class ZonaCaptura {
	private final int NOMBRECOLUMNA = 0;
	private final int TIPOCOLUMNA = 1;
	private final int NIVELCOLUMNA = 2;
	private final int COSTOCOLUMNA = 3;
	final int OPCIONMINIMA = 1;
	  private final String[][] POKEMONES_DISPONIBLES = {
			  {"Pikachu", "ELÉCTRICO", "15", "1000"}, 
			  {"Charmander", "FUEGO", "16", "1200"}, 
			  {"Squirtle", "AGUA", "16", "1200"},
	            {"Bulbasaur", "PLANTA", "16", "1200"}, 
	            {"Geodude", "ROCA", "12", "800"}, 
	            {"Pidgey", "VOLADOR", "10", "600"},
	            {"Gastly", "FANTASMA", "14", "1100"}, 
	            {"Abra", "PSÍQUICO", "15", "1300"},
	            {"Machop", "LUCHA", "13", "900"},
	            {"Eevee", "NORMAL", "15", "1500"}, 
	            {"Magikarp", "AGUA", "5", "200"}, 
	            {"Dratini", "DRAGÓN", "20", "2500"},
	            {"Meowth", "NORMAL", "12", "700"}, 
	            {"Ponyta", "FUEGO", "17", "1400"},
	            {"Staryu", "AGUA", "14", "1000"},
	            {"Voltorb", "ELÉCTRICO", "13", "800"}, 
	            {"Cubone", "TIERRA", "15", "1100"}, 
	            {"Koffing", "VENENO", "15", "1200"},
	            {"Tangela", "PLANTA", "18", "1600"}, 
	            {"Scyther", "BICHO", "22", "2200"},
	            {"Jynx", "HIELO", "20", "1800"},
	            {"Electabuzz", "ELÉCTRICO", "23", "2300"},
	            {"Magmar", "FUEGO", "23", "2300"}, 
	            {"Lapras", "AGUA", "25", "2800"},
	            {"Snorlax", "NORMAL", "30", "3500"}, 
	            {"Dragonite", "DRAGÓN", "35", "4500"}, 
	            {"Mew", "PSÍQUICO", "40", "6000"},
	            {"Mewtwo", "PSÍQUICO", "50", "7500"}};

public void ingresarZonaPokemones(Entrenador entrenador) {
	System.out.println("Bienvenido a la zona de pokemones");
	int opcion;
	boolean capturaFinalizada = false;
	System.out.println("Que desea hacer?");
	do {
		System.out.println("1) Irse");
		System.out.println("2) Capturar pokemones");
		opcion = Utiles.ingresarEntero(OPCIONMINIMA, 2);
		if(opcion == OPCIONMINIMA) {
			System.out.println("Gracias por jugar");
			capturaFinalizada = true;
		}
		else {
			capturarPokemones(entrenador);
		}
	}while(!capturaFinalizada);
}
private void capturarPokemones(Entrenador entrenador) {
	System.out.println("Pokemones disponibles:");
	mostrarPokemones();
	System.out.println("Captura el pokemon eligiendo el numero a lado de este: ");
	int opcion;
	opcion = Utiles.ingresarEntero(OPCIONMINIMA, POKEMONES_DISPONIBLES.length) - 1;
	if(entrenador.getDinero() < Integer.valueOf(this.POKEMONES_DISPONIBLES[opcion][COSTOCOLUMNA])) {
		System.out.println("No tenes el dinero suficiente pa");
	}
	else if(entrenador.getCANTIDADMAXPOKEMONES() == entrenador.getPokemonesContador()) {
		System.out.println("Ya capturaste el limite permitido de pokemones, el cual es " + 
	     entrenador.getCANTIDADMAXPOKEMONES() + ". Dejalos en paz flac@");
	}
	else {
		Pokemon pokemon = new Pokemon(this.POKEMONES_DISPONIBLES[opcion][NOMBRECOLUMNA], this.POKEMONES_DISPONIBLES[opcion][TIPOCOLUMNA],
		Integer.valueOf(this.POKEMONES_DISPONIBLES[opcion][NIVELCOLUMNA]),Integer.valueOf(this.POKEMONES_DISPONIBLES[opcion][COSTOCOLUMNA]));
	    entrenador.conseguirPokemon(pokemon);
	    System.out.println("Felicidades, le quitaste la vida al pokemon: ");
	    System.out.println("Nombre: " + POKEMONES_DISPONIBLES[opcion][NOMBRECOLUMNA] + " .Tipo: "
	    + POKEMONES_DISPONIBLES[opcion][TIPOCOLUMNA] + " .Nivel: " + POKEMONES_DISPONIBLES[opcion][NIVELCOLUMNA] + " .Costo de Pokebola: "
	    + POKEMONES_DISPONIBLES[opcion][COSTOCOLUMNA]);
	    System.out.println("Dinero restante: " + entrenador.getDinero());
	}
}
private void mostrarPokemones() {
	for(int i = 0; i < this.POKEMONES_DISPONIBLES.length; i++) {
		System.out.println((i + 1) + ")" + "Nombre: " + this.POKEMONES_DISPONIBLES[i][NOMBRECOLUMNA] + " .Tipo: "
		+ this.POKEMONES_DISPONIBLES[i][TIPOCOLUMNA] + " .Nivel: " + this.POKEMONES_DISPONIBLES[i][NIVELCOLUMNA] + " .Costo de Pokebola: "
		+ this.POKEMONES_DISPONIBLES[i][COSTOCOLUMNA]);
	}
}
}
