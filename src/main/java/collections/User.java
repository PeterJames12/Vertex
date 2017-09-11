package collections;

/**
 * @author Vladimir on 8/28/2017.
 */
public class User {
    String name;
    int age;
    static int ageCount = 30;

    public User(String name) {
        this.name = name;
        age = ageCount;
        ageCount += 2;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}