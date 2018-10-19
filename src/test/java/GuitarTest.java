import Instruments.Guitar;
import Instruments.GuitarType;
import Instruments.Type;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {


    Guitar guitar;
    Type string = Type.STRING;
    GuitarType bass = GuitarType.BASS;


    @Before
    public void before(){
        guitar = new Guitar("BassBlaster5000", "Aluminium", "ElectricBlue", string, 2000.00, 1200.00, 8, bass);
    }

    @Test
    public void getterswork(){
        assertEquals("BassBlaster5000", guitar.getName());
        assertEquals("Aluminium", guitar.getMaterial());
        assertEquals("ElectricBlue", guitar.getColour());
        assertEquals(2000.00, guitar.getPrice(), 0.01);
        assertEquals(1200.00, guitar.getCost(), 0.01);
        assertEquals(8, guitar.getStrings());
        assertEquals(Type.STRING, guitar.getType());
        assertEquals(GuitarType.BASS, guitar.getGtype());
    }

    @Test
    public void markup(){
        assertEquals(800.00, guitar.calculateMarkup(), 0.01);
    }

    @Test
    public void play(){
        assertEquals("GUITAR SOUND", guitar.play());
    }
}
