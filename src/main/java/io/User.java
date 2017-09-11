package io;

/**
 * @author Vladimir on 9/4/2017.
 */
public class User {
    private static int count = 1;
    private int userNumber;
    private String name;
    private String hobby;
    private int age;

    public User(String name, String hobby, int age) {
        this.name = name;
        this.hobby = hobby;
        this.age = age;
        userNumber = count;
        count++;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        User.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getUserNumber() {
        return userNumber;
    }

    public void setUserNumber(int userNumber) {
        this.userNumber = userNumber;
    }
}
