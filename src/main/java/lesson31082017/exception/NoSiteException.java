package lesson31082017.exception;

/**
 * Created by qw-user on 31.08.2017.
 */
public class NoSiteException extends Exception {
    @Override
    public void printStackTrace() {
        System.out.println("Site doesn't exist");
    }
}
