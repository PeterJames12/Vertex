package annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author Igor Hnes on 9/7/17.
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface RemindMe {

    String reason() default "just";

    String where() default "here";
}

