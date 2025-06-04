package ataques;

import personajes.GokuBase;
import personajes.Personaje;
import efectos.EfectoSecundario;

public class Golpe extends Ataques {

    public Golpe(Personaje personaje) {
        super(
            personaje instanceof GokuBase ? 250 : 250,
            personaje instanceof GokuBase ? 500 : 500,
            personaje instanceof GokuBase ? 501 : 501,
            personaje instanceof GokuBase ? 800 : 800,
            personaje instanceof GokuBase ? 7000 : 7000,
            personaje instanceof GokuBase ? 15 : 15,
            personaje instanceof GokuBase ? 85 : 85,
            personaje instanceof GokuBase ? 10 : 10,
            null, // efectoSecundario
            0,    // efectosTurnosMin
            0     // efectosTurnosMax
        );
    }
}
