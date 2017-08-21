package type;

/**
 * @author Igor Hnes on 8/21/17.
 */
public class CarService {

    public static Car getCar(CarType carType) {

        switch (carType) {
            case HONDA:
                return new Honda();
            case MAZDA:
                return new Mazda();
            default:
                return null;
        }
    }
}
