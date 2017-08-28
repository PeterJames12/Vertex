package tears.service.impl.email.impl;

import tears.service.EmailService;

/**
 * @author Viktor Bilko on 21.08.2017.
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
