package story.groups;

import story.*;

public class Police extends Group {
    public Police(){
        super("Полиция");
    }
    public Investigation startInvestigation(){
        System.out.println("Полиция начала расследование");
        return new Investigation();
    }
}
