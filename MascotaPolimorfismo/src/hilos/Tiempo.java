package hilos;

import mascotas.Mascota;

public class Tiempo extends Thread {
private Mascota mascotaJugador;
private final int REDUCCION = -1;
private boolean finalizado = false;

    @Override
    public void run() {
        int i = 0; // Mover fuera del while
        while (!finalizado) {
            System.out.println(i + " segundos");
            try {
                Thread.sleep(1000); // Pausar 1 segundo
            } catch (InterruptedException e) {
                System.out.println("El hilo fue interrumpido.");
                finalizado = true;
            }
            i++;
            if(i % 4 == 0) {
            	System.out.println("Pasaron 4 segundos");
            	mascotaJugador.setEnergia(REDUCCION);
            	mascotaJugador.reducirFelicidad(REDUCCION);
            	mascotaJugador.aumentarHambre(REDUCCION);
            	mascotaJugador.aumentarSuciedad(REDUCCION);
            	mascotaJugador.mostrarEstadisticas();
            	
            }
        }
    }
    public void getMascota(Mascota mascota) {
    	this.mascotaJugador = mascota;
    }
    
    public void setFinalizado() {
    	this.finalizado = true;
    	System.out.println("Se terminaron los segundos");
    }
}
