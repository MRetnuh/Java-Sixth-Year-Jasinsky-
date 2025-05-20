package personajes;

public abstract class Personaje {

    private String nombre;
    protected int pokemonActivo = 1;
   protected int pokemonesDerrotados = 0;
   private boolean derrota = false;
    public Personaje(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }
    public boolean comprobarDerrota() {
        if(pokemonesDerrotados == 3) {
        	derrota = true;
        }
        return derrota;
    }
   
}