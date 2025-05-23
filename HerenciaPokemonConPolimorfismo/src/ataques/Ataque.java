package ataques;

import pokemons.TipoPokemon;

public abstract class Ataque {

    private String nombre;
    private TipoPokemon tipo;
    private int danio;
    private int precision;
    private int cantUsos;

    public Ataque(String nombre, TipoPokemon tipoPokemon, int danio, int precision, int cantUsos) {
        this.nombre = nombre;
        this.tipo = tipoPokemon;
        this.danio = danio;
        this.precision = precision;
        this.cantUsos = cantUsos;
    }

    public void mostrarDatos(){
        System.out.println(this.nombre + " Tipo: " + this.tipo + " Danio: " + this.danio + " Precision: " + this.precision + "% Usos: " + (this.cantUsos<=-1?"infinito":this.cantUsos));
    }

    public int getDanio() {
        return this.danio;
    }

    public int getPrecision() {
        return this.precision;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getCantUsos() {
        return this.cantUsos;
    }

    public void usarAtaque() {
        this.cantUsos--;
    }
}
