package ataques;


public class Golpe extends Ataque {

    public Golpe(int danioMinimoPrimeraProbabilidad, int danioMaximoPrimeraProbabilidad, 
    		int danioMinimoSegundaProbabilidad, int danioMaximoSegundaProbabilidad, int energiaConsumida, 
    		int probabilidadFallo, int primerProbabilidad, int segundaProbabilidad) {
    	
            super("Golpe", danioMinimoPrimeraProbabilidad,  danioMaximoPrimeraProbabilidad, 
        		 danioMinimoSegundaProbabilidad,  danioMaximoSegundaProbabilidad,  energiaConsumida, 
        		 probabilidadFallo,  primerProbabilidad,  segundaProbabilidad);
    }
}
