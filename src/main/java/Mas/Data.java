package Mas;

/**
 * @author Viktor Bilko on 21.08.2017.
 */
public class Data {

    public static void main(String[] args) {

        User [] users = new User[2];

        for (int i = 0; i < users.length; i++) {
            users[i] = new User();
            users[i].setName("Alex");
            users[i].setSurname("Smith");
            users[i].setAge(25);
        }

        Car[] cars = new Car[2];

        for (int i = 0; i < cars.length; i++) {
            cars[i] = new Car("BMW",320);
        }

        printUsers(users);
        printCars(cars);
    }

    private static void printCars(Car[] cars) {
        for (Car car : cars) {
            System.out.println(car.getModel() + car.getSpeed());
        }
    }

    private static void printUsers(User[] users) {
        for (User user : users) {
            System.out.println(user.getName() + user.getSurname() + user.getAge());
        }
    }
}
