package redes;

import java.io.IOException;
import java.net.*;

public class HiloCliente extends Thread {

    private DatagramSocket socket;
    private int puertoServidor = 5556;
    private InetAddress ipServidor;
    private String ipServidorStr = "255.255.255.255"; // IP de broadcast
    private boolean fin = false;
    private ControladorRed controlador;

    public HiloCliente(ControladorRed controlador) {
        this.controlador = controlador;
        try {
            this.ipServidor = InetAddress.getByName(this.ipServidorStr);
            this.socket = new DatagramSocket();
        } catch (SocketException | UnknownHostException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void run() {
        do {
            DatagramPacket paquete = new DatagramPacket(new byte[1024], 1024);
            try {
                System.out.println("Esperando mensaje");
                this.socket.receive(paquete);
                procesarDatos(paquete);
            } catch (IOException e) {
            }
        } while(!fin);
    }

    private void procesarDatos(DatagramPacket paquete) {
        String mensaje = new String(paquete.getData()).trim();
        System.out.println(mensaje);

            	if(mensaje.startsWith("Te has unido a: ")) {
                this.ipServidor = paquete.getAddress();
                controlador.procesarConexion();
            	}

    }

    public void enviarMensaje(String mensaje) {
        byte[] datosByte = mensaje.getBytes();
        DatagramPacket paquete = new DatagramPacket(datosByte, datosByte.length, this.ipServidor, this.puertoServidor);
        try {
            socket.send(paquete);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public void finalizar() {
        this.fin = true;
        this.interrupt();
    }
}