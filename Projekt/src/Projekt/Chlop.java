package Projekt;

public class Chlop extends Dobry implements Wojownik{



    public Chlop(String nazwa) {
        super(nazwa, 10, 2, "Cłowiek", 0);
        rodzajataku=1;
    }
    public Chlop() {
        super("Chłop",10,1,"Człowiek",0);
        rodzajataku=1;
    }

    @Override
    public int obrazeniaMele() {
        return  this.obrazenia = obrazenia+2;
    }

    @Override
    public String toString() {
        return "Nazwa: " + nazwa + "\n" +
                "Życie: " + zycie + "\n" +
                "Obrazenia: " + obrazeniaMele() + "\n" +
                "Rasa: " + rasa + "\n" +
                "Manna: " + mana;
    }

}
