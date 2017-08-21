package tears.service;

import tears.model.User;

/**
 * @author Igor Hnes on 8/21/17.
 */
public interface EmailService {

    /**
     * Send message to user entity.
     */
    void send(User user);
}
