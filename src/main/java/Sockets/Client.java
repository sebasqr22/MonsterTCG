package Sockets;

import Visual.MenuInicial;

import javax.swing.*;
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
    String output;
    String ip;
    /**
     * Constructor de cliente.
     * @param port puerto a donde se quiere mandar.
     * @param output mensaje que se quiere mandar.
     */
    public Client(int port,String output, String ip){
        this.port = port;
        this.ip = ip;
        this.output = output;
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

            Socket client = new Socket(ip,port);//Create socket

            out = new DataOutputStream(client.getOutputStream());//create DataOutputStream

            out.writeUTF(output);//send message (msg)

            client.close();//close client


        }catch (IOException ex){
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE,null, ex);
            JOptionPane.showMessageDialog(null, "No es posible establecer la conexion, por favor revisar el puerto y la iP...");
        }
    }
}

