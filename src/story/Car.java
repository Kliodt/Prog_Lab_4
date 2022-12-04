package story;

public class Car extends Item implements Rideable {
    private String driver;
    private String name = "Машина";
    public Car(Group driver){
        this.driver = driver.getName();
    }
    public Car(Person driver){
        this.driver = driver.getName();
    }



    @Override
    public String getDriver(){
        return driver;
    }
    @Override
    public void setDriver(Person driver){
        this.driver = driver.getName();
    }
    @Override
    public void setDriver(Group driver){
        this.driver = driver.getName();
    }
    @Override
    public void driveAway() {
        System.out.println(name + " с " + getDriver() + " уехала далеко");
    }
    public String getName() {
        return name + " c " + driver;
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if (obj instanceof Car){
            if (this.getName().equals(((Car)obj).getName()) && this.getDriver().equals(((Car)obj).getDriver())) return true;
        }
        return false;
    }
    @Override
    public int hashCode(){
        return name.hashCode() * 5 + driver.hashCode() * 3;
    }
    @Override
    public String toString(){
        return getName();
    }
}
