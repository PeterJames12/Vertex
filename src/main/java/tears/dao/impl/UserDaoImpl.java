package tears.dao.impl;

import tears.dao.UserDao;
import tears.database.UserData;
import tears.model.User;

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
    public User getUser() {
        return null;
    }

    /**
     * {@inheritDoc}.
     */
    @Override
    public User[] getUsers() {
        return UserData.getUsers();
    }

    /**
     * {@inheritDoc}.
     */
    @Override
    public User getById(Long id) {
        final User user = new User();
        user.setName("Alex");
        return user;
    }
}
