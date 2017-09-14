package refrection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @author Igor Hnes on 9/11/17.
 */
public class Hack {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {

        final Hack hack = new Hack();
        hack.hack();
    }

    private void hack() throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {

        final Ann ann = new Ann();

        final Class<? extends Ann> clazz = ann.getClass();

        final Method method = clazz.getDeclaredMethod("getAnnName");
        method.setAccessible(true);
        final Object invoke = method.invoke(ann);
        String name;
        if (invoke instanceof String) {
            name = (String) invoke;
        } else {
            name = "unknown";
        }
        System.out.println(name);
    }
}
