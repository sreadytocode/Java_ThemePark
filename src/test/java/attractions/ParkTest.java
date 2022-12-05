package attractions;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParkTest {

    Park park;

    @Before
    public void setUp() throws Exception {
        park = new Park("Leafy Meadows", 9);
    }

    @Test
    public void hasName() {
        assertEquals("Leafy Meadows", park.getName("Leafy Meadows"));
    }

    @Test
    public void hasRating() {
        assertEquals(9, park.getRating(9));
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, park.getVisitCount());
    }
}
