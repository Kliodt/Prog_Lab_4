package story;

import java.util.Arrays;

public class Investigation {

    public void arrest(Person person){
        System.out.println("Арестован " + person.getName());
    }
    public void rummage(Place[] places){
        System.out.println("Обшарены " + Arrays.toString(places).replace("[", "").replace("]", ""));
    }
    public void dig(Place[] places){
        System.out.println("Изрыты " + Arrays.toString(places).replace("[", "").replace("]", ""));
    }

    public void getResults(String[] results){
        System.out.println("Результаты:\n  " + String.join(",\n  ", results));
    }
    public void check(Place[] places) {
        System.out.println("Проверены " + Arrays.toString(places).replace("[", "").replace("]", ""));
    }
}
