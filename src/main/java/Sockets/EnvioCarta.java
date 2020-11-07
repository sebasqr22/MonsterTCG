package Sockets;

/**
 * @author Sebastian Quesada
 */
public class EnvioCarta {
    //atributos
    public int id;
    public String tipo;
    public String nombre;
    public int ataque;
    public int mana;
    public int idCarta;

    /**
     * Constructor de la clase EnvioCarta
     * @param nombre
     * @param ataque
     * @param mana
     * @param id
     * @param tipo
     * @param idCarta
     */
    public EnvioCarta(String nombre, int ataque, int mana, int id, String tipo, int idCarta){
        this.nombre = nombre;
        this.ataque = ataque;
        this.mana = mana;
        this.id = id;
        this.tipo = tipo;
        this.idCarta = idCarta;
    }

    /**
     * Metodo para obtener el id de la carta
     * @return idCarta
     */
    public int getIdCarta() {
        return idCarta;
    }

    /**
     * Metodo para modificar el valor del id de la carta
     * @param idMensaje
     */
    public void setIdCarta(int idMensaje) {
        this.idCarta = idMensaje;
    }

    /**
     * Metodo para obtener el valor del id de los obervadores
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * Metodo para modificar el valor del id de los observadores
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Metodo para obtener el tipo de la carta
     * @return tipo
     */
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * Metodo para obtener el nombre de la carta
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo para modificar el nombre de la carta
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo para obtener el ataque de la carta
     * @return ataque
     */
    public int getAtaque() {
        return ataque;
    }

    /**
     * Metodo para modificar el ataque de la carta
     * @param ataque
     */
    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    /**
     * Metodo para obtener el mana de la carta
     * @return mana
     */
    public int getMana() {
        return mana;
    }

    /**
     * Metodo para modificar el mana de la carta
     * @param mana
     */
    public void setMana(int mana) {
        this.mana = mana;
    }
}
