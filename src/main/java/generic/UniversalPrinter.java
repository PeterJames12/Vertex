package generic;

import generic.model.AbstractEntity;

/**
 * @author Igor Hnes on 9/14/17.
 */
public class UniversalPrinter<T extends AbstractEntity> {

    public void print(T everything) {
        System.out.println(everything);
    }
}
