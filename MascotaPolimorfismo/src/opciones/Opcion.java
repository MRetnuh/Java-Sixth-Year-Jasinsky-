package opciones;

import interfaces.Mostrable;

public enum Opcion implements Mostrable{
JUGAR("Jugar"),
COMER("Comer"),
COMPRARCOMIDA("Comprar comida"),
BANIAR("Baniar"),
INVENTARIO("Inventario"),
ESTADISTICAS("Estadisticas"),
DORMIR("Dormir"),
SALIR("Salir");
	
	private String nombre;
	
	Opcion(String nombre){
		this.nombre = nombre;
	}

	@Override
	public void mostrar() {
		System.out.println(this.nombre);
	}
}
