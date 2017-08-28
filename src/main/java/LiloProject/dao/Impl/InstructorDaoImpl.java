package LiloProject.dao.Impl;

import LiloProject.dao.InstructorDao;
import LiloProject.database.InstructorData;
import LiloProject.model.Instructor;

import java.util.List;

/**
 * Created by qw-user on 27.08.2017.
 */
public class InstructorDaoImpl implements InstructorDao {

    @Override
    public Instructor getInstructor() {
        return null;
    }

    @Override
    public Instructor[] getInstructors() {
        return null;
    }

    @Override
    public Instructor getPhoneNumberByName(String phoneNumber) {

        final List<Instructor> instructors = InstructorData.getInstructors();

        for (Instructor instructor : instructors) {
            if (instructor.getPhoneNumber().equals(phoneNumber)) {
                return instructor;
            }

        }
        return null;
    }

    @Override
    public Instructor update(Instructor instructor) {
        return null;
    }

}
