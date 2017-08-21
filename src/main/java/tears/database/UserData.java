package tears.database;

import tears.model.User;

/**
 * @author Igor Hnes on 8/17/17.
 */
public class UserData {

    public static User[] getUsers() {
        final User user = new User();
        user.setName("Alex");

        User[] users = new User[1];
        users[0] = user;

        return users;
    }

    public static User getPassword() {
        final User user= new User();
        user.setName("Bob");
        user.setPassword("1111");
        user.setEmail("bob@gmail.com");


        return user;
    }
}
