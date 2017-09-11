package lessons;

/**
 * @author Igor Hnes on 9/7/17.
 */
public class Service {

    public static void main(String[] args) {

        final Car car = new Car();
        car.setName("HONDA");
        car.setSpeed(100);
        car.color = Car.Color.RED;

        final Car.Main main = car.new Main();
        main.print();
    }
}
