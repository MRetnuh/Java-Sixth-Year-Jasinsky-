package mascotas;

public enum MascotaDisponible {
MECCA("Mecca"),
KIBO("Kibo"),
KOI("Koi");

private String nombrePredeterminado;

MascotaDisponible(String nombrePredeterminado){
	this.nombrePredeterminado = nombrePredeterminado;
}

public String getNombrePredeterminado() {
	return this.nombrePredeterminado;
}
}
