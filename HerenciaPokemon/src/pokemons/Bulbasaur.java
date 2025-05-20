package pokemons;

import ataques.Grunido;
import ataques.LatigoCepa;
import ataques.Placaje;
import ataques.PolvoVenenoso;

public class Bulbasaur extends Pokemon{
	 private Placaje a1;
	    private Grunido a2;
	    private LatigoCepa a3;
	    private PolvoVenenoso a4;

	public Bulbasaur() {
		super("Bulbasaur", 850);
		super.tipo.add(Tipos.PLANTA);
		super.tipo.add(Tipos.VENENO);
		super.cantAtaques = 4;
		  this.a1 = new Placaje();
	      this.a2 = new Grunido();
	        this.a3 = new LatigoCepa();
	        this.a4 = new PolvoVenenoso();
		
	}


	public int obtenerDanoAtaque(int opcAtaque) {
		int danio = 0;
		switch(opcAtaque) {
		case 1:
			danio = a1.getDanio();
			break;
		case 2:
			danio = a2.getDanio();
			break;
		case 3:
			danio = a3.getDanio();
			break;
		case 4:
			danio = a4.getDanio();
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
	}

