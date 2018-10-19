import Accessories.Brasso;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BrassoTest {

    Brasso brasso;

    @Before
    public void before(){
        brasso = new Brasso(10.00, 2.00);
    }

    @Test
    public void getters(){
        assertEquals("Brasso Polish", brasso.getName());
        assertEquals("This polish is specifically for brass. That's why it's not called 'Steelo' or 'Aluminiumo'.", brasso.getDescription());
        assertEquals(10.00, brasso.getPrice(), 0.01);
        assertEquals(2.00, brasso.getCost(), 0.01);
    }

}
