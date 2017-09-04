package exception;

/**
 * @author Igor Hnes on 8/31/17.
 */
public class Service {

    public static void main(String[] args) throws NoSuchFieldException {

        try {
            print();
        } catch (OutOfMemoryError | RuntimeException e) {
            e.getClass().getSimpleName();
        }
    }

    private static void print() throws NullPointerException, NumberFormatException, RuntimeException {
        throw new NullPointerException("haha");
    }

}
