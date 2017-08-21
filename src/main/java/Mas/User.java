package Mas;

/**
 * @author Viktor Bilko on 21.08.2017.
 */
public class User {

    private String name;
    private String surname;
    private int age;

    public String getName() {
        return name;
    }


    /**
     * {@inheritDoc}
     */
    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
