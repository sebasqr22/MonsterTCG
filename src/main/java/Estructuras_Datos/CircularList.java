package Estructuras_Datos;


public class CircularList {

    private int size;
    private NodeC ref;

    public CircularList(){
        this.ref = null;
        this.size = 0;
    }

    public int getSize(){
        return this.size;
    }

    public void insert(Object data){

        NodeC newNode = new NodeC(data);

        if (this.ref == null){
            this.ref = newNode;
            this.ref.setNext(this.ref);
            this.ref.setPrev(this.ref);

        }else if(this.size == 1){
            this.ref.setNext(newNode);
            this.ref.setPrev(newNode);

            newNode.setPrev(this.ref);
            newNode.setNext(this.ref);

        }else{
            NodeC tmp = this.ref;

            while(tmp.getNext()!=this.ref){
                tmp = tmp.getNext();
            }
            tmp.setNext(newNode);

            newNode.setNext(this.ref);
            newNode.setPrev(tmp);

            this.ref.setPrev(newNode);
        }
        this.size++;
    }

    public void printList(){
        if (this.ref == null){
            System.out.println("Lista Vacia");

        }else if(this.size == 1){
            System.out.println(this.ref.getObject());

        }else{
            System.out.println(this.ref.getObject());
            NodeC tmp = this.ref.getNext();

            while(tmp != this.ref){
                System.out.println(tmp.getObject());
                tmp = tmp.getNext();
            }
        }
    }


    public void deleteDato(Object data){
        System.out.println("delete");
        if(this.ref == null){
            System.out.println("Lista nula no se puede borrar");

        }else if(this.ref.getObject() == data) {
            System.out.println("Segundo if:");
            if (this.size == 1) {
                this.ref = null;
                System.out.println("ref borrado");

            }else{
                NodeC tmp = this.ref;
                tmp.getNext().setPrev(tmp.getPrev());
                tmp.getPrev().setNext(tmp.getNext());
                this.ref = tmp.getNext();
                tmp.delete();
            }
        }else {
            System.out.println("Buscar dato");
            NodeC tmp = this.ref;
            boolean exists = false;
            while(tmp.getNext().getObject() != data){

                tmp = tmp.getNext();
                if (tmp == this.ref){
                    System.out.println("No existe");
                    exists = true;
                    break;
                }

            }

            if (exists) {
                System.out.println("Nodo tmp:" + tmp.getObject());
                System.out.println("Nodo a borrar:" + tmp.getNext().getObject());
                System.out.println("Nodo next de nodo a borrar:" + tmp.getNext().getNext().getObject());
                NodeC dNode = tmp.getNext();

                tmp.setNext(dNode.getNext());
                dNode.getNext().setPrev(tmp);

                dNode.delete();
            }
        }
    }
    public NodeC getRef() {
        return ref;
    }
}
