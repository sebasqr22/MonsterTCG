package Estructuras_Datos.Cola;

public class NodeQ {
    Object data;
    NodeQ next;

    public NodeQ(Object data){
        this.data = data;
        this.next = null;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public NodeQ getNext() {
        return next;
    }

    public void setNext(NodeQ next) {
        this.next = next;
    }
}
