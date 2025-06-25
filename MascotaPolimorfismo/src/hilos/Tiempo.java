package hilos;

public class Tiempo extends Thread {

    @Override
    public void run() {
        boolean finalizado = false;
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
        }
    }
}
