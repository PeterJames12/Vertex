package LiloProject.database;

import LiloProject.model.Instructor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by qw-user on 27.08.2017.
 */
public class InstructorData {


    public static Instructor[] getInstructors() {
        final Instructor instructor = new Instructor();
        instructor.setName("Alex");
        instructor.setSurname("Smit");
        instructor.setPhoneNumber("0934698900");
        instructor.setEmail("alex@gmail.com");

        Instructor[] instructors = new Instructor[1];
        instructors[0] = instructor;

        return  instructors;
    }


//        public static List<Instructor> getInstructors() {
//
//            final Instructor instructor = new Instructor();
//            instructor.setName("Alex");
//            instructor.setSurname("Smit");
//            instructor.setPhoneNumber("0934698900");
//            instructor.setEmail("alex@gmail.com");
//
//            List<Instructor> instructorList = new ArrayList<>();
//            instructorList.add(instructor);
//
//            return instructorList;
//        }
}
