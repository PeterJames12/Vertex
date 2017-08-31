package tears.model;

/**
 * @author Igor Hnes on 8/17/17.
 */
public class User extends AbstractEntity {

    private String name;
    private String surname;
    private int age;

    public String getName(String bob) {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge(int i) {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
