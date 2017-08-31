package LiloProject.service.impl;

import LiloProject.dao.InstructorDao;
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
    public void setCall(Instructor instructor){
        Instructor instructorByPhone = instructorDao.getPhoneNumberByInstructor(instructor.getPhoneNumber());
        instructorByPhone.setPhoneNumber("0992447589");
        instructorDao.update(instructor);
        phoneService.makecall(instructor);



    }

    @Override
    public Instructor getInstructorByEmail(String email) {
        return instructorDao.getInstructorByEmail(email);
    }

    @Override
    public Instructor getPhoneNumberByInstructor(String phoneNumber) {
        return instructorDao.getPhoneNumberByInstructor(phoneNumber);
    }

    @Override
    public Instructor[] getInstructors() {
        return instructorDao.getInstructors();
    }

    @Override
    public Instructor getByid(Long id) {
        return null;
    }

    @Override
    public void changePassword(Instructor instructor) {
        Instructor instructorByEmail = instructorDao.getInstructorByEmail(instructor.getEmail());
        instructorByEmail.setPassword("234r56");
        instructorDao.update(instructor);
        emailService.send(instructor);
    }
}
