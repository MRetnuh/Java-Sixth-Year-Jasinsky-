package pokemons;

import ataques.Araniazo;
import ataques.Constriccion;
import ataques.Fortaleza;
import ataques.Latigo;
import ataques.Malicioso;
import ataques.Mordisco;
import ataques.PantallaDeHumo;
import ataques.RayoBurbuja;

public class Staryu  extends Pokemon{
	 private Malicioso a1;
	    private RayoBurbuja a2;
	    private Constriccion a3;
	    private Latigo a4;
	public Staryu() {
		super("Staryu",  650);
		super.tipo.add(Tipos.AGUA);
		super.cantAtaques = 4;
		  this.a1 = new Malicioso();
	      this.a2 = new RayoBurbuja();
	        this.a3 = new Constriccion();
	        this.a4 = new Latigo();
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