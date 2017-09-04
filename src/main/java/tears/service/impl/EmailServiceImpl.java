package tears.service.impl;



import tears.model.User;
import tears.service.EmailService;

/**
 * Created by qw-user on 21.08.2017.
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

    public void sendMessage(String message, String email) {
        try {
            if (message.isEmpty()) {
                throw new RuntimeException();
            }
        } catch (RuntimeException e) {
            System.out.println("Message without text" + " " + e);
        }
        System.out.println(message);
        System.out.println(email);
        // Email API
    }

}