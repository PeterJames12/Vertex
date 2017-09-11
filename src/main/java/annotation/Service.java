package annotation;

import annotation.annotations.*;
import lombok.Setter;

import java.lang.reflect.Method;

/**
 * @author Vladimir on 9/7/2017.
 */
@Setter
public class Service {

    public static void main(String[] args) throws NoSuchMethodException {
//        final Service service = new Service();
//
//        service.print();
//
//        try {
//            cTime();
//            ref();
//        } catch (Exception e){
//            e.printStackTrace();
//        }

        final FunctionalInterface functionalInterface = () -> System.out.println("I'm functional interface!");

        functionalInterface.print();
    }

    @RemindMe
    @AllowPrint
    public void print() throws NoSuchMethodException {
        final Class<? extends Service> aClass = getClass();
        final Method method = aClass.getMethod("print");

        if (!method.isAnnotationPresent(AllowPrint.class)) {
            throw new CannotAllowPrintException();
        }

        System.out.println(method.getName());
//        final Class<? extends Service> claSS = getClass();
//        final Method print = claSS.getMethod("print");
//
//        System.out.println(print.isAnnotationPresent(RemindMe.class));
    }

    @CodingTime
    public static void cTime() throws NoSuchMethodException {
        final Method method = Service.class.getMethod("cTime");

        if (!method.isAnnotationPresent(AllowPrint.class)) {
            throw new CannotAllowPrintException();
        }

        System.out.println(method.getName());

//        final Class<? extends Service> aClass = Service.class;
//        final Method cTime = aClass.getMethod("cTime");
//
//        if (cTime.isAnnotationPresent(CodingTime.class)){
//            System.out.println("An annotation is present in cTime method.");
//            return;
//        }
//        System.out.println("An annotation is absent in cTime method.");
    }

    @Reference
    @Default
    public static void ref() throws NoSuchMethodException {
        final Method method = Service.class.getMethod("ref");

        if (!method.isAnnotationPresent(AllowPrint.class)) {
            throw new CannotAllowPrintException();
        }

        System.out.println(method.getName());

//        final Class<? extends Service> aClass = Service.class;
//        final Method ref = aClass.getMethod("ref");
//
//        final Annotation[] annotations = aClass.getAnnotations();
//
//        System.out.println(aClass.getAnnotation(Default.class).defSpace());
//
//        if (ref.isAnnotationPresent(Reference.class)){
//            System.out.println("An annotation is present. in ref method");
//            System.out.println(Arrays.toString(annotations));
//            return;
//        }
//        System.out.println("An annotation is absent in ref method.");
    }
}

