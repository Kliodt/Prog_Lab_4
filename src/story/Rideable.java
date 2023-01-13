package story;

public interface Rideable {
    String getDriver();

    void setDriver(Person driver);

    void setDriver(Group driver);

    void driveAway();
}
