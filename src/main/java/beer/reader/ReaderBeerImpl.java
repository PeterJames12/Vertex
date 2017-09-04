package beer.reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Igor Hnes on 9/4/17.
 */
public class ReaderBeerImpl implements ReaderBeer {

    private static final String file = "src/main/resources/beer.txt";

    @Override
    public String read() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            return reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
