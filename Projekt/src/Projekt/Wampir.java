package Projekt;

public class Wampir extends Zly implements Wojownik, Mag{

    public Wampir(String nazwa) {
        super(nazwa, 200, 50, "Wampir", 100);
        rodzajataku=2;
    }
    public Wampir() {
        super("Vlad", 200, 50, "Wampir", 100);
        rodzajataku=2;
    }

    @Override
    public int obrazeniaMagiczne() {
        return obrazenia *=2;
    }

    @Override
    public int obrazeniaMele() {
        return this.obrazenia *=2;
    }

    public String toString() {
        return "Nazwa: " + nazwa + "\n" +
                        "Życie: " + zycie + "\n" +
                        "Obrazenia mele: " + obrazeniaMele() + "\n" +
                        "Obrazenia magiczne: " + obrazeniaMagiczne() + "\n" +
                        "Rasa: " + rasa + "\n" +
                        "Manna: " + mana;
    }
}
