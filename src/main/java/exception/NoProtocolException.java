package exception;

/**
 * @author Igor Hnes on 8/31/17.
 */
public class NoProtocolException extends Exception {

    @Override
    public void printStackTrace() {
        System.err.println("No protocol");
    }
}
