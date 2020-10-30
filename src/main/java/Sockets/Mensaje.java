package Sockets;

public class Mensaje {
    //atributos
    String ip;
    int port;
    String username;

    public Mensaje(String ip, int port, String username) {
        this.ip = ip;
        this.port = port;
        this.username = username;
    }
}
