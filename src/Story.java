import story.*;
import story.groups.*;
import story.items.Suitcase;
import story.persons.*;
import story.places.*;

public class Story {
    public static void main(String[] args) {
        System.out.println("---Начало истории---");

        Readers readers = new Readers();
        Police police = new Police();
        Robbers robbers = new Robbers();
        Cashier cashier = new Cashier();
        Money money = new Money(255000);

        Frontage frontage = new Frontage();
        Yard yard = new Yard();
        Yard yardOfHouse47 = new Yard(47, "Кривая");
        Tire tires = new Tire();

        Commissioner commissioner = new Commissioner("Пшигль");
        Suitcase suitcase = new Suitcase(money);
        Volunteers volunteers = new Volunteers();
        Car car = new Car(robbers);

        readers.reportInfo(police);
        Investigation investigation = police.startInvestigation();

        investigation.arrest(cashier);
        cashier.swear();
        investigation.rummage(new Place[]{frontage, yard});
        investigation.dig(new Place[]{yardOfHouse47});
        investigation.check(new Place[]{tires});

        commissioner.remand(cashier);
        suitcase.getState();
        investigation.getResults(new String[]{"чемодан не был найден", "найден дохлый кот", "рухнула стена дома"});

        car.driveAway();
        volunteers.startSearching(car);

        System.out.println("---Конец истории---");
    }
}
