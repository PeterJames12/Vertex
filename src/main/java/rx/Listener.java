package rx;

import io.reactivex.Notification;
import io.reactivex.Observable;

import java.util.concurrent.TimeUnit;

/**
 * @author Igor Hnes on 8/20/17.
 */
public class Listener {

    public static void main(String[] args) throws InterruptedException {


        final Observable<String> list = Observable.just("Hello", "hello", "Beer");

        list.map(String::length).subscribe(System.out::println);

        final Observable<Long> interval = Observable.interval(1, TimeUnit.SECONDS);

        interval.subscribe(System.out::println);

        Thread.sleep(5000);


        list.doOnEach(Notification::getValue);
    }
}
