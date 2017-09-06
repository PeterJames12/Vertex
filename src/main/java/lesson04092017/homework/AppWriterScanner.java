package lesson04092017.homework;

import java.io.*;
import java.util.Scanner;

/**
 * Created by qw-user on 06.09.2017.
 */
public class AppWriterScanner {

    public static void main(String[] args) throws IOException {
        final Scanner scan = new Scanner(System.in);

        String filepath = "src\\main\\resources\\CarsAndPeople.txt";

        final File file = new File(filepath);

        BufferedWriter writer = new BufferedWriter(new FileWriter(file));
        System.out.println("Введите текст, который вы хотите сохранить: ");
        String s = scan.nextLine();
        writer.write(s);
        writer.flush();
        scan.close();
        writer.close();


        BufferedReader reader = new BufferedReader(new FileReader(file));
        String buff;
        while ((buff = reader.readLine())!= null) {
            System.out.println("В вашем файле находится такой текст: " + " " + buff);
        }
        reader.close();
    }
}
