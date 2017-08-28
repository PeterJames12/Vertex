package LiloProject.service;

import LiloProject.model.Instructor;

/**
 * Created by qw-user on 27.08.2017.
 */
public interface InstructorService {


    /**
     * @return Instructor
     */
    Instructor getInstructor();

    /**
     * @return list of Instructors
     */
    Instructor[] getInstructors();

    /**
     * @return phoneNumber
     */
    Instructor getPhoneNumberByName(String phoneNumber);

    void welcomeMessage(Instructor instructor);

    void setCall(String phoneNumber);

}
