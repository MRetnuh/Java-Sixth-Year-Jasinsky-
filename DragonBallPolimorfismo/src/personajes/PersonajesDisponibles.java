package personajes;

public enum PersonajesDisponibles {
GOKU ("Goku"),
FREEZER ("Freezer");
	
	private String nombre;
	PersonajesDisponibles(String nombre){
		this.nombre = nombre;
	}
		
		public String getNombre() {
			return this.nombre;
		}
	}

