package story.places;

import story.Place;

public class Tire implements Place {
    private String name = "Шины";

    @Override
    public String getName() {
        return name;
    }
    @Override
    public String toString(){
        return getName();
    }
}
