package ataques;

import pokemons.Tipos;
//usa el super asi directamente porque esta ni otras clases hijo de ataque tendran hijos
public class OndaTrueno extends Ataque {

    public OndaTrueno() {
        super("Onda Trueno", Tipos.ELECTRICO, 40, 100, 20);
    }

}
