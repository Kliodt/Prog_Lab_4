package story.persons;

import story.Person;
import story.PoliceWorkers;

public class Commissioner extends Person {
    private String name;
    private PoliceWorkers post = PoliceWorkers.COMMISSIONER;

    public Commissioner(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return post.getName() + name;
    }

    public void remand(Person person) {
        System.out.println("Комиссар поместил под стражу: " + person.getName());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj instanceof Commissioner) {
            if (this.getName().equals(((Commissioner) obj).getName())) return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return name.hashCode() * 2;
    }

    @Override
    public String toString() {
        return getName();
    }
}
