package Sockets;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Esta clase se encarga de implementar el cliente, el cual manda mensajes a los servidores.
 * @see java.lang.Runnable
 *
 */
public class Client implements Runnable {
    //atributos
    /**
     * port es puerto de cliente y msg el mensaje.
     */
    int port;
    String objeto;

    /**
     * Constructor de cliente.
     * @param port puerto a donde se quiere mandar.
     * @param objeto mensaje que se quiere mandar.
     */
    public Client(int port,String objeto){
        this.port = port;
        this.objeto = objeto;
    }

    /**
     * Se encarga de mandar el mensaje al cliente con el puerto elegido.
     */
    @Override
    public void run() {
        final String Host = "127.0.0.1";// host ip
        DataOutputStream out;// instancia de DataOutputStream

        //try para prevenir problemas con la creacion del socket
        try{

            Socket client = new Socket(Host,port);//Create socket

            out = new DataOutputStream(client.getOutputStream());//create DataOutputStream

            out.writeUTF(objeto);//send message (msg)

            client.close();//close client

        }catch (IOException ex){
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE,null, ex);
        }
    }
}