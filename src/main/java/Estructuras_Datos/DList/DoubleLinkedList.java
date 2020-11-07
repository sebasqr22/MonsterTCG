package Estructuras_Datos.DList;


import Assets.Movimiento;

/**
 * @author David de la Hoz
 */
public class DoubleLinkedList {

    public NodeD head;
    public NodeD tail;
    public int size;
    public NodeD selec;

    /**
     * Constructor de la clase DoubleLinkedList
     */
    public DoubleLinkedList(){
        this.head = null;
        this.tail = null;
        this.size = 0;
        this.selec = null;
    }

    /**
     * Metodo para verificar si la lista es vacia
     * @return valor booleano
     */
    public boolean isEmpty(){
        return this.head==null;
    }

    /**
     * Metodo para obtener el tamaño de la lista
     * @return tamaño de la lista
     */
    public int getSize() {
        return size;
    }

    /**
     * Metodo para insertar un elemento al inicio de la lista
     * @param data
     */
    public void insertHead(Movimiento data){

        NodeD newNode = new NodeD(data);

        if (this.isEmpty()){
            this.head = this.tail = this.selec = newNode;
        }else{
            newNode.setNext(this.head);
            this.head = newNode;
        }
        this.size++;
    }

    /**
     * Metodo para insertar un elemento al final de la lista
     * @param data
     */
    public void insertLast(Movimiento data){

        NodeD newNode = new NodeD(data);

        if (this.isEmpty()){
            this.head = this.tail = this.selec = newNode;
        }else{
            this.tail.setNext(newNode);
            newNode.setPrev(this.tail);
            this.tail = newNode;
        }
        this.size++;
    }

    /**
     * Metodo para encontrar un elemento en la lista
     * @param data
     * @return posicion del elemento
     */
    public NodeD find(Object data){
        if (this.isEmpty()){
            return null;
        }else{
            if (this.head.getObject()==data){
                return this.head;
            }else{
                NodeD tmp = this.head.getNext();

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

    /**
     * Metodo para transformar la lista en un array
     * @return el movimiento a array
     */
    public Movimiento[] movArray(){
        Movimiento[] array;
        if (this.head == null){
            array = new Movimiento[1];
            return array;
        }
        else{
            array = new Movimiento[this.size];
            NodeD tmp = this.head;
            int i = 0;

            while (tmp != null){
                array[i] = tmp.getObject();
                tmp = tmp.getNext();
                i++;
            }
            return array;
        }
    }
    /**
     * Metodo para imprimir la lista
     */
    public void print(){
        NodeD tmp = this.head;

        while(tmp!=null){
            System.out.println(tmp.getObject().asString());
            tmp = tmp.getNext();
        }
    }

    public NodeD getHead() {
        return head;
    }

    public NodeD getTail() {
        return tail;
    }

    public NodeD getSelec() {
        return selec;
    }

    public NodeD getSelecNext(){
        if (this.selec == this.tail){
            return this.tail;
        }else{
            this.selec = this.selec.getNext();
            return selec;
        }
    }

    public NodeD getSelecPrev(){
        if (this.selec == this.head){
            return this.head;
        }else{
            this.selec = this.selec.getPrev();
            return selec;
        }
    }
}


