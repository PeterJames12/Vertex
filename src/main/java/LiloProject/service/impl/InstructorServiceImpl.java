package LiloProject.service.impl;

import LiloProject.dao.InstructorDao;
import LiloProject.database.InstructorData;
import LiloProject.email.EmailService;
import LiloProject.model.Instructor;
import LiloProject.service.InstructorService;
import LiloProject.service.PhoneService;

/**
 * Created by qw-user on 27.08.2017.
 */
public class InstructorServiceImpl implements InstructorService {

    InstructorDao instructorDao;
    EmailService emailService;
    PhoneService phoneService;


    @Override
    public Instructor getInstructor() {
        return null;
    }

    @Override
    public Instructor[] getInstructors() {
        return instructorDao.getInstructors();
    }

    @Override
    public Instructor getPhoneNumberByName(String phoneNumber) {
        return instructorDao.getPhoneNumberByName(phoneNumber);
    }

    @Override
    public void welcomeMessage(Instructor instructor) {
        Instructor instructorNumberByName = instructorDao.getPhoneNumberByName(instructor.getPhoneNumber());
        instructorNumberByName.setPhoneNumber("0934698900");
        instructorDao.update(instructor);
        emailService.send(instructor);

    }

    @Override
    public void setCall(String name) {

        Instructor instructor = new Instructor();
        instructor.getPhoneNumber().equals(name);
        phoneService.makecall("Alex");
    }

}
