package message;

/**
 * @author Igor Hnes on 8/28/17.
 */
public class InviteBuilder extends Builder {

    private static final String SUBJECT = "Invite";

    @Override
    String subject() {
        return SUBJECT;
    }

    @Override
    String text() {
        return "Dear...";
    }
}
