package LiloProject.service;

import LiloProject.model.Instructor;

/**
 * Created by qw-user on 27.08.2017.
 */
public interface InstructorService {


    /**
     * @return Instructor
     */
    Instructor getInstructorByEmail(String email);

    /**
     * @return Instructor
     */
    Instructor getPhoneNumberByInstructor(String phoneNumber);

    /**
     * @return list of Instructors
     */
    Instructor[] getInstructors();

    /**
     * @param id is instructor's id.
     * @return {@link Instructor} entity by given id.
     */
    Instructor getByid(Long id);

    void setCall(Instructor instructor);

    /**
     * Change password.
     */
    void changePassword(Instructor instructor);

}
