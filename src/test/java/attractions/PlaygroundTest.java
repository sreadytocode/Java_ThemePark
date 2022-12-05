package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {
    Playground playground;
    Visitor visitor;

    @Before
    public void setUp() throws Exception {
        playground = new Playground("Fun Zone", 7);
        visitor = new Visitor(9, 1.2, 15.0);
    }

    @Test
    public void hasName() {
        assertEquals("Fun Zone", playground.getName("Fun Zone"));
    }

    @Test
    public void hasRating() {
        assertEquals(7, playground.getRating(7));
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, playground.getVisitCount());
    }

    @Test
    public void isVisitorAllowed_True(){
        assertEquals(true, playground.isAllowedTo(visitor));
    }

    @Test
    public void isVisitorAllowed_False(){
        Visitor visitor1 = new Visitor(16, 2.0, 100.00);
        assertEquals(false, playground.isAllowedTo(visitor1));
    }
}
