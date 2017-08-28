package LiloProject.controller;

import LiloProject.dao.InstructorDao;
import LiloProject.model.Instructor;
import LiloProject.service.InstructorService;
import LiloProject.service.impl.InstructorServiceImpl;

/**
 * Created by qw-user on 27.08.2017.
 */
public class ProjectController {

    public static void main(String[] args) {

        InstructorService instructorService = new InstructorServiceImpl();
        instructorService.setCall("0554667577");

    }
}
