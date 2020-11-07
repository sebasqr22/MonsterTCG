package Assets;

public class Movimiento {

    public int turno;
    public String user;
    public int vida;
    public int mana;
    public String carta;
    public int ataque;
    public int manaC;
    public int id = 14;

    public Movimiento(int turno, String user, int vida, int mana, String carta, int ataque, int manaC) {
        this.turno = turno;
        this.user = user;
        this.vida = vida;
        this.mana = mana;
        this.carta = carta;
        this.ataque = ataque;
        this.manaC = manaC;
    }



    public String asString(){
        String res = "|"+this.turno+","+this.user+","+this.vida+","+this.mana+","+this.carta.toString()+"|";
        return res;
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

    public String getCarta() {
        return carta;
    }

    public int getAtaque() {
        return ataque;
    }

    public int getManaC() {
        return manaC;
    }
}
