package Estructuras_Datos.CList;


import Assets.Carta;
import Estructuras_Datos.Node;

import javax.swing.*;

/**
 * @author David de la Hoz
 */
public class CircularList {

    int size;
    Node cartaSelec;
    Node ref;

    /**
     * Constructor de la clase CircularList
     */
    public CircularList(){
        this.ref = null;
        this.cartaSelec = null;
        this.size = 0;
    }

    /**
     * Metodo para obtener el tamaño de la lista
     * @return tamaño
     */
    public int getSize(){
        return this.size;
    }

    /**
     * Metodo para insertar a una carta a la lista
     * @param data
     */
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
                this.cartaSelec = newNode;

            } else {
                Node tmp = this.ref;

                while (tmp.getNext() != this.ref) {
                    tmp = tmp.getNext();
                }
                tmp.setNext(newNode);

                newNode.setNext(this.ref);
                newNode.setPrev(tmp);

                this.ref.setPrev(newNode);
                this.cartaSelec = newNode;
            }
            this.size++;
        }else{
            JOptionPane.showMessageDialog(null,"No puede tomar mas cartas (maximo 10)");
        }
    }

    /**
     * Metodo para imprimir la lista
     */
    public void printList(){
        System.out.println("--------------------");
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
        System.out.println("Carta seleccionada: "+ this.cartaSelec.getObject().toString());
        System.out.println("--------------------");
    }

    /**
     * Metodo para borrar un elemento de la lista
     * @param data
     */
    public void deleteDato(Carta data){
        //System.out.println("delete");
        if(this.ref == null){
            //System.out.println("Lista nula no se puede borrar");

        }else if(this.ref.getObject() == data){

            if (this.ref.getObject() != this.cartaSelec.getObject()) {
                //System.out.println("Segundo if:");
                if (this.size == 1) {
                    this.ref = null;
                    //System.out.println("ref borrado");

                } else {
                    Node tmp = this.ref;
                    tmp.getNext().setPrev(tmp.getPrev());
                    tmp.getPrev().setNext(tmp.getNext());
                    this.ref = tmp.getNext();
                    tmp.delete();
                }
            }else{
                if (this.size == 1) {
                    this.ref = null;
                    this.cartaSelec = null;
                    //System.out.println("ref borrado");

                } else {
                    Node tmp = this.ref;
                    tmp.getNext().setPrev(tmp.getPrev());
                    tmp.getPrev().setNext(tmp.getNext());
                    this.ref = tmp.getNext();
                    this.cartaSelec = this.ref;
                    tmp.delete();
                }
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

    /**
     * Metodo para obtener el siguiente elemento de la lista
     * @return siguiente elemento
     */
    public Node getCartaNext(){
        if (this.cartaSelec != null) {
            this.cartaSelec = this.cartaSelec.getNext();
            return this.cartaSelec;
        }else{
            return null;

        }
    }

    /**
     * Metodo para obtener el elemento anterior de la lista
     * @return elemento anterior
     */
    public Node getCartaPrev(){
        if (this.cartaSelec != null) {
            this.cartaSelec = this.cartaSelec.getPrev();
            return this.cartaSelec;
        }else{
            return null;
        }
    }

    /**
     * Metodo para retornar la refernecia principal de la lista
     * @return
     */
    public Node getRef() {
        return ref;
    }

    /**
     * Metodo para encontraar un nodo de la lista
     * @param carta
     * @return valor booleano
     */
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

    /**
     * Metodo para obtener el elemento seleccionado de la lista
     * @return elemento seleccionado
     */
    public Node getCartaSelec() {
        return cartaSelec;
    }

    /**
     * Metodo para modificar la carta seleccionada
     * @param cartaSelec
     */
    public void setCartaSelec(Node cartaSelec) {
        this.cartaSelec = cartaSelec;
    }
}
