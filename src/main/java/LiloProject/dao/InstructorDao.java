package LiloProject.dao;

import LiloProject.model.Instructor;

/**
 * Created by qw-user on 27.08.2017.
 */
public interface InstructorDao {


    /**
     * @return user.
     */
    Instructor getInstructorByEmail(String email);
    /**
     * @return list of Instructors
     */
    Instructor[] getInstructors();

    /**
     * @return Phonenumber
     */
    Instructor getPhoneNumberByInstructor(String phoneNumber);

    /**
     * @param id is user's id.
     * @return {@link Instructor} entity by given id.
     */
    Instructor getById(Long id);

    Instructor update(Instructor instructor);

}
