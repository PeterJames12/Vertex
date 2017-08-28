package LiloProject.service.impl;

import LiloProject.dao.InstructorDao;
import LiloProject.model.Instructor;
import LiloProject.service.PhoneService;

/**
 * Created by qw-user on 25.08.2017.
 */
public class PhoneServiceImpl implements PhoneService {




    @Override
    public void makecall(String phoneNumber) {


        System.out.println("CALLING" + phoneNumber);

    }
}
