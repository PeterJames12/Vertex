package io;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

/**
 * @author Igor Hnes on 9/4/17.
 */
public class Replacel {

    public static void main(String[] args) throws IOException {

        UserWriter userWriter = new UserWriterImpl();

        User user =
                new User("Igor", 22, "Running");

        List<User> users = new LinkedList<>();
        users.add(user);
        users.add(user);
        users.add(user);
        users.add(user);
        users.add(user);

        userWriter.save(users);
    }
}
