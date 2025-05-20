package pokemons;

import ataques.Ascuas;
import ataques.Burbuja;
import ataques.Fortaleza;
import ataques.Grunido;
import ataques.Malicioso;
import ataques.Mordisco;
import ataques.PistolaDeAgua;
import ataques.RayoBurbuja;

public class Squirtle  extends Pokemon{
	private PistolaDeAgua a1;
	private RayoBurbuja a2;
	private Burbuja a3;
	private Malicioso a4;
	public Squirtle() {
		super("Squartle", 720);
		super.tipo.add(Tipos.AGUA);
		super.cantAtaques = 4;
		this.a1 = new PistolaDeAgua();
		this.a2 = new RayoBurbuja();
		this.a3 = new Burbuja();
		this.a4 = new Malicioso();
	}

	public void ejecutarMenuAtaques() {
		  System.out.println("Ataques de " + super.getNombre()+ ":");
	      System.out.println("1) " + this.a1.getDatos());
	      System.out.println("2) " + this.a2.getDatos());
	      System.out.println("3) " + this.a3.getDatos());
	      System.out.println("4) " + this.a4.getDatos());
		
	}
	public int obtenerDanoAtaque(int opcAtaque) {
		int danio = 0;
		switch(opcAtaque) {
		case 1:
			danio = a1.getDanio();
	        a1.usarAtaque();
			break;
		case 2:
			danio = a2.getDanio();
			a2.usarAtaque();
			break;
		case 3:
			danio = a3.getDanio();
			a2.usarAtaque();
			break;
		case 4:
			danio = a4.getDanio();
			a4.usarAtaque();
			break;
			default:
				System.out.println("No existe ese ataque");
		}
		return danio;
	}
	public int getPrecAtaque(int opcAtaque) {
			int precision = 0;
			switch(opcAtaque) {
			case 1:
				precision = a1.getPrecision();
				break;
			case 2:
				precision = a2.getPrecision();
				break;
			case 3:
				precision = a3.getPrecision();
				break;
			case 4:
				precision = a4.getPrecision();
				break;
				default:
					System.out.println("No existe ese ataque");
			}
			return precision;
		}
	public String getNombreAtaque(int opcAtaque) {
		String nombre = "";
		switch(opcAtaque) {
		case 1: 
			nombre = a1.getNombre();
			break;
		case 2: 
			nombre = a2.getNombre();
			break;
		case 3: 
			nombre = a3.getNombre();
			break;
		case 4: 
			nombre = a4.getNombre();
			break;
		}
		return nombre;
	}
	public int getCantUsosAtaque(int opcAtaque) {
		int cantUsosAtaque = 0;
		switch(opcAtaque) {
		case 1: 
			cantUsosAtaque = a1.getCantUsos();
			break;
		case 2: 
			cantUsosAtaque = a2.getCantUsos();
			break;
		case 3: 
			cantUsosAtaque = a3.getCantUsos();
			break;
		case 4: 
			cantUsosAtaque = a4.getCantUsos();
			break;
		}
		return cantUsosAtaque;
	}
	}
