package mascotas;

import interfaces.Mostrable;

public enum MascotaDisponible implements Mostrable{
MECCA("Mecca"),
KIBO("Kibo"),
KOI("Koi");

private String nombrePredeterminado;

MascotaDisponible(String nombrePredeterminado){
	this.nombrePredeterminado = nombrePredeterminado;
}

@Override
public void mostrar() {
	System.out.println(this.nombrePredeterminado);
	
}

public String getNombrePredeterminado() {
	return this.nombrePredeterminado;
}

}
