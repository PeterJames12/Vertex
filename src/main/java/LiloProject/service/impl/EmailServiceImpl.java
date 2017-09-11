package LiloProject.service.impl;

import LiloProject.model.Instructor;
import LiloProject.service.EmailService;

/**
 * Created by qw-user on 30.08.2017.
 */
public class EmailServiceImpl implements EmailService {


    @Override
    public void send(Instructor instructor) {
        sendMessage(buildMessage(instructor), instructor.getEmail());
    }

    private String buildMessage(Instructor instructor) {
        return "Dear "
                + instructor.getName()
                + " "
                + "your password has been changed to"
                + "\n"
                + instructor.getPassword();
    }

    private void sendMessage(String message, String email) {
        System.out.println(message);
        System.out.println(email);
        // Email API
    }
}
