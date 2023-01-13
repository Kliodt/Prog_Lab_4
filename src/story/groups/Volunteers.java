package story.groups;

import story.*;


public class Volunteers extends Group {
    public Volunteers() {
        super("Народ");
    }

    public void startSearching(Item item) {
        System.out.println("Народ начал искать " + item.getName());
    }
}
