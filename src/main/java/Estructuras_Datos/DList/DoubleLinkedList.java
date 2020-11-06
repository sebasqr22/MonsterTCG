package Estructuras_Datos.DList;


import Assets.Movimiento;


public class DoubleLinkedList {

    public NodeD head;
    public NodeD tail;
    public int size;


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

    public void insertHead(Movimiento data){

        NodeD newNode = new NodeD(data);

        if (this.isEmpty()){
            this.head = this.tail = newNode;
        }else{
            newNode.setNext(this.head);
            this.head = newNode;
        }
        this.size++;
    }

    public void insertLast(Movimiento data){

        NodeD newNode = new NodeD(data);

        if (this.isEmpty()){
            this.head = this.tail = newNode;
        }else{
            this.tail.setNext(newNode);
            this.tail = newNode;
        }
        this.size++;
    }

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

    public void print(){
        NodeD tmp = this.head;

        while(tmp!=null){
            System.out.println(tmp.getObject());
            tmp = tmp.getNext();
        }
    }

}


