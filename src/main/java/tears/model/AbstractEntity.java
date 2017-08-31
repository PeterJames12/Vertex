package tears.model;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author Igor Hnes on 8/28/17.
 */
public abstract class AbstractEntity {

    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
