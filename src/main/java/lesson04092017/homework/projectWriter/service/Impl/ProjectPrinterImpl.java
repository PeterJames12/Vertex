package lesson04092017.homework.projectWriter.service.Impl;

import lesson04092017.homework.projectWriter.model.Project;
import lesson04092017.homework.projectWriter.service.ProjectPrinter;
import java.io.*;
import java.util.List;


/**
 * Created by qw-user on 06.09.2017.
 */
public class ProjectPrinterImpl implements ProjectPrinter {

    @Override
    public void print(List<Project> projects) throws IOException {
        String filePath = "src/main/resources/Project.txt";
        final File file = new File(filePath);

        final BufferedReader reader = new BufferedReader(new FileReader(file));

        String buff;

        while ((buff = reader.readLine()) != null) {
            System.out.println(buff);
        }
        reader.close();
    }
}
