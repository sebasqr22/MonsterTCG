package Estructuras_Datos;

import Assets.Carta;

/**
 * @author David de la Hoz
 */
public class Node {

    Carta data;
    Node next;
    Node prev;

    /**
     * Constructor de la clase Node
     * @param data
     */
    public Node(Carta data) {
        this.data = data;
        this.next = null;
    }

    /**
     * Metodo para obtener un objeto
     * @return objeto
     */
    public Carta getObject() {
        return data;
    }

    /**
     * Metodo para modificar un objeto
     * @param data
     */
    public void setObject(Carta data) {
        this.data = data;
    }

    /**
     * Metodo para obtener el siguiente objeto
     * @return siguiente objeto
     */
    public Node getNext() {
        return next;
    }

    /**
     * Metodo para modificar el siguiente objeto
     * @param next
     */
    public void setNext(Node next) {
        this.next = next;
    }

    /**
     * Metodo para obtener el objeto anterior
     * @return objeto anterior
     */
    public Node getPrev() {
        return this.prev;
    }

    /**
     * Metodo para modificar el objeto anterior
     * @param prev
     */
    public void setPrev(Node prev) {
        this.prev = prev;
    }

    /**
     * Metodo para borrar un objeto
     */
    public void delete(){
        this.next = null;
        this.prev = null;
    }
}

