package Assets;

public class Carta {
    public int Id;
    public String Type;
    public String Nombre;
    public int Ataque;
    public int Mana;

    public Carta(){

    }

    public String toString(){
        String value = this.Nombre + " , " + this.Id + " , " + this.Type + " , " + this.Mana + " , " + this.Ataque;
        return value;
    }

    public int getId() {
        return Id;
    }

    public String getType() {
        return Type;
    }

    public String getNombre() {
        return Nombre;
    }

    public int getAtaque() {
        return Ataque;
    }

    public int getMana() {
        return Mana;
    }
}
