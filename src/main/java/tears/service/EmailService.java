package tears.service;

/**
 * @author Viktor Bilko on 21.08.2017.
 */
public interface EmailService {


    /**
     * @param message is massage for client.
     * @param email clients.
     */
    void sendMessage(String message, String email);
}
