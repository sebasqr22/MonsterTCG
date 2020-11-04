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

}
