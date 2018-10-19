package Accessories;

public class Brasso extends Accessories{

    private String name;
    private String description;

    public Brasso(double price, double cost) {
        super(price, cost);
        this.name = "Brasso Polish";
        this.description = "This polish is specifically for brass. That's why it's not called 'Steelo' or 'Aluminiumo'.";
    }

    @Override
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
