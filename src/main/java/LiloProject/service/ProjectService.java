package LiloProject.service;

import LiloProject.model.Project;

/**
 * Created by qw-user on 27.08.2017.
 */
public interface ProjectService {


    /**
     * @return project
     */
    Project getProject();

    /**
     * @return list of projects
     */

    Project[] getProjects();

    /**
     * @return design for project
     */
    Project getDesign();

    /**
     * @param id is project's id.
     * @return {@link Project} entity by given id.
     */
    void getById(Long id);


    void contact(String number,String company);



}
