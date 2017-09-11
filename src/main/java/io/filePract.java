package io;

import io.impl.UserReaderImpl;
import io.impl.UserWriterImpl;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Vladimir on 9/4/2017.
 */
public class filePract {
    public static void main(String[] args) throws IOException{

        List<User> users = new LinkedList<>();
        User user1 = new User("Pasha", "Football", 19);
        users.add(user1);
        User user2 = new User("Vanya", "Running", 20);
        users.add(user2);
        User user3 = new User("Danya", "Cycling", 21);
        users.add(user3);

        UserWriter userWriter = new UserWriterImpl();

        userWriter.saveToFile(users);

        UserReader userReader = new UserReaderImpl();

        userReader.read();
    }

    public static void firstIn() throws IOException{
        String filePath = "src/main/resources/file/txt";
        final File file = new File(filePath);

        FileWriter writer = new FileWriter(file, true);

        writer.write("Welcome");
        writer.write("To Kiev");
        writer.write("\n");
        writer.flush();

        writer.close();
    }

    public static void firstOut() throws IOException{
        String filePath = "src/main/resources/file.txt";
        final File file = new File(filePath);

        FileReader reader = new FileReader(file);

        int buff;

        while ((buff = reader.read()) != -1) {
            System.out.print((char) buff);
        }
    }

    public static void secondIn() throws IOException{
        String filePath = "src/main/resources/file.txt";
        final File file = new File(filePath);

        final BufferedWriter writer = new BufferedWriter(new FileWriter(file));
        writer.write("fer");
        writer.flush();
        writer.close();
    }

    public static void secondOut() throws IOException{
        String filePath = "src/main/resources/file.txt";
        final File file = new File(filePath);

        final BufferedReader reader = new BufferedReader(new FileReader(file));

        String buff;
        while ((buff = reader.readLine()) != null) {
            System.out.println(buff);
        }
    }

    public static void thirdIn() throws IOException{
        String filePath = "src/main/resources/file.txt";

        List<String> list = new LinkedList<>();
        list.add("Hello");
        list.add("Welcome");

        Files.write(Paths.get(filePath), list);
    }

    public static void thirdOut() throws IOException{
        String filePath = "src/main/resources/file.txt";

        List<String> collect = Files
                .lines(Paths.get(filePath))
                .collect(Collectors.toList());

        System.out.println(collect);
    }
}

