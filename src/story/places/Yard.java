package story.places;

import story.Place;

public class Yard implements Place {

    private String name = "двор";
    private String street;
    private int house = 0;

    public Yard(int house, String street) {
        this.house = house;
        this.street = street;
    }

    public Yard() {
    }

    @Override
    public String getName() {
        if (house != 0) {
            return name + " дома " + house + " по улице " + street;
        }
        return name;
    }

    @Override
    public String toString() {
        return getName();
    }
}
