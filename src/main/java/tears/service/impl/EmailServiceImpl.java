package tears.service.impl;

import tears.model.User;
import tears.service.EmailService;

/**
 * Created by qw-user on 21.08.2017.
 */
public class EmailServiceImpl implements EmailService {


    @Override
    public User getName() {
        return null;
    }

    @Override
    public User getEmail() {
        return null;
    }

    @Override
    public User getPassword() {
        return null;
    }

    @Override
    public String sendMessage() {
        String message = "";
        if (message.equals("password")) {
            message = "newPassword";
        }else return "Not Correct";

        return message;
    }
}
