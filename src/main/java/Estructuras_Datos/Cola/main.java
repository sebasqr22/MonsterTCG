package Estructuras_Datos.Cola;

public class main {

    public static void main(String[] args) {

        Cola cola = new Cola();

        cola.enQueue(4);
        cola.enQueue(5);
        cola.enQueue(6);
        cola.print();

        NodeQ carta = cola.deQueue();
        cola.enQueue(8);
        cola.enQueue(9);

        cola.print();
        System.out.println("---------------");
        System.out.println(carta.getData());
    }
}
