package pokemons;

import ataques.Ataque;
import efectos.EfectoSecundario;
import estados.EstadoAlterado;
import estados.EstadoEstadisticaModificada;
import utilidades.Utiles;

public abstract class PokemonBase {
	
    private String nombre;
    private TipoPokemon[] tipoPokemon;
    private int vida;
    private boolean tieneUsosAtaques = true;
    private EstadoAlterado estadoAlterado;
    private Ataque[] ataques;
    
    public PokemonBase(String nombre, TipoPokemon[] tipoPokemon, int vida, Ataque[] ataques) {
        this.nombre = nombre;
        this.tipoPokemon = tipoPokemon;
        this.vida = vida;
        this.ataques = ataques;
    }


    public void aplicarEstadoAlterado(EstadoAlterado estadoAlterado) {
        this.estadoAlterado = estadoAlterado;
    }

    public void quitarVida(int danio) {
        this.vida -= danio;
    }

    public void mostrarDatos() {
        System.out.print("Nombre: " + this.nombre + " Tipo: ");
        if (this.tipoPokemon.length == 1) {
            System.out.print(this.tipoPokemon[0]);
        } else {
            for (int i = 0; i < this.tipoPokemon.length; i++) {
                System.out.print(this.tipoPokemon[i]);
                if (i < this.tipoPokemon.length - 1) {
                    System.out.print(" / ");
                }
            }
        }
        System.out.println(" Vida: " + this.vida + " hp");
    }

    public void mostrarAtaques() {
        for (int i = 0; i < this.ataques.length; i++) {
            this.ataques[i].mostrarDatos();
        }
    }

    public boolean verificarUsosAtaques() {
        if (!this.tieneUsosAtaques) return false;

        int cantAtaquesSinUsos = 0;
        int i = 0;

        while (i < this.ataques.length && this.ataques[i].getCantUsos() == 0) {
            cantAtaquesSinUsos++;
            i++;
        }

        if (cantAtaquesSinUsos == this.ataques.length) {
            this.tieneUsosAtaques = false;
            return false;
        }

        return true;
    }

    public void reducirCantAtaqueElegido(int opcAtaque) {
        this.ataques[opcAtaque].usarAtaque();
    }
    
    public void atacar(int opcAtaque, PokemonBase pokemonOponente) {
        int porcentajeReduccionAtaque = 0;
        int porcentajeReduccionDefensa = 0;
        int porcentajeReduccionPrecision = 0;

        if (estadoAlterado != null && estadoAlterado instanceof EstadoEstadisticaModificada) {
            EstadoEstadisticaModificada estado = (EstadoEstadisticaModificada) estadoAlterado;

            switch (estado.getTipoEstadistica()) {
                case ATAQUE:
                    porcentajeReduccionAtaque = estado.getPorcentaje();
                    break;
                case DEFENSA:
                    porcentajeReduccionDefensa = estado.getPorcentaje();
                    break;
                case PRECISION:
                    porcentajeReduccionPrecision = estado.getPorcentaje();
                    break;
            }

            estado.mostrarInformacion();
        }

        Ataque ataque = this.ataques[opcAtaque];
        int ataqueErrado = Utiles.r.nextInt(100) + 1;

        if (ataqueErrado > ataque.getPrecision()) {
            System.out.println("El pokemon " + this.nombre + " falló el ataque");
        }
        else {
        float multiplicador = 1f;
        float danio = ataque.getDanio() - (ataque.getDanio() * porcentajeReduccionAtaque / 100f);

        if (danio > 0) {
            for (int i = 0; i < pokemonOponente.tipoPokemon.length; i++) {
                multiplicador *= ataque.getTipo().obtenerRatioEfectidad(pokemonOponente.getTipo(i));
            }

            danio *= multiplicador;

            if (multiplicador >= 2) {
                System.out.println("El ataque es super efectivo");
            } else if (multiplicador < 1f) {
                System.out.println("El ataque es poco efectivo");
            }

            pokemonOponente.quitarVida((int) danio);
            System.out.println(this.nombre + " ha usado " + ataque.getNombre() + " y ha causado " + danio + " puntos de daño");
        }

        if (this.estadoAlterado != null) {
            this.estadoAlterado.reducirTurno();
            if (this.estadoAlterado.getTurnos() == 0) {
                System.out.println(this.nombre + " ha recuperado su estado normal");
                this.estadoAlterado = null;
            }
        }

        EfectoSecundario efectoSecundario = ataque.getEfectoSecundario();
        if (efectoSecundario != null && ataqueErrado < efectoSecundario.getProbabilidad()) {
            efectoSecundario.aplicar(pokemonOponente);
        }
    }
    }

    public String getNombre() {
        return this.nombre;
    }

    public TipoPokemon getTipo(int indiceTipoPokemon) {
        return this.tipoPokemon[indiceTipoPokemon];
    }

    public int getCantTipos() {
        return this.tipoPokemon.length;
    }

    public int getDanioAtaqueElegido(int opcAtaque) {
        return this.ataques[opcAtaque].getDanio();
    }

    public int getPrecisionAtaque(int opcAtaque) {
        return this.ataques[opcAtaque].getPrecision();
    }

    public int getCantUsosAtaqueElegido(int opcAtaque) {
        return this.ataques[opcAtaque].getCantUsos();
    }

    public String getNombreAtaqueUsado(int opcAtaque) {
        return this.ataques[opcAtaque].getNombre();
    }

    public int getCantAtaques() {
        return this.ataques.length;
    }

    public int getVida() {
        return this.vida;
    }
}
