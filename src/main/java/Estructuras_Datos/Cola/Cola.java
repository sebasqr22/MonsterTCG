package Estructuras_Datos.Cola;

import Assets.Carta;
import Estructuras_Datos.CList.Node;

public class Cola {
    Node front;
    Node rear;

    public Cola(){
        this.front = null;
        this.rear = null;
    }

    public boolean isEmpty(){
        return this.rear == null;
    }

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
