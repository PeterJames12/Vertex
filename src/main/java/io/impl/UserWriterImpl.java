package io.impl;

import io.User;
import io.UserWriter;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Vladimir on 9/4/2017.
 */
public class UserWriterImpl implements UserWriter{
    @Override
    public void saveToFile(List<User> users) throws IOException{
        String filePath = "src/main/resources/file.txt";
        final File file = new File(filePath);

        final BufferedWriter writer = new BufferedWriter(new FileWriter(file));

        for (int i = 0; i < users.size(); i++) {
            writer.write("User number: " + users.get(i).getUserNumber() + "\n");
            writer.write("User's name: " + users.get(i).getName() + "\n");
            writer.write("User's hobby: " + users.get(i).getHobby() + "\n");
            writer.write("User's age: " + users.get(i).getAge() + "\n\n");
            writer.flush();
        }

        writer.close();
    }
}
