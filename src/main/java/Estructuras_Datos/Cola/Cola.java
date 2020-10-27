package Estructuras_Datos.Cola;

public class Cola {
    NodeQ front;
    NodeQ rear;

    public Cola(){
        this.front = null;
        this.rear = null;
    }

    public boolean isEmpty(){
        return this.rear == null;
    }

    public void enQueue(Object data){
        NodeQ tmp = new NodeQ(data);

        if(this.isEmpty()){
            this.front = tmp;
            this.rear  = tmp;
        }else{
            this.rear.setNext(tmp);
            this.rear = tmp;
        }
    }

    public NodeQ deQueue(){

        if (this.isEmpty()){
            return null;
        }else{

            NodeQ tmp = this.front;
            this.front = this.front.next;
            if(this.front == null){
                this.rear = null;
            }
            return tmp;
        }
    }

    public void print(){
        if(isEmpty()){
            System.out.println("Vacia");
        }else{
            NodeQ tmp = this.front;
            System.out.println("----------------");
            while(tmp != null){
                System.out.println("|"+tmp.getData()+"|");
                tmp = tmp.getNext();
            }
        }
    }


}
