package mascotas;

import comidas.Comida;
import interfaces.CansancioEventListener;
import interfaces.ManejadorEstadosMascota;

public abstract class Mascota {
	private String nombre;
	private int energia = 50;
	private int felicidad = 50;
	private int hambre = 50;
	private int suciedad = 50;
	private TipoMascota tipo;
	private CansancioEventListener listenerCansancio;
	private boolean cansada = false;
	private boolean muyCansada = false;
	private boolean extremadamenteCansada = false;
	public Mascota(TipoMascota tipo) {
		this.tipo = tipo;
	}
	
	public void cambiarNombre(String nombreElegido) {
		this.nombre = nombreElegido;
	}
	
	public void mostrarEstadisticas() {
		System.out.println("Nombre: " + this.nombre);
		System.out.println("Energia: " + this.energia);
		System.out.println("Felicidad: " + this.felicidad);
		System.out.println("Hambre: " + this.hambre);
		System.out.println("Suciedad: " + this.suciedad);
		System.out.println("Tipo: " + this.tipo.getTipo());
		
	}
	
	public void aumentarFelicidad(int aumento) {
		this.felicidad += aumento;
		this.felicidad = comprobarCaracteristica(this.felicidad);
	}
	
	public void reducirFelicidad(int descenso) {
		this.felicidad -= descenso;
		this.felicidad = comprobarCaracteristica(this.felicidad);
	}
	
	public void aumentarSuciedad(int aumento) {
		this.suciedad += aumento;
		this.suciedad = comprobarCaracteristica(this.suciedad);
		
	}
	
	public void reducirSuciedad(int descenso) {
		this.suciedad -= descenso;
		this.suciedad = comprobarCaracteristica(this.suciedad);
	}
	
	public void baniarse() {
		System.out.println("La mascota " + this.nombre + " se esta baniando");
		this.suciedad -= this.tipo.getPorcentaje();
		this.suciedad = comprobarCaracteristica(this.suciedad);
		System.out.println("Su suciedad fue reducida en un " + this.tipo.getPorcentaje());
	}
	
	public void comer(Comida comidaElegida) {
		System.out.println("La mascota disfruto la comida");
		aumentarSuciedad(comidaElegida.getSuciedad());
		setEnergia(comidaElegida.getSuenio());
	}
	
	public void aumentarHambre(int aumento) {
		this.hambre += aumento;
		this.hambre = comprobarCaracteristica(this.hambre);	
	}
	
	
	public void dormir() {
		System.out.println("La mascota " + this.nombre + " se fue a dormir");
		setEnergia(100);
		aumentarSuciedad(10);
		aumentarHambre(20);
		aumentarFelicidad(20);
		System.out.println("6 horas mas tarde");
		System.out.println("La mascota " + this.nombre + " se desperto con sus energias al " + this.energia);
	}
	
	private int comprobarCaracteristica(int caracteristica) {
	int atributo = caracteristica;
		if(caracteristica < 0) {
			atributo = 0;
			
		}
		else if(caracteristica > 100) {
			atributo = 100;
		}
		return atributo;
	}
	
	public void setCansancioListener(CansancioEventListener listener) {
	    this.listenerCansancio = listener;
	}
	
	public void setEnergia(int cambio) {
		this.energia += cambio;
		this.energia = comprobarCaracteristica(this.energia);
		listenerCansancio.verificarCansancio(nombre, this.energia, cansada, muyCansada, extremadamenteCansada);
	}
	
	public void setCansada(boolean siEstaCansada) {
		this.cansada = siEstaCansada;
	}
	
	public void setMuyCansada(boolean siEstaCansada) {
		this.muyCansada = siEstaCansada;
	}
	
	public void setExtremadamenteCansada(boolean siEstaCansada) {
		this.extremadamenteCansada = siEstaCansada;
	}
	
}
