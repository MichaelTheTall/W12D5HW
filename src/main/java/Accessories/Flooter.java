package Accessories;

public class Flooter extends Accessories {
    private String name;
    private String description;

    public Flooter(double price, double cost) {
        super(price, cost);
        this.name = "Flooter";
        this.description = "This refloots your floots for maximum doots!";
    }

    @Override
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
