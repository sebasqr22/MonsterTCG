package Estructuras_Datos.DList;


import Assets.Movimiento;

public class NodeD {

    Movimiento data;
    NodeD next;
    NodeD prev;

    public NodeD(Movimiento data) {
        this.data = data;
        this.next = null;
    }

    public Movimiento getObject() {
        return data;
    }

    public void setObject(Movimiento data) {
        this.data = data;
    }

    public NodeD getNext() {
        return next;
    }

    public void setNext(NodeD next) {
        this.next = next;
    }

    public NodeD getPrev() {
        return this.prev;
    }

    public void setPrev(NodeD prev) {
        this.prev = prev;
    }

    public void delete(){
        this.next = null;
        this.prev = null;
    }
}



