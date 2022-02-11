package Projekt;

public class Smok extends Neutralny implements Wojownik, Mag{

    public Smok(String nazwa) {
        super(nazwa, 500, 100, "Smok", 1000);
        rodzajataku=2;
    }
    public Smok() {
        super("Dracon", 200, 50, "Smok", 1000);
        rodzajataku=2;
    }

    @Override
    public int obrazeniaMagiczne() {
        return this.obrazenia *= 2;
    }

    @Override
    public int obrazeniaMele() {
        return this.obrazenia *= 2;
    }

    public String toString() {
        return "Nazwa: " + nazwa + "\n" +
                "Życie: " + zycie + "\n" +
                "Obrazenia mele: " + obrazeniaMele() + "\n" +
                "Obrazenia magiczne: " + obrazeniaMagiczne() + "\n" +
                "Rasa: " + rasa + "\n" +
                "Mana: " + mana;
    }
}
