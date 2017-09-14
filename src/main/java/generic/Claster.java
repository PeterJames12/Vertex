package generic;

import generic.model.Wrong;
import generic.service.CrudService;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Igor Hnes on 9/14/17.
 */
@Getter
@Setter
public class Claster<T> {

    private T type;
}
