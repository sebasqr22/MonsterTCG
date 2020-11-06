package Estructuras_Datos;

import Assets.Carta;

public class Node {

    Carta data;
    Node next;
    Node prev;


    public Node(Carta data) {
        this.data = data;
        this.next = null;
    }

    public Carta getObject() {
        return data;
    }

    public void setObject(Carta data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrev() {
        return this.prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public void delete(){
        this.next = null;
        this.prev = null;
    }
}

