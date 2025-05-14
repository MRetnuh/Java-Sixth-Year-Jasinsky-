package pokemons;

public abstract class Pokemon {
//no hay funcion constructor ya que sus clases hijo tendran hijos. Si hubiese, la clase hijo de otra clase hijo necesitaria
//parametros que no podria recibir ya que primero se ejecutaria y recibiria de la clase hijo (original) y no la clase padre
    protected String nombre;
    protected Tipos tipo;
    protected String sonido;

    public String getNombre() {
        return nombre;
    }

}