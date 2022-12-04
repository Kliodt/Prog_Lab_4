package story;

public class Money implements Storable{
    private String name;
    private int value;
    public Money(String name, int value){
        this.value = value;
        this.name = name;
    }
    public Money(int value){
        this("Деньги", value);
    }

    @Override
    public String getName() {
        return name;
    }
    @Override
    public int getValue() {
        return value;
    }
}
