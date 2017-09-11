package io;

import java.io.FileReader;
import java.io.IOException;
import java.io.StreamTokenizer;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Vladimir on 9/4/2017.
 */
public class pract {
    void wordCount() throws IOException {
        String filePath = "src/main/resources/file.txt";

        final FileReader fileReader = new FileReader(filePath);
        final StreamTokenizer streamTokenizer = new StreamTokenizer(fileReader);

        Set<String> set = new HashSet<>();

        while (streamTokenizer.nextToken() != StreamTokenizer.TT_EOF){
            if (streamTokenizer.sval != null){
                set.add(streamTokenizer.sval);
            }
        }

        System.out.println(set);
    }
}
