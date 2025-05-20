package pokemons;

import ataques.Araniazo;
import ataques.Fortaleza;
import ataques.Mordisco;
import ataques.PantallaDeHumo;

public class Ekans  extends Pokemon{
	 private Araniazo a1;
	    private Fortaleza a2;
	    private PantallaDeHumo a3;
	    private Mordisco a4;
	public Ekans() {
		super("Ekans", 770);
		super.tipo.add(Tipos.VENENO);
		super.cantAtaques = 4;
		  this.a1 = new Araniazo();
	      this.a2 = new Fortaleza();
	        this.a3 = new PantallaDeHumo();
	        this.a4 = new Mordisco();
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
