package tears.service.impl.email;

import tears.model.User;
import tears.service.EmailService;

/**
 * @author Igor Hnes on 8/21/17.
 */
public class EmailServiceImpl implements EmailService {

    /**
     * {@inheritDoc}.
     */
    @Override
    public void send(User user) {
        sendMessage(buildMessage(user), user.getEmail());
    }

    private String buildMessage(User user) {
        return "Dear "
                + user.getName()
                + " "
                + "your password has been changed to"
                + "\n"
                + user.getPassword();
    }

    private void sendMessage(String message, String email) {
        System.out.println(message);
        System.out.println(email);
        // Email API
    }
}
