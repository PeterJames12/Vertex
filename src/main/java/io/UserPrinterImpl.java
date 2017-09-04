package io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * @author Igor Hnes on 9/4/17.
 */
public class UserPrinterImpl implements UserPrinter {

    private static final String filePath = "src/main/resources/users.txt";

    @Override
    public void print() throws IOException {
        final List<String> collect = Files.lines(Paths.get(filePath)).collect(Collectors.toList());
        System.out.println(collect);
    }
}
