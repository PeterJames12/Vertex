package io.impl;

import io.UserReader;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Vladimir on 9/4/2017.
 */
public class UserReaderImpl implements UserReader{

    private final String filePath = "src/main/resources/file.txt";

    @Override
    public void read() throws IOException{
        final List<String> collect = Files.lines(Paths.get(filePath)).collect(Collectors.toList());
        System.out.println(collect);
    }
}
