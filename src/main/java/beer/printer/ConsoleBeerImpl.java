package beer.printer;

/**
 * @author Igor Hnes on 9/4/17.
 */
public class ConsoleBeerImpl implements PrinterBeer {

    @Override
    public void print(String text) {
        System.out.println(text);
    }
}
