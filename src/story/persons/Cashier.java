package story.persons;

import story.Person;

public class Cashier extends Person {
    private String name;
    private String post;
    public Cashier(String name){
        this.name = name;
        this.post = "Кассир";
    }
    public Cashier(){
        this.name = "";
        this.post = "Кассир";
    }

    @Override
    public String getName() {
        return post + name;
    }
    public void swear(){
        System.out.println("Кассир клянется: \"Я не похищал деньги\"");
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if (obj instanceof Cashier){
            if (this.getName().equals(((Cashier)obj).getName())) return true;
        }
        return false;
    }
    @Override
    public int hashCode(){
        return name.hashCode() * 4 - 1000;
    }
    @Override
    public String toString(){
        return getName();
    }
}
