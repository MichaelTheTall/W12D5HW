import Accessories.Brasso;
import Accessories.Flooter;
import Accessories.SpareStrings;
import Instruments.*;
import Shop.ShopMaster;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopMasterTest {

    ShopMaster shop;
    Brasso brasso;
    Flooter flooter;
    SpareStrings spareStrings;
    Piano piano;
    Flute flute;
    Trumpet trumpet;
    Guitar guitar;
    Type woodwind = Type.WOODWIND;
    FluteType cflute = FluteType.CFLUTE;
    Type brass = Type.BRASS;
    TrumpetType alto = TrumpetType.ALTO;
    Type keyboard = Type.KEYBOARD;
    PianoType organ = PianoType.ORGAN;
    Type string = Type.STRING;
    GuitarType bass = GuitarType.BASS;


    @Before
    public void before(){
        shop = new ShopMaster("The Place You Go When You Want To Buy Things That Make Noises");
        brasso = new Brasso(10.00, 2.00);
        flooter = new Flooter(50.00, 20.00);
        spareStrings = new SpareStrings(20.00, 8.00);
        flute = new Flute("MegaFlute", "MAXIMUM FLOOT DOOT","Steel", "Chrome", woodwind, 200.00, 120.00, cflute);
        trumpet = new Trumpet("SmolTrumpet", "A Smol Trump","Brass", "Gold", brass, 500.00, 280.00, alto);
        piano = new Piano("UberPiano", "IT'S OVER NINE THOUSAAAAAND","Wood", "Oak", keyboard, 10000.00, 7500.00, organ);
        guitar = new Guitar("BassBlaster5000", "ALL YOUR BASS ARE BELONG TO US", "Aluminium", "ElectricBlue", string, 2000.00, 1200.00, 8, bass);
    }

    @Test
    public void getShopName(){
        assertEquals("The Place You Go When You Want To Buy Things That Make Noises", shop.getName());
    }

    @Test
    public void addStock(){
        assertEquals(0, shop.getStock().size());
        shop.addStock(guitar);
        assertEquals(1, shop.getStock().size());
    }

    @Test
    public void removeStock(){
        assertEquals(0, shop.getStock().size());
        shop.addStock(guitar);
        assertEquals(1, shop.getStock().size());
        shop.removeStock(guitar);
        assertEquals(0,shop.getStock().size());
    }

    @Test
    public void canAddDiffStock(){
        shop.addStock(guitar);
        shop.addStock(piano);
        shop.addStock(trumpet);
        shop.addStock(flute);
        shop.addStock(flooter);
        shop.addStock(brasso);
        shop.addStock(spareStrings);
        assertEquals(7, shop.getStock().size());
    }

    @Test
    public void clearStock(){
        shop.addStock(guitar);
        shop.addStock(piano);
        shop.addStock(trumpet);
        shop.addStock(flute);
        shop.addStock(flooter);
        shop.addStock(brasso);
        shop.addStock(spareStrings);
        assertEquals(7, shop.getStock().size());
        shop.clearStock();
        assertEquals(0, shop.getStock().size());
    }

    @Test
    public void totalProfit(){
        shop.addStock(guitar);
        shop.addStock(piano);
        shop.addStock(trumpet);
        shop.addStock(flute);
        shop.addStock(flooter);
        shop.addStock(brasso);
        shop.addStock(spareStrings);
        assertEquals(7, shop.getStock().size());
        assertEquals(3650.00, shop.totalProfit(), 0.01);
    }

}
