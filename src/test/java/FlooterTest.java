import Accessories.Flooter;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlooterTest {

    Flooter flooter;

    @Before
    public void before(){
        flooter = new Flooter(50.00, 20.00);
    }

    @Test
    public void getters(){
        assertEquals("Flooter", flooter.getName());
        assertEquals("This refloots your floots for maximum doots!", flooter.getDescription());
        assertEquals(50.00, flooter.getPrice(), 0.01);
        assertEquals(20.00, flooter.getCost(), 0.01);
    }

}
