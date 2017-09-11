package beer;

import beer.printer.FilePrinter;
import beer.printer.PrinterBeer;
import beer.printer.ConsoleBeerImpl;
import beer.reader.ReaderBeer;
import beer.reader.ReaderBeerImpl;
import beer.replacer.ReplaceBeer;
import beer.replacer.ReplaceBeerImpl;

/**
 * @author Igor Hnes on 9/4/17.
 */
public class BeerService {

    public static void main(String[] args) {

        ReaderBeer readerBeer = new ReaderBeerImpl();
        final String beerBefore = readerBeer.read();

        ReplaceBeer replaceBeer = new ReplaceBeerImpl();
        final String replacedBeer = replaceBeer.replace(beerBefore, "Go a head");

        PrinterBeer printerBeer = new ConsoleBeerImpl();
        PrinterBeer filePrinterBeer = new FilePrinter();

        filePrinterBeer.print(replacedBeer);

        printerBeer.print(replacedBeer);
    }
}
