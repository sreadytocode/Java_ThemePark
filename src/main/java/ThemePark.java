import attractions.Attraction;
import behaviours.IReviewed;
import stalls.Stall;

import java.util.ArrayList;

public class ThemePark implements IReviewed {

    private ArrayList<Attraction> attractions;
    private ArrayList<Stall> stalls;

    private ArrayList<IReviewed> reviewed;


    public ThemePark() {
        this.attractions = new ArrayList<>();
        this.stalls = new ArrayList<>();

    }

}
