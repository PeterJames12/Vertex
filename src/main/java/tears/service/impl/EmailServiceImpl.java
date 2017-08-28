package tears.service.impl;



import tears.service.EmailService;

/**
 * Created by qw-user on 21.08.2017.
 */
public class EmailServiceImpl implements EmailService {

    /**
     * {@inheritDoc}.
     */
    @Override
    public void sendMessage(String message, String email) {
        System.out.println(message);
    }
}
