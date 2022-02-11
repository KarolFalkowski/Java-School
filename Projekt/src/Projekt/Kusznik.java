package Projekt;

public class Kusznik extends Dobry implements Wojownik,Lucznik {

    public Kusznik(String nazwa) {
        super(nazwa, 20, 50, "Cłowiek", 0);
        rodzajataku=3;
    }
    public Kusznik() {
        super("Kusznik",20,50,"Człowiek",0);
        rodzajataku=3;
    }

    @Override
    public int obrazeniaDystansowe() {
        return this.obrazenia*=5;
    }

    @Override
    public int obrazeniaMele() {
        return this.obrazenia/=10;
    }

    @Override
    public String toString() {
        return "Nazwa: " + nazwa + "\n" +
                "Życie: " + zycie + "\n" +
                "Obrazenia mele: " + obrazeniaMele() + "\n" +
                "Obrazenia dystansowe: " + obrazeniaDystansowe() + "\n" +
                "Rasa: " + rasa + "\n" +
                "Manna: " + mana;
    }
}
