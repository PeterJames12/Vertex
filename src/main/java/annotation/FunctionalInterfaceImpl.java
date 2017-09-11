package annotation;

/**
 * @author Vladimir on 9/7/2017.
 */
public class FunctionalInterfaceImpl implements FunctionalInterface{
    @Override
    public void print() {
        System.out.println("I'm functional interface");
    }
}
