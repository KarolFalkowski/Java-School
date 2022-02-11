package Projekt;

public class Swinia extends Neutralny implements Wojownik{

    public Swinia(String nazwa) {
        super(nazwa, 5, 0, "Zwierzę", 0);
        rodzajataku=1;
    }
    public Swinia() {
        super("Naboki", 5, 0, "Zwierzę", 0);
        rodzajataku=1;
    }

    @Override
    public int obrazeniaMele() {
        return 0;
    }

    public String toString() {
        return "Nazwa: " + nazwa + "\n" +
                "Życie: " + zycie + "\n" +
                "Obrazenia mele: " + obrazeniaMele() + "\n" +
                "Rasa: " + rasa + "\n" +
                "Manna: " + mana;
    }
}
