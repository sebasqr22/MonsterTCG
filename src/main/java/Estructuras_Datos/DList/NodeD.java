package Estructuras_Datos.DList;


import Assets.Movimiento;

/**
 * @author David de la Hoz
 */
public class NodeD {

    Movimiento data;
    NodeD next;
    NodeD prev;

    /**
     * Constructor de la clase NodeD
     * @param data
     */
    public NodeD(Movimiento data) {
        this.data = data;
        this.next = null;
    }

    /**
     * Metodo para obtener un objeto
     * @return el objeto
     */
    public Movimiento getObject() {
        return data;
    }

    /**
     * Metodo para modificar un objeto
     * @param data
     */
    public void setObject(Movimiento data) {
        this.data = data;
    }

    /**
     * Metodo para obtener el siguiente objeto
     * @return siguiente objeto
     */
    public NodeD getNext() {
        return next;
    }

    /**
     * Metodo para modificar el siguiente objeto
     * @param next
     */
    public void setNext(NodeD next) {
        this.next = next;
    }

    /**
     * Metodo para obtener el objeto anterior
     * @return
     */
    public NodeD getPrev() {
        return this.prev;
    }

    /**
     * Metodo para modificar el objeto anterior
     * @param prev
     */
    public void setPrev(NodeD prev) {
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



