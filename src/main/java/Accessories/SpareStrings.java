package Accessories;

public class SpareStrings extends Accessories{

    private String name;
    private String description;

    public SpareStrings(double price, double cost) {
        super(price, cost);
        this.name = "Spare Strings";
        this.description = "By some dark, unknown magic, these bags always contain exactly the right number and type of strings to replace the set on your stringed instrument. Spooky.";
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
