package tears.service.impl;

import tears.dao.UserDao;
import tears.model.User;
import tears.service.UserService;

/**
 * Implementation of {@link UserService} interface.
 *
 * @author Igor Hnes on 8/17/17.
 */
public class UserServiceImpl implements UserService {

    private UserDao userDao;

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
        return userDao.getUsers();
    }


    /**
     * {@inheritDoc}.
     */
    @Override
    public User getById(Long id) {
        return userDao.getById(id);
    }
}
