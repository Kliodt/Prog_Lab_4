import story.*;
import story.exceptions.*;
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
        //Money money = new Money(255000);

        Frontage frontage = new Frontage();
        Yard yard = new Yard();
        Yard yardOfHouse47 = new Yard(47, "Кривая");
        Tire tires = new Tire();

        Commissioner commissioner = new Commissioner("Пшигль");
        Suitcase suitcase = new Suitcase(new Storable() {
            @Override
            public String getName() {
                return "Деньги";
            }

            @Override
            public int getValue() {
                return 350000;
            }
        }); // анонимный класс
        Volunteers volunteers = new Volunteers();
        Car car = new Car(robbers);

        readers.writeLetter(police, "Деньги стибрили сами полицейские. Это говорю вам точно", "Сарданапал");
        readers.reportInfo(police);
        Police.Investigation investigation = police.startInvestigation();

        //проверка исключения 1 (checked)
        try {
            investigation.arrest(cashier);
        } catch (ActionForbiddenException e) {
            System.out.println("Action forbidden: " + e.getMessage());
        }

        try {
            investigation.arrest(commissioner);
        } catch (ActionForbiddenException e) {
            System.out.println("Action forbidden: " + e.getMessage());
        }

        cashier.swear();
        commissioner.remand(cashier);
        investigation.rummage(new Place[]{frontage, yard});

        suitcase.getState();

        //проверка исключения 2 (unchecked)
        try {
            suitcase.getContent();
        } catch (ItemNotFoundException e) {
            System.out.println("Can't get content: " + e.getMessage());
        }

        investigation.dig(new Place[]{yardOfHouse47});
        investigation.check(new Place[]{tires});

        investigation.getResults(new String[]{"чемодан не был найден", "найден дохлый кот", "рухнула стена дома"});

        car.driveAway();
        volunteers.startSearching(car);

        System.out.println("---Конец истории---");

    }
}
