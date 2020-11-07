package Sockets;

/**
 * @author David de la Hoz
 */
public class Mensaje{
    //atributos
    public String ip;
    public int port;
    public String username;
    public int id;
    public boolean host;

    /**
     * Constructor de la clase Mensaje
     * @param ip
     * @param port
     * @param username
     * @param id
     * @param host
     */
    public Mensaje(String ip, int port, String username, int id, boolean host) {
        this.ip = ip;
        this.port = port;
        this.username = username;
        this.id = id;
        this.host = host;
    }

    /**
     * Metodo para obtener el id del mensaje
     * @return id
     */
    public int getId(){
        return this.id;
    }

    /**
     * Metodo para obtener el puerto del mensaje
     * @return puerto
     */
    public int getPort(){
        return this.port;
    }

    /**
     * Metodo para obtener la ip del mensaje
     * @return ip
     */
    public String getIp(){
        return this.ip;
    }

    /**
     * Metodo para obtener el username del mensaje
     * @return username
     */
    public String getUsername(){
        return this.username;
    }
}
