package LiloProject.service.impl;

import LiloProject.model.Instructor;
import LiloProject.service.PhoneService;

/**
 * Created by qw-user on 25.08.2017.
 */
public class PhoneServiceImpl implements PhoneService {

    Instructor instructor;

    @Override
    public void makecall(Instructor instructor) {
        call(instructor.getPhoneNumber());
    }

    private void call(String phoneNumber) {
        System.out.println("CALLING" + phoneNumber);
    }
}
