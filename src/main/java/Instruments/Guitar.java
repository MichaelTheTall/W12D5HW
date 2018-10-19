package Instruments;

public class Guitar extends Instrument {

    private int strings;
    private GuitarType type;

    public Guitar(String name, String material, String colour, Type type, double price, double cost) {
        super(name, material, colour, type, price, cost);
    }

    @Override
    public String play() {
        return "GUITAR SOUND";
    }
}
