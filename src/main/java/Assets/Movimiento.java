package Assets;

public class Movimiento {

    public int turno;
    public String user;
    public int vida;
    public int mana;
    public Carta carta;


    public Movimiento(int turno, String user, int vida, int mana, Carta carta) {
        this.turno = turno;
        this.user = user;
        this.vida = vida;
        this.mana = mana;
        this.carta = carta;
    }

    public int getTurno() {
        return turno;
    }

    public String getUser() {
        return user;
    }

    public int getVida() {
        return vida;
    }

    public int getMana() {
        return mana;
    }

    public Carta getCarta() {
        return carta;
    }
}
