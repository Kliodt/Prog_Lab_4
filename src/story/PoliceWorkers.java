package story;

public enum PoliceWorkers {
    OFFICER("Офицер"),
    COMMISSIONER("Комиссар"),
    SECURITY("Охранник");

    private String name;
    PoliceWorkers(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
