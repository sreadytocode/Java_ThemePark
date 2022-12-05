package attractions;

import behaviours.IReviewed;
import behaviours.ISecurity;
import behaviours.ITicketed;
import people.Visitor;

public class RollerCoaster extends Attraction implements ISecurity, ITicketed {

    private Double defaultPrice;

    private Double priceFor;

    public RollerCoaster(String name, int rating) {
        super(name, rating);
        this.defaultPrice = 8.40;
        this.priceFor = 0.0;


    }

    public boolean isAllowedTo(Visitor visitor){
        if (visitor.getAge() > 12 && visitor.getHeight() > 1.45){
            return true;
        } else {
            return false;
        }
    }


    public Double getDefaultPrice() {
        return this.defaultPrice;
    }


    public double getPriceFor(Visitor visitor) {
        if (visitor.getHeight() >= 2.00) {
            return priceFor = defaultPrice * 2;
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
