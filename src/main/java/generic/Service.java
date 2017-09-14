package generic;

import generic.model.Iphone;
import generic.model.Mac;
import generic.model.Wrong;

/**
 * @author Igor Hnes on 9/14/17.
 */
public class Service {

    public static void main(String[] args) {
//
//        final Claster<Wine> claster = new Claster<>();
//        final Wine wine = new Wine();
//
//        claster.setType(wine);
//
//        final Wine type = claster.getType();

        final UniversalPrinter<Iphone> printer = new UniversalPrinter<>();

        printer.print(new Iphone());
    }
}
