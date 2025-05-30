package ataques;

import efectos.EfectoSecundario;
import pokemons.TipoPokemon;

public abstract class Ataque {

    private String nombre;
    private TipoPokemon tipo;
    private int danio;
    private int precision;
    private int cantUsos;
    private EfectoSecundario efectoSecundario;
    public Ataque(String nombre, TipoPokemon tipoPokemon, int danio, int precision, int cantUsos, EfectoSecundario efectoSecundario) {
        this.nombre = nombre;
        this.tipo = tipoPokemon;
        this.danio = danio;
        this.precision = precision;
        this.cantUsos = cantUsos;
        this.efectoSecundario = efectoSecundario;
    }
    public Ataque(String nombre, TipoPokemon tipoPokemon, int danio, int precision, int cantUsos) {
    this(nombre, tipoPokemon, danio, precision, cantUsos, null);
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
    public EfectoSecundario getEfectoSecundario() {
    	return this.efectoSecundario;
    }
    public int getCantUsos() {
        return this.cantUsos;
    }
    public TipoPokemon getTipo() {
    	return this.tipo;
    }
    public void usarAtaque() {
        this.cantUsos--;
    }
}
