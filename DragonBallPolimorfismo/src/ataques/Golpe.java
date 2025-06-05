package ataques;

import personajes.GokuBase;
import personajes.Personaje;
import efectos.EfectoSecundario;

public class Golpe extends Ataques {

    public Golpe(Personaje personaje) {
        super("Golpe",
            personaje instanceof GokuBase ? 250 : 150,
            personaje instanceof GokuBase ? 500 : 350,
            personaje instanceof GokuBase ? 501 : 351,
            personaje instanceof GokuBase ? 800 : 700,
            personaje instanceof GokuBase ? 7000 : 10000,
            personaje instanceof GokuBase ? 5 : 7,
            personaje instanceof GokuBase ? 80 : 70,
            personaje instanceof GokuBase ? 20 : 30,
            null, // efectoSecundario
            0,    // efectosTurnosMin
            0     // efectosTurnosMax
        );
    }
}
