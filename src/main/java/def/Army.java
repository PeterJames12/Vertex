package def;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 * @author Vladimir on 8/28/2017.
 */
public interface Army {

    void run();

    void march();

    void onDuty();

    default void goHome() {
        throw  new NotImplementedException();
    }
}
