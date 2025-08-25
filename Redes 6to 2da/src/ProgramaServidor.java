import redes.HiloServidor;
import utilidades.Utiles;

public class ProgramaServidor {

    private HiloServidor hiloServidor;
    private String nombre = "Servidor de Discord";
    public static void main(String[] args) {
        new ProgramaServidor().iniciar();
    }

    private void iniciar() {
        System.out.println("Servidor de Discord creado. Nombre: " + this.nombre);
        System.out.println("Pongale un nombre al servidor");
        nombre = Utiles.ingresarTexto();
        System.out.println("Nuevo nombre del servidor: " + this.nombre); 
        this.hiloServidor = new HiloServidor(this.nombre); 
        this.hiloServidor.start();
        Utiles.s.close();
    }
}
