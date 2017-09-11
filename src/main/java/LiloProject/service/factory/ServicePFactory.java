package LiloProject.service.factory;

import LiloProject.service.EmailService;
import LiloProject.service.InstructorService;
import LiloProject.service.PhoneService;
import LiloProject.service.ProjectService;
import LiloProject.service.impl.EmailServiceImpl;
import LiloProject.service.impl.InstructorServiceImpl;
import LiloProject.service.impl.PhoneServiceImpl;
import LiloProject.service.impl.ProjectServiceImpl;

/**
 * Created by qw-user on 11.09.2017.
 */
public class ServicePFactory {

    public static ProjectService projectService = new ProjectServiceImpl();

    public static PhoneService phoneService = new PhoneServiceImpl();

    public static InstructorService instructorService = new InstructorServiceImpl();

    public static EmailService emailService = new EmailServiceImpl();
}
