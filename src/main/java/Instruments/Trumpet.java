package Instruments;

public class Trumpet extends Instrument {
    public Trumpet(String name, String material, String colour, Type type, double price, double cost) {
        super(name, material, colour, type, price, cost);
    }

    @Override
    public String play() {
        return "TRUMP";
    }
}
