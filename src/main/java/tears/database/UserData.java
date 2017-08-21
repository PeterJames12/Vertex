package tears.database;

import tears.model.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Imitation database for {@link User} entity.
 *
 * @author Igor Hnes on 8/17/17.
 */
public class UserData {

    public static List<User> getUsers() {

        final User user = new User();
        user.setName("Alex");
        user.setSurname("Smit");
        user.setEmail("joyukr@ukr.net");
        user.setAge(22);

        List<User> usersList = new ArrayList<>();
        usersList.add(user);
        return usersList;
    }
}
