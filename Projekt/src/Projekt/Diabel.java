package Projekt;

public class Diabel extends Zly implements Mag, Wojownik{


    public Diabel(String nazwa) {
        super(nazwa, 200, 20, "Diabeł", 50);
        rodzajataku=2;
    }
    public Diabel() {
        super("Lucyfer", 200, 20, "Diabeł", 50);
        rodzajataku=2;
    }

    @Override
    public int obrazeniaMagiczne() {
        return this.obrazenia+=10;
    }

    @Override
    public int obrazeniaMele() {
        return this.obrazenia*=2;
    }

    @Override
    public String toString() {
        return "Nazwa: " + nazwa + "\n" +
                "Życie: " + zycie + "\n" +
                "Obrazenia mele: " + obrazeniaMele() + "\n" +
                "Obrazenia magiczne: " + obrazeniaMagiczne() + "\n" +
                "Rasa: " + rasa + "\n" +
                "Manna: " + mana;
    }
}
