package attractions;

import behaviours.IReviewed;

public abstract class Attraction implements IReviewed {
    private String name;

    private int rating;
    private int visitCount;


    public Attraction(String name, int rating) {
        this.name = name;
        this.rating = 0;
        this.visitCount = 0;
    }

    public String getName(String name) {
        return name;
    }

    public int getRating(int score) {
        return rating += score;
    }

    public int getVisitCount() {
        return visitCount;
    }
}
