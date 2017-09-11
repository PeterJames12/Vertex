package LiloProject.dao.factory;

import LiloProject.dao.Impl.InstructorDaoImpl;
import LiloProject.dao.InstructorDao;
import LiloProject.service.ProjectService;
import LiloProject.service.impl.ProjectServiceImpl;

/**
 * Created by qw-user on 11.09.2017.
 */
public class DaoFactory {

    public static ProjectService projectService = new ProjectServiceImpl();

    public static InstructorDao instructorDao = new InstructorDaoImpl();
}
