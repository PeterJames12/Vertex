package tears.service;

/**
 * Created by AlexB on 20.08.2017.
 */
public interface EmailService {

    /**
     * Send message to given email.
     */
    void sendMessage(String message, String email);
}
