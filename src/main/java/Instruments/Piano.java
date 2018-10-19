package Instruments;

public class Piano extends Instrument {

    private PianoType ptype;

    public Piano(String name, String description, String material, String colour, Type type, double price, double cost, PianoType ptype) {
        super(name, description, material, colour, type, price, cost);
        this.ptype = ptype;
    }

    @Override
    public String play() {
        return "PLINK PLONK";
    }

    public PianoType getPtype() {
        return ptype;
    }
}
