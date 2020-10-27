package Estructuras_Datos.CList;

public class NodeC {

    private Object data;
    private NodeC next;
    private NodeC prev;


    public NodeC(Object data) {
        this.data = data;
        this.next = null;
    }

    public Object getObject() {
        return data;
    }

    public void setObject(Object data) {
        this.data = data;
    }

    public NodeC getNext() {
        return next;
    }

    public void setNext(NodeC next) {
        this.next = next;
    }

    public NodeC getPrev() {
        return this.prev;
    }

    public void setPrev(NodeC prev) {
        this.prev = prev;
    }

    public void delete(){
        this.next = null;
        this.prev = null;
    }
}

