package pokemones;

public enum PokemonDisponible {
PIKACHU("Pikachu"),
CHARMANDER("Charmander"),
BURBASAUR("Burbasaur"),
SQUIRTLE("Squirtle");
	
	private String nombre;
	
	PokemonDisponible(String nombre){
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return this.nombre;
	}
}
