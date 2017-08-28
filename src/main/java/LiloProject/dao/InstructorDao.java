package LiloProject.dao;

import LiloProject.model.Instructor;

/**
 * Created by qw-user on 27.08.2017.
 */
public interface InstructorDao {

    /**
     * @return Instructor
     */
    Instructor getInstructor();

    /**
     * @return list of Instructors
     */
    Instructor[] getInstructors();

    /**
     * @return Phonenumber
     */
    Instructor getPhoneNumberByName(String phoneNumber);

    Instructor update(Instructor instructor);

}
