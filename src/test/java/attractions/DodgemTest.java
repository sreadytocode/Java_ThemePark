package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class DodgemTest {

    Dodgems dodgems;
    Visitor visitor;

    @Before
    public void setUp() throws Exception {
        dodgems = new Dodgems("Bumper Cars", 5);
    }


    @Test
    public void hasName() {
        assertEquals("Bumper Cars", dodgems.getName("Bumper Cars"));
    }

    @Test
    public void hasRating() {
        assertEquals(5, dodgems.getRating(5));
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, dodgems.getVisitCount());
    }

    @Test
    public void hasTicketFullPrice(){
        visitor = new Visitor(13, 1.70, 100.00);
        assertEquals(4.50, dodgems.getPriceFor(visitor), 0.0);
    }

    @Test
    public void hasTicketHalfPrice(){
        Visitor visitor1 = new Visitor(10, 1.70, 100.00);
        assertEquals(2.25, dodgems.getPriceFor(visitor1), 0.0);
    }


}
