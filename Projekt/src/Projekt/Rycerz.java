package Projekt;

public class Rycerz extends Dobry implements Wojownik{


    public Rycerz(String nazwa) {
        super(nazwa, 100, 40, "Człowiek", 0);
        rodzajataku=1;
    }

    public Rycerz() {
        super("Sir Artur", 100, 40, "Człowiek", 0);
        rodzajataku=1;
    }

    @Override
    public int obrazeniaMele() {
        return this.obrazenia *=2;
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
