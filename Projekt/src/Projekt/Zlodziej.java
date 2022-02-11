package Projekt;

public class Zlodziej extends Zly implements Lotr{

    public Zlodziej(String nazwa) {
        super(nazwa, 200, 25, "Człowiek", 0);
        rodzajataku=1;
    }
    public Zlodziej() {
        super("Złodziej", 200, 25, "Cłowiek", 0);
        rodzajataku=1;
    }
    @Override
    public int obrazeniaMele() {
        return obrazenia*=5;
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
