package annotation;

/**
 * @author Vladimir on 9/7/2017.
*/
public class CannotAllowPrintException extends RuntimeException{

    @Override
    public void printStackTrace(){
        System.err.println("Cannot allow print!");
    }
}
