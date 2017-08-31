package LiloProject.dao.Impl;

import LiloProject.dao.InstructorDao;
import LiloProject.database.InstructorData;
import LiloProject.model.Instructor;

import java.util.List;

/**
 * Created by qw-user on 27.08.2017.
 */
public class InstructorDaoImpl implements InstructorDao {


    Instructor instructor;

    /**
     * {@inheritDoc}.
     */
    @Override
    public Instructor getInstructorByEmail(String email) {
        final Instructor[] instructors = InstructorData.getInstructors();
        for (Instructor instructor : instructors) {
            if (instructor.getEmail().equals(email)) {
                return instructor;
            }
        }
        return null;
    }

    /**
     * {@inheritDoc}.
     */
    @Override
    public Instructor[] getInstructors() {
        return InstructorData.getInstructors();
    }

    /**
     * {@inheritDoc}.
     */
    @Override
    public Instructor getById(Long id) {
        return null;
    }

    /**
     * {@inheritDoc}.
     */
    @Override
    public Instructor update(Instructor instructor) {
        return null;
    }


    @Override
    public Instructor getPhoneNumberByInstructor(String phoneNumber) {

        final Instructor[] instructors = InstructorData.getInstructors();
        for (Instructor instructor : instructors) {
            if (instructor.getPhoneNumber().equals(phoneNumber)) {
                return instructor;
            }

        }
        return null;
    }
}


//        final List<Instructor> instructors = InstructorData.getInstructors();
//
//        for (Instructor instructor : instructors) {
//            if (instructor.getPhoneNumber().equals(phoneNumber)) {
//                return instructor;
//            }
//
//        }
//        return null;
