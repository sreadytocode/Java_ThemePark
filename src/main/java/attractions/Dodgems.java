package attractions;

import behaviours.IReviewed;
import behaviours.ITicketed;
import people.Visitor;

public class Dodgems extends Attraction implements ITicketed {

    private Double defaultPrice;

    private Double priceFor;
    public Dodgems(String name, int rating) {
        super(name, rating);
        this.defaultPrice = 4.50;
        this.priceFor = 0.00;
    }

    public double getPriceFor(Visitor visitor) {
        if (visitor.getAge() <= 12) {
            return priceFor = defaultPrice / 2;
        } else {
            return defaultPrice;
        }
    }

    @Override
    public double defaultPrice(double price) {
        return this.defaultPrice;
    }

    @Override
    public double priceFor(Visitor visitor) {
        return this.priceFor;
    }
}
