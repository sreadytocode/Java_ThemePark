package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitor;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        visitor = new Visitor(18, 1.70, 15.0);
    }


    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName("Blue Ridge"));
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating(10));
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void isVisitorAllowed_True(){
        assertEquals(true, rollerCoaster.isAllowedTo(visitor));
    }

    @Test
    public void isVisitorAllowed_False_Over_12(){
        Visitor visitor1 = new Visitor(13, 1.0, 100.00);
        assertEquals(false, rollerCoaster.isAllowedTo(visitor1));
    }

    @Test
    public void isVisitorAllowed_False_Over_Height_Limit(){
        Visitor visitor1 = new Visitor(10, 1.70, 100.00);
        assertEquals(false, rollerCoaster.isAllowedTo(visitor1));
    }

    @Test
    public void chargeVisitorDefaultPrice(){
        Visitor visitor2 = new Visitor(10, 1.70, 100.00);
        assertEquals(8.40, rollerCoaster.getPriceFor(visitor2), 0);
    }

    @Test
    public void chargeVisitorDoubleDefaultPrice(){
        Visitor visitor2 = new Visitor(10, 2.00, 100.00);
        assertEquals(16.80, rollerCoaster.getPriceFor(visitor2), 0);
    }



}
