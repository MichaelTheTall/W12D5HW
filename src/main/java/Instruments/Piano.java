package Instruments;

public class Piano extends Instrument {
    public Piano(String name, String material, String colour, Type type, double price, double cost) {
        super(name, material, colour, type, price, cost);
    }

    @Override
    public String play() {
        return "PLINK PLONK";
    }
}
