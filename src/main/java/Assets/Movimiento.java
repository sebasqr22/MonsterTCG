package Assets;

/**
 * @author David de la Hoz
 */
public class Movimiento {

    public int turno;
    public String user;
    public int vida;
    public int mana;
    public String carta;
    public int ataque;
    public int manaC;
    public int id = 14;

    /**
     * Constructor de la clase Movimiento
     */
    public Movimiento() {
    }

    /**
     * Constructor principal de la clase Movimiento
     * @param turno
     * @param user
     * @param vida
     * @param mana
     * @param carta
     * @param ataque
     * @param manaC
     */
    public Movimiento(int turno, String user, int vida, int mana, String carta, int ataque, int manaC) {
        this.turno = turno;
        this.user = user;
        this.vida = vida;
        this.mana = mana;
        this.carta = carta;
        this.ataque = ataque;
        this.manaC = manaC;
    }


    /**
     * Metodo para retornar movimiento como String
     * @return movimiento
     */
    public String asString(){
        String res = "|"+this.turno+","+this.user+","+this.vida+","+this.mana+","+this.carta.toString()+"|";
        return res;
    }

    /**
     * Metodo para obtener el turno
     * @return el turno
     */
    public int getTurno() {
        return turno;
    }

    /**
     * Metodo para obtener el user
     * @return user
     */
    public String getUser() {
        return user;
    }

    /**
     * Metodo para obtener la vida
     * @return vida
     */
    public int getVida() {
        return vida;
    }

    /**
     * Metodo para obtener el mana
     * @return mana
     */
    public int getMana() {
        return mana;
    }

    /**
     * Metodo para obtener la carta
     * @return carta
     */
    public String getCarta() {
        return carta;
    }

    /**
     * Metodo para obtener el ataque
     * @return ataque
     */
    public int getAtaque() {
        return ataque;
    }

    /**
     * Metodo para obtener el mana de la carta
     * @return mana de la carta
     */
    public int getManaC() {
        return manaC;
    }
}
