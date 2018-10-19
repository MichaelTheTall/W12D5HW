package Accessories;

import Behaviours.ISell;

public abstract class Accessories implements ISell {

    private String name;
    private String description;
    private double price;
    private double cost;

    public Accessories(String name, String description, double price, double cost) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public double getCost() {
        return cost;
    }

    @Override
    public double calculateMarkup() {
        return (this.price - this.cost);
    }
}
