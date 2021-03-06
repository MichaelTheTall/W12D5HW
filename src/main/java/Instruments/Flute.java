package Instruments;

public class Flute extends Instrument {

    private FluteType ftype;

    public Flute(String name, String description, String material, String colour, Type type, double price, double cost, FluteType ftype) {
        super(name, description, material, colour, type, price, cost);
        this.ftype = ftype;
    }

    public FluteType getFtype() {
        return ftype;
    }

    @Override
    public String play() {
        return "FLUTEY NOISE";
    }
}
