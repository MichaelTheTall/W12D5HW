import Accessories.SpareStrings;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SpareStringsTest {

    SpareStrings spareStrings;

    @Before
    public void before(){
        spareStrings = new SpareStrings(20.00, 8.00);
    }

    @Test
    public void getters(){
        assertEquals("Spare Strings", spareStrings.getName());
        assertEquals("By some dark, unknown magic, these bags always contain exactly the right number and type of strings to replace the set on your stringed instrument. Spooky.", spareStrings.getDescription());
        assertEquals(20.00, spareStrings.getPrice(), 0.01);
        assertEquals(8.00, spareStrings.getCost(), 0.01);
    }

}
