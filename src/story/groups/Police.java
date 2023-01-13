package story.groups;
import story.*;
import story.exceptions.ActionForbiddenException;
import story.persons.Commissioner;
import java.util.Arrays;

public class Police extends Group {
    public Police() {
        super("Полиция");
    }

    public Investigation startInvestigation() {
        System.out.println("Полиция начала расследование");
        return new Investigation();
    }

    public static class Investigation {

        public void arrest(Person person) throws ActionForbiddenException {
            if (person instanceof Commissioner) {
                throw new ActionForbiddenException("нельзя арестовать комиссара");
            } else {
                System.out.println("Арестован " + person.getName());
            }
        }

        public void rummage(Place[] places) {
            System.out.println("Обшарены " + Arrays.toString(places).replace("[", "").replace("]", ""));
        }

        public void dig(Place[] places) {
            System.out.println("Изрыты " + Arrays.toString(places).replace("[", "").replace("]", ""));
        }

        public void getResults(String[] results) {
            System.out.println("Результаты:\n  " + String.join(",\n  ", results));
        }

        public void check(Place[] places) {
            System.out.println("Проверены " + Arrays.toString(places).replace("[", "").replace("]", ""));
        }
    }
}
