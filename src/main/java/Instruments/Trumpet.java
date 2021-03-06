package Instruments;

public class Trumpet extends Instrument {

    private TrumpetType ttype;

    public Trumpet(String name, String description, String material, String colour, Type type, double price, double cost, TrumpetType ttype) {
        super(name, description, material, colour, type, price, cost);
        this.ttype = ttype;
    }

    public TrumpetType getTtype() {
        return ttype;
    }

    @Override
    public String play() {
        return "TRUMP";
    }
}
