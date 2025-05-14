package ataques;

import pokemons.Tipos;
//usa private en vez de protected las clases hijo no tendran hijos. De este modo, puede usar una funcion constructor
public abstract class Ataque {

    private String nombre;
    private Tipos tipo;
    private int danio;
    private int precision;
    private int cantUsos;

    public Ataque(String nombre, Tipos tipos, int danio, int precision, int cantUsos) {
        this.nombre = nombre;
        this.tipo = tipos;
        this.danio = danio;
        this.precision = precision;
        this.cantUsos = cantUsos;
    }

    public String getDatos(){
        return this.nombre + " Tipo: " + this.tipo + " Danio: " + this.danio + " Precision: " + this.precision + "% Usos: " + (this.cantUsos==-1?"infinito":this.cantUsos);
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
