package exception;

/**
 * @author Vladimir on 8/31/2017.
 */
public class SiteNotFoundException extends Exception {
    @Override
    public void printStackTrace(){
        System.err.println("Error 404!");
    }
}
