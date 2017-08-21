package tears.dao.impl;

import tears.dao.UserDao;
import tears.database.UserData;
import tears.model.User;

import java.util.List;

/**
 * Implementation of {@link UserDao} interface.
 *
 * @author Igor Hnes on 8/17/17.
 */
public class UserDaoImpl implements UserDao {

    /**
     * {@inheritDoc}.
     */
    @Override
    public User getUserByEmail(String email) {
        final List<User> users = UserData.getUsers();

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
    public User[] getUsers() {
        return null;
    }

    /**
     * {@inheritDoc}.
     */
    @Override
    public User getUserById(Long id) {
        return null;
    }

    @Override
    public User update(User user) {
        return null;
    }
}
