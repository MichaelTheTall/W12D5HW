import Instruments.Piano;
import Instruments.PianoType;
import Instruments.Type;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {


    Piano piano;
    Type keyboard = Type.KEYBOARD;
    PianoType organ = PianoType.ORGAN;


    @Before
    public void before(){
        piano = new Piano("UberPiano", "IT'S OVER NINE THOUSAAAAAND","Wood", "Oak", keyboard, 10000.00, 7500.00, organ);
    }

    @Test
    public void getterswork(){
        assertEquals("UberPiano", piano.getName());
        assertEquals("IT'S OVER NINE THOUSAAAAAND", piano.getDescription());
        assertEquals("Wood", piano.getMaterial());
        assertEquals("Oak", piano.getColour());
        assertEquals(10000.00, piano.getPrice(), 0.01);
        assertEquals(7500.00, piano.getCost(), 0.01);
        assertEquals(Type.KEYBOARD, piano.getType());
        assertEquals(PianoType.ORGAN, piano.getPtype());
    }

    @Test
    public void markup(){
        assertEquals(2500.00, piano.calculateMarkup(), 0.01);
    }

    @Test
    public void play(){
        assertEquals("PLINK PLONK", piano.play());
    }
}
