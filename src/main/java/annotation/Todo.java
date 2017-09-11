package annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * @author Igor Hnes on 9/7/17.
 */
@Target(ElementType.METHOD)
public @interface Todo {

    String reason() default "f45";
}
