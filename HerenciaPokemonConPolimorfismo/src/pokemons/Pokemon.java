package pokemons;

public enum Pokemon {

    PIKACHU("Pikachu"),
    BULBASAUR("Bulbasaur"),
    CHARMANDER("Charmander"),
    EKANS("Ekans"),
    SQUIRTLE("Squirtle"),
    STARYU("Staryu");

    private String nombre;

    Pokemon(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }
}
