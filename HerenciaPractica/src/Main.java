import pokemons.Pikachu;
import pokemons.Raichu;

public class Main {
    public static void main(String[] args) {
        Pikachu pikachu = new Pikachu();
        Raichu raichu = new Raichu();
        System.out.println("Nombre: " + pikachu.getNombre());
        System.out.println("Ataque 1 Danio: " + pikachu.getA1());
        System.out.println("Ataque 2 Danio: " + pikachu.getA2());
        System.out.println("Nombre: " + raichu.getNombre());
        System.out.println("Ataque Danio: " + raichu.getA2());
        raichu.getVelocidadInformacion();
    }
}