package tears.model;

/**
 * @author Igor Hnes on 8/17/17.
 */
public class User extends AbstractEntity{

    private String name;
    private String surname;
    private int age;
    private String email;
    private String password;

    public User() {
    }

    public User(int userId, String name, String surname, int age, String email, String password) {
        this.setId(userId);
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.email = email;
        this.password = password;
    }

    public String getEmail() { return email; }

    public void setEmail(String email) { this.email = email; }

    public String getName() {
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
