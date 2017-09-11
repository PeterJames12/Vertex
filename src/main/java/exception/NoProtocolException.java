package exception;

/**
 * @author Vladimir on 8/31/2017.
 */
public class NoProtocolException extends Exception{

    @Override
    public void printStackTrace(){
        System.err.println("No protocol!");
    }
}
