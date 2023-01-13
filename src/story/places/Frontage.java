package story.places;

import story.*;

public class Frontage implements Place {
    private String name = "палисадник";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return getName();
    }
}
