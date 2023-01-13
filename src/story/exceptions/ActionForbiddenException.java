package story.exceptions;

public class ActionForbiddenException extends Exception {

    public ActionForbiddenException() {
    }

    public ActionForbiddenException(String string) {
        super(string);
    }
}
