package Estructuras_Datos.Cola;

import Assets.Carta;
import Estructuras_Datos.Node;

/**
 * @author David de la Hoz
 */
public class Cola {
    Node front;
    Node rear;

    /**
     * Constructor de la clase Cola
     */
    public Cola(){
        this.front = null;
        this.rear = null;
    }

    /**
     * Metodo para obtener si la cola es vacia
     * @return valor booleano
     */
    public boolean isEmpty(){
        return this.rear == null;
    }

    /**
     * Metodo para agregar elemento siguiente a la cola
     * @param data
     */
    public void enQueue(Carta data){
        Node tmp = new Node(data);

        if(this.isEmpty()){
            this.front = tmp;
            this.rear  = tmp;
        }else{
            this.rear.setNext(tmp);
            this.rear = tmp;
        }
    }

    /**
     * Metodo para sacar primer elemento de la cola
     * @return
     */
    public Node deQueue(){

        if (this.isEmpty()){
            return null;
        }else{

            Node tmp = this.front;
            this.front = this.front.getNext();
            if(this.front == null){
                this.rear = null;
            }
            return tmp;
        }
    }

    /**
     * Metodo para imprimir la cola
     */
    public void print(){
        if(isEmpty()){
            System.out.println("Vacia");
        }else{
            Node tmp = this.front;
            System.out.println("----------------");
            while(tmp != null){
                System.out.println("|"+tmp.getObject()+"|");
                tmp = tmp.getNext();
            }
        }
    }


}
