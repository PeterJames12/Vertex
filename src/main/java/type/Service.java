package type;

import java.util.Arrays;

/**
 * @author Igor Hnes on 8/21/17.
 */
public class Service {

    public static void main(String[] args) {


        final Car car = CarService.getCar(CarType.HONDA);
        car.drive();

    }
}
