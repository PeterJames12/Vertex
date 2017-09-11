package tears.database;

import tears.model.User;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Igor Hnes on 8/17/17.
 */
public class UserData {

    static List <User> users = new LinkedList<>();

    public static List<User> getUsers() {
        return users;
    }

    public static void addUser(User user){
        users.add(user);
    }

    public static void removeUser(User user){
        users.remove(user);
    }
}
