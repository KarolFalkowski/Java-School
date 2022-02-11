package Projekt;

public abstract class Npc{
    String nazwa;
    int zycie;
    int obrazenia;
    String rasa;
    int mana;
    int rodzajataku;


    public Npc() {
        this.nazwa = "Plobek";
        this.zycie = 1;
        this.obrazenia = 1;
        this.rasa = "Gnomek";
    }

    public Npc(String nazwa, int zycie, int obrazenia, String rasa,int mana) {
        this.nazwa = nazwa;
        this.zycie = zycie;
        this.obrazenia = obrazenia;
        this.rasa = rasa;
        this.mana = mana;
    }

    public Npc(String nazwa, int zycie, int obrazenia) {
        this.nazwa = nazwa;
        this.zycie = zycie;
        this.obrazenia = obrazenia;
    }


    @Override
    public String toString() {
        return "Npc: " +
                "nazwa = " + nazwa + '\'' +
                "zycie = " + zycie +
                "obrazenia = " + obrazenia +
                "rasa = " + rasa + '\'' ;
    }
}
