package lesson04092017.homework.projectWriter.service;

import lesson04092017.homework.projectWriter.model.Project;

import java.io.IOException;
import java.util.List;

/**
 * Created by qw-user on 06.09.2017.
 */
public interface ProjectWriter {

    void save(List<Project> projects) throws IOException;
}
