package tears.service;

import tears.model.User;

/**
 * @author Vladimir on 8/21/2017.
 */
public interface EmailService {
    void sendEmail(User user);
}
