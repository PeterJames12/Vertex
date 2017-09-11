package lessons;

/**
 * @author Igor Hnes on 9/7/17.
 */
public class Car {

    private String name;
    private int speed;
    Color color;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public enum Color {

        RED,
        YELLOW,
        GREEN
    }

    public class Main {

        public void print() {
            System.out.println("Hello");
        }
    }
}
