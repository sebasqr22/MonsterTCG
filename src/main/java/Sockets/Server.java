package Sockets;

import java.io.DataInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Observable;
import java.util.Random;

/**
 * @author David de la Hoz
 * Esta clase se encarga de implementar el servidor para recibir los mensajes de los clientes.
 * @see java.lang.Runnable
 * @see java.util.Observable
 */

public class Server extends Observable implements Runnable {

    //atributos
    /**
     * port es el puerto del servidor.
     */
    int port; // puerto que el servidor va a utilizar
    public ServerSocket server = null;

    /**
     *Constructor del servidor donde crea un puerto random
     */
    public Server(){
        this.port = port_search();
    }

    /**
     * Constructor del servidor donde se introduce el puerto
     * @param port
     */
    public Server(int port){
        this.port = port;
    }

    /**
     * Se encarga correr el servidor y estar esperando por algun input.
     */
    @Override
    public void run() {
        //instanciar clases necesarias
        Socket client = null;
        DataInputStream in;

        //try para prevenir problemas con la creacion del server socket
        while(true) {

            try {

                server = new ServerSocket(this.port);//create server socket

                while (true) { // loop para tener el server corriendo

                    client = server.accept();// accept client input

                    in = new DataInputStream(client.getInputStream());// create DataInputStream

                    String input = in.readUTF();//read message to send to client

                    this.setChanged();
                    this.notifyObservers(input);//notify observers(client)
                    this.clearChanged();// clear

                    client.close();// close client

                }
            } catch (IOException e) {
                this.port = port_search();// busca otro puerto que no este ocupado
            }
        }
    }
    public int getPort(){
        return this.port;
    }

    /**
     * Se encarga de buscar un puerto para el server
     * @return port random num entre 1000  y 6000
     */
    public static int port_search(){

        Random port_r = new Random();// create random class
        int port = 0;
        while(port <= 3000){ // buscar port hasta que sea mayor que 1500
            port = port_r.nextInt(8000);
        }
        return port;
    }
}
