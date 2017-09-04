package lesson31082017.exception;

/**
 * Created by qw-user on 31.08.2017.
 */
public class NoProtocolException extends Exception {
    @Override
    public void printStackTrace() {
        System.err.println("No protocol");

    }
}
