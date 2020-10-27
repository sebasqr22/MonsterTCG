package Estructuras_Datos.DList;

public class Node {

    private Object data;
    private Node next;
    private Node prev;


    public Node(Object data) {
        this.data = data;
        this.next = null;
    }

    public Object getObject() {
        return data;
    }

    public void setObject(Object data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }
}
