package LiloProject.dao;

import LiloProject.model.Project;

/**
 * Created by qw-user on 27.08.2017.
 */
public interface ProjectServiceDao {

    /**
     * @return Project
     */
    Project getProject();

    /**
     * @return list of Projects
     */
    Project[] getProjects();


}
