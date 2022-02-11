package Projekt;

public class Kura extends Neutralny implements Wojownik{

    public Kura(String nazwa) {
        super(nazwa, 3, 1, "Zwierzę", 1);
        rodzajataku=1;
    }
    public Kura() {
        super("Kura", 3, 1, "Zwierzę", 1);
        rodzajataku=1;
    }

    @Override
    public int obrazeniaMele() {
        return this.obrazenia;
    }


}
