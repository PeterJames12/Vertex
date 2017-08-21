package tears.email;

/**
 * @author Viktor Bilko on 21.08.2017.
 */
public interface ClientEmail {


    /**
     * @param message is massage for client.
     * @param email clients.
     */
    void sendMessage(String message, String email);
}
