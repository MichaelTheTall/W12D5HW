package Instruments;

public class Flute extends Instrument {

    public Flute(String name, String material, String colour, Type type, double price, double cost) {
        super(name, material, colour, type, price, cost);
    }

    @Override
    public String play() {
        return "FLUTEY NOISE";
    }
}
