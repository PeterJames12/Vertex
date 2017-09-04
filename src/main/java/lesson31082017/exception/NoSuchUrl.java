package lesson31082017.exception;

/**
 * Created by qw-user on 31.08.2017.
 */
public class NoSuchUrl extends Exception {

    @Override
    public void printStackTrace() {
        System.err.println("Url doesn't exist");
    }
}
