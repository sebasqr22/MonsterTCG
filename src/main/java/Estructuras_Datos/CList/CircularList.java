package Estructuras_Datos.CList;


import Assets.Carta;

import javax.swing.*;

public class CircularList {

    int size;
    Node cartaSelec;
    Node ref;

    public CircularList(){
        this.ref = null;
        this.cartaSelec = null;
        this.size = 0;
    }

    public int getSize(){
        return this.size;
    }

    public void insert(Carta data){
        if(this.size + 1 <= 10) {
            Node newNode = new Node(data);

            if (this.ref == null) {
                this.ref = newNode;
                this.ref.setNext(this.ref);
                this.ref.setPrev(this.ref);
                this.cartaSelec = this.ref;

            } else if (this.size == 1) {
                this.ref.setNext(newNode);
                this.ref.setPrev(newNode);

                newNode.setPrev(this.ref);
                newNode.setNext(this.ref);

            } else {
                Node tmp = this.ref;

                while (tmp.getNext() != this.ref) {
                    tmp = tmp.getNext();
                }
                tmp.setNext(newNode);

                newNode.setNext(this.ref);
                newNode.setPrev(tmp);

                this.ref.setPrev(newNode);
            }
            this.size++;
        }else{
            JOptionPane.showMessageDialog(null,"No puede tomar mas cartas (maximo 10)");
        }
    }

    public void printList(){
        if (this.ref == null){
            System.out.println("Lista Vacia");

        }else if(this.size == 1){
            System.out.println("|"+this.ref.getObject()+"|");

        }else{
            System.out.println("|"+this.ref.getObject()+"|");
            Node tmp = this.ref.getNext();

            while(tmp != this.ref){
                System.out.println("|"+tmp.getObject()+"|");
                tmp = tmp.getNext();
            }
        }
    }


    public void deleteDato(Carta data){
        //System.out.println("delete");
        if(this.ref == null){
            //System.out.println("Lista nula no se puede borrar");

        }else if(this.ref.getObject() == data) {
            //System.out.println("Segundo if:");
            if (this.size == 1) {
                this.ref = null;
                this.cartaSelec.delete();
                this.cartaSelec = null;
                //System.out.println("ref borrado");

            }else{
                Node tmp = this.ref;
                tmp.getNext().setPrev(tmp.getPrev());
                tmp.getPrev().setNext(tmp.getNext());
                this.ref = tmp.getNext();
                tmp.delete();
            }
        }else {
            //System.out.println("Buscar dato");
            Node tmp = this.ref;
            boolean exists = true;

            while(tmp.getNext().getObject() != data){

                tmp = tmp.getNext();
                if (tmp == this.ref){
                    exists = false;
                    break;
                }
            }

            if (exists) {
                //System.out.println("Nodo tmp:" + tmp.getObject());
                //System.out.println("Nodo a borrar:" + tmp.getNext().getObject());
                //System.out.println("Nodo next de nodo a borrar:" + tmp.getNext().getNext().getObject());
                Node dNode = tmp.getNext();

                tmp.setNext(dNode.getNext());
                dNode.getNext().setPrev(tmp);

                dNode.delete();
            }
        }
        this.size -= 1;
    }


    public Node getCartaNext(){
        if (this.cartaSelec != null) {
            this.cartaSelec = this.cartaSelec.getNext();
            return this.cartaSelec;
        }else{
            return null;

        }
    }

    public Node getCartaPrev(){
        if (this.cartaSelec != null) {
            this.cartaSelec = this.cartaSelec.getPrev();
            return this.cartaSelec;
        }else{
            return null;
        }
    }
    public Node getRef() {
        return ref;
    }

    public Node find(Carta carta){
        if (this.ref == null){
            return null;
        }else{
            Node tmp = this.ref;
            boolean exists = true;

            while(tmp.getNext().getObject() != carta){

                tmp = tmp.getNext();
                if (tmp == this.ref){
                    exists = false;
                    break;
                }
            }

            if(exists){
                return tmp.getNext();
            }else{
                return null;
            }
        }
    }
}
