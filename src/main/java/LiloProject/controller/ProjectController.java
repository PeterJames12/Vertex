package LiloProject.controller;

import LiloProject.model.Instructor;
import LiloProject.service.InstructorService;
import LiloProject.service.impl.InstructorServiceImpl;
import lombok.val;

/**
 * Created by qw-user on 27.08.2017.
 */
public class ProjectController {

    private static InstructorServiceImpl instructorService;
    public static void main(String[] args) {
        val instructor = new Instructor();
        instructor.setName("Alex");
        instructor.setSurname("Glue");
        instructor.setPhoneNumber("0934698900");
        instructor.setEmail("quasek@gmail.com");
        instructorService.changePassword(instructor);
    }
//    private static InstructorService instructorService;
//
//    public static void main(String[] args) {
//            final Instructor instructor = new Instructor();
//            instructor.setName("Alex");
//            instructor.setSurname("Smit");
//            instructor.setEmail("alex@gmail.com");
//            instructorService.changePassword(instructor);
//
//    }
}
