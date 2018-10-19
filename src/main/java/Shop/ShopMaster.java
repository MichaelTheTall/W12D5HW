package Shop;

import Accessories.Accessories;
import Behaviours.ISell;
import Instruments.Instrument;

import java.util.ArrayList;

public class ShopMaster {

    private String name;
    private ArrayList<ISell> stock;

    public ShopMaster(String name) {
        this.name = name;
        this.stock = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<ISell> getStock() {
        return stock;
    }

    public void addStock(ISell item) {
        stock.add(item);
    }

    public void removeStock(ISell item) {
        stock.remove(item);
    }

    public void clearStock() {
        stock.clear();
    }

    public String playInstrument(Instrument instrument) {
        return instrument.play();
    }

    public String itemName(ISell item) {
        return item.getName();
    }

    public String showDescription(ISell item) {
        return item.getDescription();
    }

    public double totalProfit() {
        double result = 0.00;
        for (ISell item: stock) {
            result += item.calculateMarkup();
        }
        return result;
    }
}
