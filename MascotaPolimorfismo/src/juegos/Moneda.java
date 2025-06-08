package juegos;

import utilidades.Utiles;

public enum Moneda {
CARA("Cara"),
SECA("Seca");
	
	private String nombre;
    Moneda(String nombre) {
		this.nombre = nombre;
	}
    
    public String getNombre() {
    	return this.nombre;
    }
    
    public static Moneda tirarMoneda() {
    	return Moneda.values()[Utiles.r.nextInt(Moneda.values().length)];
    }
}
