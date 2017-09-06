package lesson04092017.homework.projectWriter.service.Impl;

import lesson04092017.homework.projectWriter.model.Project;
import lesson04092017.homework.projectWriter.service.ProjectWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 * Created by qw-user on 06.09.2017.
 */
public class ProjectWriterImpl implements ProjectWriter {

    @Override
    public void save(List<Project> projects) throws IOException {

        String filepath = "src/main/resources/Project.txt";
        final BufferedWriter writer1 = new BufferedWriter(new FileWriter(filepath,true ));

        int projectIndex = 1;
        for (Project project : projects) {
            writer1.write("Project number: "
                    + projectIndex
                    +"\n"
                    + project.getTitle()
                    +"\n"
                    +"\n"
            );
            projectIndex++;
        }
        writer1.flush();
        writer1.close();
    }
}
