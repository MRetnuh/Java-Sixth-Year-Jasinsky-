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
      System.out.println("Daño: " + this.danio);}

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
}