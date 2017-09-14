package refrection;

import annotation.Todo;
import lombok.Getter;
import lombok.ToString;

/**
 * @author Igor Hnes on 9/11/17.
 */
public class Ann extends Mommy {

    @Getter
    private int age = 25;

    @Todo
    private String getAnnName() {
        return "Yulia";
    }
}
