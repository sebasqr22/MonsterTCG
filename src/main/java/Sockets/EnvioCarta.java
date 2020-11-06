package Sockets;

public class EnvioCarta extends Client {
    //atributos
    public int id;
    public String tipo;
    public String nombre;
    public int ataque;
    public int mana;
    public int idCarta;

    public int getIdCarta() {
        return idCarta;
    }

    public void setIdCarta(int idMensaje) {
        this.idCarta = idMensaje;
    }

    public EnvioCarta(String nombre, int ataque, int mana, int id, String tipo, int idCarta){
        this.nombre = nombre;
        this.ataque = ataque;
        this.mana = mana;
        this.id = id;
        this.tipo = tipo;
        this.idCarta = idCarta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }
}
