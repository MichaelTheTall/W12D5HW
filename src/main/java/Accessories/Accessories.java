package Accessories;

import Behaviours.ISell;

public abstract class Accessories implements ISell {

//    private String name;
//    private String description;
    private double price;
    private double cost;

    public Accessories(double price, double cost) {
//        this.name = name;
//        this.description = description;
        this.price = price;
        this.cost = cost;
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
