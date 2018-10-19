package Instruments;

import Behaviours.IPlay;
import Behaviours.ISell;

public abstract class Instrument implements IPlay, ISell {
    private String name;
    private String description;
    private String material;
    private String colour;
    private Type type;
    private double price;
    private double cost;

    public Instrument(String name, String description, String material, String colour, Type type, double price, double cost) {
        this.name = name;
        this.description = description;
        this.material = material;
        this.colour = colour;
        this.type = type;
        this.price = price;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getMaterial() {
        return material;
    }

    public String getColour() {
        return colour;
    }

    public Type getType() {
        return type;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public double getCost() {
        return cost;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double calculateMarkup() {
        return (this.price - this.cost);
    }
}
