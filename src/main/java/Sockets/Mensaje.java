package Sockets;

public class Mensaje extends Client {
    //atributos
    public String ip;
    public int port;
    public String username;
    public int id;
    public boolean host;

    public Mensaje(String ip, int port, String username, int id, boolean host) {
        this.ip = ip;
        this.port = port;
        this.username = username;
        this.id = id;
        this.host = host;
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
