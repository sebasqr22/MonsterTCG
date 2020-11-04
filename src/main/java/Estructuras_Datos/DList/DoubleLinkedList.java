package Estructuras_Datos.DList;

import Assets.Carta;
import Estructuras_Datos.CList.Node;

public class DoubleLinkedList {

    private Node head;
    private Node tail;
    private int size;

    public DoubleLinkedList(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public boolean isEmpty(){
        return this.head==null;
    }

    public int getSize() {
        return size;
    }

    public void insertHead(Carta data){

        Node newNode = new Node(data);

        if (this.isEmpty()){
            this.head = this.tail = newNode;
        }else{
            newNode.setNext(this.head);
            this.head = newNode;
        }
        this.size++;
    }

    public void insertLast(Carta data){

        Node newNode = new Node(data);

        if (this.isEmpty()){
            this.head = this.tail = newNode;
        }else{
            this.tail.setNext(newNode);
            this.tail = newNode;
        }
        this.size++;
    }

    public Node find(Object data){
        if (this.isEmpty()){
            return null;
        }else{
            if (this.head.getObject()==data){
                return this.head;
            }else{
                Node tmp = this.head.getNext();

                while(tmp!=null){
                    if (tmp.getObject()==data){
                        return tmp;
                    }
                    tmp = tmp.getNext();
                }
                return null;
            }
        }
    }

    public void print(){
        Node tmp = this.head;

        while(tmp!=null){
            System.out.println(tmp.getObject());
            tmp = tmp.getNext();
        }
    }

}


