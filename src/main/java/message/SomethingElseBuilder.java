package message;

/**
 * @author Igor Hnes on 8/28/17.
 */
public class SomethingElseBuilder extends Builder {

    private static final String SUBJECT = "Something else";

    @Override
    String subject() {
        return SUBJECT;
    }

    @Override
    String text() {
        return "Dear..";
    }
}
