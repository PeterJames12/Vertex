package tears.database;

import lombok.val;
import tears.model.User;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Igor Hnes on 8/17/17.
 */
public class UserData {

    public static List<User> getUsers() {

        val user = new User();
        user.setName("Alex");
        user.setSurname("Smit");
        user.setEmail("joyukr@ukr.net");
        user.setAge(22);
        val user1 = new User();
        user.setName("Bob");
        user.setSurname("Valis");
        user.setEmail("alex@ukr.net");
        user.setAge(22);
        val user2 = new User();
        user.setName("Ivan");
        user.setSurname("Rozov");
        user.setEmail("google@ukr.net");
        user.setAge(22);
        val user3 = new User();
        user.setName("Sasha");
        user.setSurname("Tores");
        user.setEmail("kirsten@ukr.net");
        user.setAge(22);



        List<User> usersList = new ArrayList<>();
        usersList.add(user);
        return usersList;
    }
}
