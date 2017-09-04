package io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 * @author Igor Hnes on 9/4/17.
 */
public class UserWriterImpl implements UserWriter {

    private static final String filePath = "src/main/resources/users.txt";

    @Override
    public void save(List<User> users) throws IOException {

        final BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true));

        int userIndex = 1;
        for (User user : users) {
            writer.write("User number: "
                    + userIndex
                    + "\n"
                    + "username: "
                    + user.getName()
                    + "\n"
                    + "age: "
                    + user.getAge()
                    + "\n"
                    + "hobby: "
                    + user.getHobby()
                    + "\n"
                    + "\n");
            userIndex++;
        }
        writer.flush();
        writer.close();
    }
}
