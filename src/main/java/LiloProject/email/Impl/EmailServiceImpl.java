package LiloProject.email.Impl;

import LiloProject.email.EmailService;
import LiloProject.model.Instructor;

/**
 * Created by qw-user on 28.08.2017.
 */
public class EmailServiceImpl implements EmailService {


    @Override
    public void send(Instructor instructor) {
        sendMessage(buildMessage(instructor),instructor.getEmail());
    }

    private String buildMessage(Instructor instructor) {
        return "Hello"
                + instructor.getName()
                + " "
                + "your Students welcome you"
                + "\n"
                + instructor. getPhoneNumber();
    }

    private void sendMessage(String message, String email) {
        System.out.println(message);
        System.out.println(email);
    }
}
