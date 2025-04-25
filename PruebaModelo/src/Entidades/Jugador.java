package Entidades;

public class Jugador {
private String nombre;
private int danio = 2;
private int vida = 100;
private int velocidadAtaque = 1;
private final int elementosMaximo= 4;
private Armadura armadura[] = new Armadura[elementosMaximo];
private Arma arma;
private int dinero = 7000;
private int partesArmaduraCompradas = 0;
private boolean armaComprada = false;
public Jugador(String nombre) {
	this.nombre = nombre;
}
public void getInformacion() {
	  System.out.println("Nombre: " + this.nombre);
      System.out.println("Vida: " + this.vida);
      System.out.println("Velocidad de ataque: " + this.velocidadAtaque);
      System.out.println("Daño: " + this.danio);      
}

public String getNombre() {
	return this.nombre;
}
public int getDinero() {
	return this.dinero;
}
public boolean comprobadorParteArmadura(String tipoParte) {
	boolean comprobador = true;
	int i = 0;
	while(i < partesArmaduraCompradas) {
		if(tipoParte.equals(armadura[i].getTipo())) {
			comprobador = false;
		}
		i++;
	}
	return comprobador;
}
public void adquirirArmadura(Armadura armadura) {
	this.armadura[partesArmaduraCompradas] = armadura;
	this.vida += armadura.getVidaAgregada();
	if(velocidadAtaque> 0) {
	this.velocidadAtaque -= armadura.getDisminuyeVelAtaque();
	}
	partesArmaduraCompradas++;
	this.dinero -= armadura.getPrecio();
}
public int getCantidadObjetosAdquiridos(){
	return partesArmaduraCompradas;
}
public void obtenerArma(Arma arma) {
	this.arma = arma;
	this.danio = arma.getDanio();
	this.velocidadAtaque += arma.getVelocidadAtaque();
	armaComprada = true;
	this.dinero -= arma.getPrecio();
}
public boolean verificarPresenciaArma() {
	return armaComprada;
}
public void mostrarArmaduraYArma() {
	  System.out.println("Armadura del jugador: ");
	  if(partesArmaduraCompradas == 0) {
		  System.out.println("Nada");
	  }
	  for(int i = 0; i < partesArmaduraCompradas; i++) {
	  System.out.println(armadura[i].getNombre());
	  }
	   System.out.println("Arma: " );
	  if(armaComprada != false) {
      System.out.print(arma.getNombre());
	  }
	  else {
		  System.out.println("Nada");
	  }
}

public void realizarPelea(Jugador jugador, Jugador enemigo, int primerTurno) {
    final int JUGADOR_UNO_TURNO = 1;
    final int JUGADOR_DOS_TURNO = 2;
    int turnoJugador = primerTurno;
    boolean partidaTerminada = false;

    System.out.println("Empieza el jugador " + (turnoJugador == JUGADOR_UNO_TURNO ? jugador.nombre : enemigo.nombre));

    do {
        if (turnoJugador == JUGADOR_UNO_TURNO) {
            float diferenciaVelocidad = (float) jugador.velocidadAtaque / enemigo.velocidadAtaque;

            for (int i = 0; i < diferenciaVelocidad; i++) {
                enemigo.vida -= jugador.danio;
                System.out.println(jugador.nombre + " ha atacado a " + enemigo.nombre + " causando " + jugador.danio + " de daño.");

                if (enemigo.vida <= 0) {
                    System.out.println(enemigo.nombre + " ha sido derrotado. ¡" + jugador.nombre + " ha ganado!");
                    partidaTerminada = true;
                }
            }
            
    if(enemigo.vida > 0) {
            System.out.println("Vida restante de " + enemigo.nombre + ": " + enemigo.vida);
            System.out.println("Turno de " + enemigo.nombre);
            turnoJugador = JUGADOR_DOS_TURNO;
    }
        } else {
            float diferenciaVelocidad = (float)enemigo.velocidadAtaque / jugador.velocidadAtaque;

            for (int i = 0; i < diferenciaVelocidad; i++) {
                jugador.vida -= enemigo.danio;
                System.out.println(enemigo.nombre + " ha atacado a " + jugador.nombre + " causando " + enemigo.danio + " de daño.");

                if (jugador.vida <= 0) {
                    System.out.println(jugador.nombre + " ha sido derrotado. ¡" + enemigo.nombre + " ha ganado!");
                    partidaTerminada = true;
                }
            }
            if (jugador.vida > 0) {
            System.out.println("Vida restante de " + jugador.nombre + ": " + jugador.vida);
            System.out.println("Turno de " + jugador.nombre);
            turnoJugador = JUGADOR_UNO_TURNO;
            }
        }
    } while (!partidaTerminada);
}

}