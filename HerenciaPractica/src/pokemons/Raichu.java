package pokemons;

import ataques.ImpactoTrueno;
//final para evitar que esta clase sea padre de otra. evitar un extend con esta clase en resumen
public final class Raichu extends Pikachu {
private ImpactoTrueno a2;
   public Raichu() {
        super.nombre = "Raichu";
        super.tipo = Tipos.ELECTRICO;
        super.sonido = "Raichu Raichu";
        this.a2 = new ImpactoTrueno();
   }
   public void getVelocidadInformacion() {
	   super.getVelocidadInformacion();
	   System.out.println("Pero tambien tira rayos");
   }
   public int getA2() {
	   return a2.getDanio() + 20;
   }

}