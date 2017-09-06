package lesson04092017.homework.projectWriter.service.Impl;


import lesson04092017.homework.projectWriter.model.User;
import lesson04092017.homework.projectWriter.service.UserWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 * Created by qw-user on 06.09.2017.
 */
public class UserWriterImpl implements UserWriter {
    @Override
    public void save(List<User> users) throws IOException {
        String filePath = "src/main/resources/user.txt";
        final BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true));

        int userIndex = 1;
        for (User user : users) {
                writer.write("User number: "
                        + userIndex
                        + "\n"
                        + user.getName()
                        + "\n"
                        + "\n"
                );
                userIndex++;
            }
            writer.close();
        }
    }

