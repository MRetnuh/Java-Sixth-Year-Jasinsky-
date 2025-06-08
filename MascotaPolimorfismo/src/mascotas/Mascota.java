package mascotas;

public abstract class Mascota {
	private String nombre;
	private int energia = 50;
	private int felicidad = 50;
	private int hambre = 50;
	private int suciedad = 50;
	private TipoMascota tipo;
	
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
		reducirSuciedad(this.tipo.getPorcentaje());
		System.out.println("Su suciedad fue reducida en un " + this.tipo.getPorcentaje());
	}
	
	public void aumentarHambre(int aumento) {
		this.hambre += aumento;
		this.hambre = comprobarCaracteristica(this.hambre);	
	}
	
	public void reducirEnergia(int descenso) {
		this.energia -= descenso;
		this.energia = comprobarCaracteristica(this.energia);
		
	}
	
	public void aumentarEnergia(int aumento) {
		this.energia += aumento;
		this.energia = comprobarCaracteristica(this.energia);
	}
	
	public void dormir() {
		System.out.println("La mascota " + this.nombre + " se fue a dormir");
		aumentarEnergia(100);
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

}
