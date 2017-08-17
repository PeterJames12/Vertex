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
}
