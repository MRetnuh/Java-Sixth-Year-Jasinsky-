package elementos;

import java.net.InetAddress;

public class Usuario {

    private String nombre;
    private InetAddress ip;
    private int puerto;

    public Usuario(String nombre, InetAddress ip, int puerto) {
        this.nombre = nombre;
        this.ip = ip;
        this.puerto = puerto;
    }

    public String getNombre() {
        return nombre;
    }

    public InetAddress getIp() {
        return ip;
    }

    public int getPuerto() {
        return puerto;
    }
}
