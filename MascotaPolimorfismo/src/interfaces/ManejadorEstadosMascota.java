package interfaces;

public class ManejadorEstadosMascota implements CansancioEventListener {

    @Override
    public void verificarCansancio(String nombre, int energia, boolean cansada, boolean muyCansada, boolean extremadamenteCansada) {
    	int energiaMascota = energia;
    
    	if(energiaMascota <= 40 && energiaMascota > 20 && !cansada) {
    		System.out.println(nombre + " esta cansada");
    		setCansada(true);
    		setMuyCansada(false);
    	}
    	
    	else if(energiaMascota <= 20 && energiaMascota > 0 && !muyCansada) {
    		System.out.println(nombre + " esta muy cansada");
    		setMuyCansada(true);
    		setExtremadamenteCansada(false);
    	}
    	
    	else if(energiaMascota == 0 && !extremadamenteCansada) {
    		System.out.println(nombre + " se murio");
    		setExtremadamenteCansada(true);
    	}
    	
    	else {
    		setCansada(true);
    	}
    	
    	
}
}