package Sockets;

public class Mensaje {
    //atributos
    public String ip;
    public int port;
    public String username;
    public int id = 1;

    public Mensaje(String ip, int port, String username) {
        this.ip = ip;
        this.port = port;
        this.username = username;
    }

    public int getId(){
        return this.id;
    }

    public int getPort(){
        return this.port;
    }

    public String getIp(){
        return this.ip;
    }

    public String getUsername(){
        return this.username;
    }
}
