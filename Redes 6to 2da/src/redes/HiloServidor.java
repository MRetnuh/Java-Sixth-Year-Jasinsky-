package redes;

import elementos.Usuario;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.HashMap;

public class HiloServidor extends Thread {

    private DatagramSocket socket;
    private int puerto = 5556;
    private boolean fin = false;
    private static final int MAX_CLIENTES = 2;
    private HashMap<String, Usuario> usuarios = new HashMap<>();
    private int usuariosConectados = 0;
    private String nombreServidor;
    public HiloServidor(String nombreServidor){
    	this.nombreServidor = nombreServidor;
        try {
            this.socket = new DatagramSocket(this.puerto);
        } catch (SocketException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void run() {
        do {
            DatagramPacket paquete = new DatagramPacket(new byte[1024], 1024);
            try {
                this.socket.receive(paquete);
                procesarDatos(paquete);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } while(!fin);
    }

    private void procesarDatos(DatagramPacket paquete) {
        String mensaje = new String(paquete.getData()).trim();
        System.out.print(mensaje);
        System.out.println();
        
        if (mensaje.startsWith("Se ha unido: ")) {
            if (this.usuariosConectados < this.MAX_CLIENTES) {
                String key = paquete.getAddress().toString() + ":" + paquete.getPort();

                // Verificamos que el usuario no esté ya conectado
                if (!this.usuarios.containsKey(key)) {
                    Usuario nuevoUsuario = new Usuario(
                        "Usuario " + (this.usuariosConectados + 1),
                        paquete.getAddress(),
                        paquete.getPort()
                    );

                    // Guardamos en el mapa
                    this.usuarios.put(key, nuevoUsuario);

                    // Enviar mensaje de aceptación
                    enviarMensaje("Te has unido a: " + this.nombreServidor,
                                  nuevoUsuario.getIp(),
                                  nuevoUsuario.getPuerto());

                    this.usuariosConectados++;
                } else {
                    // Usuario ya conectado
                    enviarMensaje("YaConectado", paquete.getAddress(), paquete.getPort());
                    System.out.println("El usuario ya estaba conectado.");
                }
            } else {
                // No hay lugar para más usuarios
                enviarMensaje("ConexionRechazada", paquete.getAddress(), paquete.getPort());
                System.out.println("No se puede aceptar más conexiones, ya hay "
                        + this.MAX_CLIENTES + " usuarios conectados.");
            }

            // Como es un mensaje de unión, salimos y NO reenviamos nada
            return;
        }

        // Si no era un mensaje de unión, lo reenviamos a todos los demás
        for (Usuario u : usuarios.values()) {
            if (!(u.getIp().equals(paquete.getAddress()) && u.getPuerto() == paquete.getPort())) {
                enviarMensaje(mensaje, u.getIp(), u.getPuerto());
            }
        }
    }
    


    public void enviarMensaje(String mensaje, InetAddress ipDestino, int puertoDestino) {
        byte[] datosByte = mensaje.getBytes();
        DatagramPacket paquete = new DatagramPacket(datosByte, datosByte.length, ipDestino, puertoDestino);
        try {
            socket.send(paquete);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    


}
