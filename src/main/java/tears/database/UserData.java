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
        user.setId(1);
        user.setName("Alex");
        user.setSurname("Smit");
        user.setEmail("joyukr@ukr.net");
        user.setAge(22);

        final User alex = new User();
        alex.setId(1);
        alex.setName("Alex");
        alex.setSurname("Smit");
        alex.setEmail("joyukr@ukr.net");
        alex.setAge(22);

        final User smit = new User();
        smit.setId(1);
        smit.setName("Alex");
        smit.setSurname("Smit");
        smit.setEmail("joyukr@ukr.net");
        smit.setAge(22);

        final User bob = new User();
        bob.setId(1);
        bob.setName("Alex");
        bob.setSurname("Smit");
        bob.setEmail("joyukr@ukr.net");
        bob.setAge(22);

        List<User> usersList = new ArrayList<>();
        usersList.add(user);
        usersList.add(alex);
        usersList.add(bob);
        usersList.add(smit);
        return usersList;
    }
}
