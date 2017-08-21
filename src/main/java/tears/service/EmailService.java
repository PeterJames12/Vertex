package tears.service;


import tears.model.User;

/**
 * Created by AlexB on 20.08.2017.
 */
public interface EmailService {

    /**
     * @return email adress.
     */
    User getName();

    /**
     * @return email adress.
     */
    User getEmail();

    /**
     * @return email.
     */
    User getPassword();

    String sendMessage();

}
