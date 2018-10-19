import Instruments.Flute;
import Instruments.FluteType;
import Instruments.Type;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FluteTest {

    Flute flute;
    Type woodwind = Type.WOODWIND;
    FluteType cflute = FluteType.CFLUTE;


    @Before
    public void before(){
        flute = new Flute("MegaFlute", "Steel", "Chrome", woodwind, 200.00, 120.00, cflute);
    }

    @Test
    public void getterswork(){
        assertEquals("MegaFlute", flute.getName());
        assertEquals("Steel", flute.getMaterial());
        assertEquals("Chrome", flute.getColour());
        assertEquals(200.00, flute.getPrice(), 0.01);
        assertEquals(120.00, flute.getCost(), 0.01);
        assertEquals(Type.WOODWIND, flute.getType());
        assertEquals(FluteType.CFLUTE, flute.getFtype());
    }

    @Test
    public void markup(){
        assertEquals(80.00, flute.calculateMarkup(), 0.01);
    }

    @Test
    public void play(){
        assertEquals("FLUTEY NOISE", flute.play());
    }
}

