package pokemons;

import ataques.ImpactoTrueno;
import ataques.OndaTrueno;

public class Pikachu extends Pokemon {
private OndaTrueno a1;
private ImpactoTrueno a2;
    public Pikachu(){
        super.nombre = "Pikachu";
        super.tipo = Tipos.ELECTRICO;
        super.sonido = "Pika pika";
        this.a1 = new OndaTrueno();
        this.a2 = new ImpactoTrueno();
    }

public int getA1() {
	return a1.getDanio();
	}
public int getA2() {
	return a2.getDanio();
	}
public void getVelocidadInformacion() {
	   System.out.println("Va rapido debido a la electricidad");
}
}