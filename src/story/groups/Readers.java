package story.groups;

import story.*;

public class Readers extends Group {
    public Readers() {
        super("Читатели");
    }

    public void reportInfo(Group group) {
        System.out.println("Читатели сообщили сведения в: " + group.getName());
    }
    public void writeLetter(Group group, String text, String author){
        class Letter {
            public void sendLetter(){
                System.out.println("~~~~~Письмо~~~~~\nПолучатель: " + group.getName() + "\n"
                        + text + "\nОтправитель: " + author + "\n~~~~~~~~~~~~~~~~");
            }
        }
        Letter letter = new Letter();
        letter.sendLetter();
    }
}
