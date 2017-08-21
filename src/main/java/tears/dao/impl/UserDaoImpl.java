package tears.dao.impl;

import tears.dao.UserDao;
import tears.database.UserData;
import tears.model.User;

/**
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

    @Override
    public User changePassword() {
        return UserData.getPassword();
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
