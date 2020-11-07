package Assets;

/**
 * @author David de la Hoz
 */
public class Carta {
    public int Id;
    public String Type;
    public String Nombre;
    public int Ataque;
    public int Mana;


    public Carta(){

    }

    /**
     * Constructor principal de la clase Carta
     * @param id
     * @param type
     * @param nombre
     * @param ataque
     * @param mana
     */
    public Carta(int id, String type, String nombre, int ataque, int mana) {
        Id = id;
        Type = type;
        Nombre = nombre;
        Ataque = ataque;
        Mana = mana;
    }

    /**
     * Metodo para convertir a string
     * @return identificacion de la carta
     */
    public String toString(){
        String value = this.Nombre + " , " + this.Id + " , " + this.Type + " , " + this.Mana + " , " + this.Ataque;
        return value;
    }

    /**
     * Metodo para obtener el id de la carta
     * @return id
     */
    public int getId() {
        return Id;
    }

    /**
     * Metodo para obtener el tipo de la carta
     * @return tipo
     */
    public String getType() {
        return Type;
    }

    /**
     * Metodo para obtener el nombre de la carta
     * @return nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * Metodo para obtener el ataque de la carta
     * @return ataque
     */
    public int getAtaque() {
        return Ataque;
    }

    /**
     * Metodo para obtener el mana de la carta
     * @return mana
     */
    public int getMana() {
        return Mana;
    }
}
