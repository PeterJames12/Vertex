package beer.printer;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * @author Igor Hnes on 9/4/17.
 */
public class FilePrinter implements PrinterBeer {

    private static final String file = "src/main/resources/beer.txt";

    @Override
    public void print(String text) {
        try {
            Files.write(Paths.get(file), text.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
