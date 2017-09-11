package tears.dao.impl;

import tears.dao.UserDao;
import tears.database.UserData;
import tears.model.User;

import java.util.List;

/**
 * @author Igor Hnes on 8/17/17.
 */
public class UserDaoImpl implements UserDao {


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
        final User user = new User();
        user.setName("Alex");
        return user;
    }

    @Override
    public User getUserByEmail(String email) {
        return null;
    }
}
