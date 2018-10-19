import Instruments.Trumpet;
import Instruments.TrumpetType;
import Instruments.Type;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrumpetTest {

    Trumpet trumpet;
    Type brass = Type.BRASS;
    TrumpetType alto = TrumpetType.ALTO;


    @Before
    public void before(){
        trumpet = new Trumpet("SmolTrumpet", "A Smol Trump","Brass", "Gold", brass, 500.00, 280.00, alto);
    }

    @Test
    public void getterswork(){
        assertEquals("SmolTrumpet", trumpet.getName());
        assertEquals("A Smol Trump", trumpet.getDescription());
        assertEquals("Brass", trumpet.getMaterial());
        assertEquals("Gold", trumpet.getColour());
        assertEquals(500.00, trumpet.getPrice(), 0.01);
        assertEquals(280.00, trumpet.getCost(), 0.01);
        assertEquals(Type.BRASS, trumpet.getType());
        assertEquals(TrumpetType.ALTO, trumpet.getTtype());
    }

    @Test
    public void markup(){
        assertEquals(220.00, trumpet.calculateMarkup(), 0.01);
    }

    @Test
    public void play(){
        assertEquals("TRUMP", trumpet.play());
    }
}
