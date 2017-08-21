package tears.email.impl;

import tears.email.ClientEmail;

/**
 * @author Viktor Bilko on 21.08.2017.
 */
public class ClientEmailImpl implements ClientEmail {

    /**
     * {@inheritDoc}.
     */
    @Override
    public void sendMessage(String message, String email) {
        System.out.println(message);
    }
}
