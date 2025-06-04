package personajes;

public enum PersonajesDisponibles {
GOKU ("Goku (base)"),
GOKUSSJ ("Super Saiyajin"),
GOKUSSJ2 ("Super Saiyajin 2"),
GOKUSSJ3 ("Super Saiyajin 3"),
FREEZER ("Freezer (base)"),
FREEZER1TRANSFORMACION ("primera transformacion"),
FREEZER2TRANSFORMACION  ("segunda transformacion"),
FREEZER3TRANSFORMACION  ("tercera transformacion");	
	private String nombre;
	PersonajesDisponibles(String nombre){
		this.nombre = nombre;
	}
		
		public String getNombre() {
			return this.nombre;
		}
	}

