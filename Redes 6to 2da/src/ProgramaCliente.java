import redes.ControladorRed;
import redes.HiloCliente;
import utilidades.Utiles;

public class ProgramaCliente implements ControladorRed {

    private HiloCliente cliente;
    private boolean fin = false;
    private boolean conectado = false;
    private String nombreUsuario;
    public static void main(String[] args) {
        new ProgramaCliente().iniciar();
    }

    public void iniciar() {
        this.cliente = new HiloCliente(this);
        this.cliente.start();

        System.out.println("Bienvenido al chat");
        System.out.println("Por favor, ingrese su nombre de usuario:");
        nombreUsuario= utilidades.Utiles.ingresarTexto();

        int opc = 0;

        do {
            System.out.println("1) Conectarse al servidor");
            System.out.println("2) Enviar mensaje");
            System.out.println("3) Salir");
            opc = Utiles.ingresarEntero(1,3);

            switch(opc){
                case 1:
                    if(!this.conectado) {
                        this.cliente.enviarMensaje("Se ha unido: " + this.nombreUsuario);
                        System.out.println("Esperando conexión...");
                    } else {
                        System.out.println("Ya está conectado al servidor.");
                    }
                    break;
                case 2:
                    if(this.conectado) {
                        System.out.println("Ingrese su mensaje:");
                        String mensaje = Utiles.ingresarTexto();
                        this.cliente.enviarMensaje(nombreUsuario + ": " + mensaje);
                    } else {
                        System.out.println("Debe conectarse al servidor primero.");
                    }
                    break;
                case 3:
                    System.out.println("Adios!");
                    this.cliente.finalizar();
                    break;
            }

        } while(!fin);

    }

    @Override
    public void procesarConexion() {
        if(!this.conectado) {
            this.conectado = true;
        }
    }
}