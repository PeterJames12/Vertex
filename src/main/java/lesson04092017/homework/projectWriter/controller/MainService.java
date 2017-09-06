package lesson04092017.homework.projectWriter.controller;

import lesson04092017.homework.projectWriter.model.Project;
import lesson04092017.homework.projectWriter.model.User;
import lesson04092017.homework.projectWriter.service.Impl.ProjectPrinterImpl;
import lesson04092017.homework.projectWriter.service.Impl.ProjectWriterImpl;
import lesson04092017.homework.projectWriter.service.Impl.UserPrinterImpl;
import lesson04092017.homework.projectWriter.service.Impl.UserWriterImpl;
import lesson04092017.homework.projectWriter.service.ProjectPrinter;
import lesson04092017.homework.projectWriter.service.ProjectWriter;
import lesson04092017.homework.projectWriter.service.UserPrinter;
import lesson04092017.homework.projectWriter.service.UserWriter;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by qw-user on 06.09.2017.
 */
public class MainService {

    public static void main(String[] args) throws IOException {

        UserWriter userWriter = new UserWriterImpl();

        User user = new User("Bob");
        User user1 = new User("Vanya");
        User user2 = new User("Alex");

        List<User> users = new LinkedList<>();
        users.add(user);
        users.add(user1);
        users.add(user2);

        userWriter.save(users);

        ProjectWriter projectWriter = new ProjectWriterImpl();

        Project project = new Project("Atomic Bombs");
        Project project1 = new Project("Bin bang Outdoors");

        List<Project> projects = new LinkedList<>();
        projects.add(project);
        projects.add(project1);

        projectWriter.save(projects);


        UserPrinter userPrinter = new UserPrinterImpl();
        userPrinter.print(users);

        ProjectPrinter projectPrinter = new ProjectPrinterImpl();
        projectPrinter.print(projects);
    }

}
