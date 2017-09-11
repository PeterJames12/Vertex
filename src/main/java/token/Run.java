package token;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.StreamTokenizer;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Igor Hnes on 9/4/17.
 */
public class Run {

    private static final String file = "src/main/resources/beer.txt";

    public static void main(String[] args) throws IOException {

        final FileReader fileReader = new FileReader(file);
        final StreamTokenizer tokenizer = new StreamTokenizer(fileReader);

        Set<String> set = new HashSet<>();

        while (tokenizer.nextToken() != StreamTokenizer.TT_EOF) {
            if (tokenizer.sval != null) {
                set.add(tokenizer.sval);
            }
        }

        System.out.println(set);
    }
}
