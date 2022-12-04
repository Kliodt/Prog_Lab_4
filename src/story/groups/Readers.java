package story.groups;

import story.*;

public class Readers extends Group {
    public Readers(){
        super("Читатели");
    }
    public void reportInfo(Group group){
        System.out.println("Читатели сообщили сведения в: " + group.getName());
    }
}
