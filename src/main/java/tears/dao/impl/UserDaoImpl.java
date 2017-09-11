package tears.dao.impl;

import lombok.val;
import tears.dao.UserDao;
import tears.database.UserData;
import tears.model.User;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Igor Hnes on 8/17/17.
 */
public class UserDaoImpl implements UserDao {

    /**
     * {@inheritDoc}.
     */
    @Override
    public User getUserByEmail(String email) {
        val users = UserData.getUsers();

        for (User user : users) {
            if (user.getEmail().equals(email)) {
                return user;
            }
        }
        return null;
    }

    /**
     * {@inheritDoc}.
     */
    @Override
    public User getUser() {
        return null;
    }

    /**
     * {@inheritDoc}.
     */
    @Override
    public List<User> getUsers() {
        return UserData.getUsers();
    }

    /**
     * {@inheritDoc}.
     */
    @Override
    public User getById(Long id) {
        List<User> users = new ArrayList<>();

        for (User user : users) {
            if (user.equals(id)) {
                System.out.println(user);
            }else System.out.println("ERROR");
        }
        return null;
    }

    @Override
    public User update(User user) {
        return null;
    }
}
