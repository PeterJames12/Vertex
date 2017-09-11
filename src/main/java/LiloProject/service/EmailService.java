package LiloProject.service;

import LiloProject.model.Instructor;

/**
 * Created by qw-user on 30.08.2017.
 */
public interface EmailService {

    /**
     * Send message to instructor entity.
     */
    void send(Instructor instructor);
}
