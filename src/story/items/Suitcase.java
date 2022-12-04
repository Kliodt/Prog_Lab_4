package story.items;

import story.Item;
import story.Storable;

public class Suitcase extends Item {
    private String name = "Чемодан"; //имя
    private String content = ""; //содержимое
    private boolean isFound = false; //найден

    public Suitcase(Storable content){
        this.content = content.getName();
    }


    @Override
    public String getName(){
        return name;
    }
    public void find(){
        isFound = true;
        System.out.println("Чемодан найден");
    }
    public void getState(){
        System.out.println(isFound? "Чемодан найден" : "Чемодан не найден");
    }

    public String getContent() {
        return content;
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if (obj instanceof Suitcase){
            if (this.getName().equals(((Suitcase)obj).getName()) && this.getContent().equals(((Suitcase)obj).getContent())) return true;
        }
        return false;
    }
    @Override
    public int hashCode(){
        return name.hashCode() * 7 + content.hashCode() * 2;
    }
    @Override
    public String toString(){
        return getName() + " c " + getContent();
    }
}
