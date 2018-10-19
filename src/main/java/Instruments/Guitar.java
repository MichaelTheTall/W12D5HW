package Instruments;

public class Guitar extends Instrument {

    private int strings;
    private GuitarType gtype;

    public Guitar(String name, String material, String colour, Type type, double price, double cost, int strings, GuitarType gtype) {
        super(name, material, colour, type, price, cost);
        this.strings = strings;
        this.gtype = gtype;
    }

    public int getStrings() {
        return strings;
    }

    public GuitarType getGtype() {
        return gtype;
    }

    @Override
    public String play() {
        return "GUITAR SOUND";
    }
}
