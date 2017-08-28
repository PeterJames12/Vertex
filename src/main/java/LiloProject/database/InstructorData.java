package LiloProject.database;

import LiloProject.model.Instructor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by qw-user on 27.08.2017.
 */
public class InstructorData {


        public static List<Instructor> getInstructors() {

            final Instructor instructor = new Instructor();
            instructor.setName("Alex");
            instructor.setSurname("Smit");
            instructor.setPhoneNumber("0934698900");

            List<Instructor> instructorList = new ArrayList<>();
            instructorList.add(instructor);

            return instructorList;
        }
}
