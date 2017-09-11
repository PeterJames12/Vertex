package tears.service.impl;

import lombok.val;
import tears.dao.UserDao;
import tears.dao.factory.DaoFactory;
import tears.model.User;
import tears.service.EmailService;
import tears.service.UserService;
import tears.service.impl.email.EmailServiceImpl;

import java.util.List;

/**
 * @author Igor Hnes on 8/17/17.
 */
public class UserServiceImpl implements UserService {

    /**
     * {@inheritDoc}.
     */
    @Override
    public User getUserByEmail(String email) {

        val userDao = DaoFactory.getUserDao();

        return userDao.getUserByEmail(email);
    }

    /**
     * {@inheritDoc}.
     */
    @Override
    public List<User> getUsers() {
        final UserDao userDao = DaoFactory.getUserDao();
        return userDao.getUsers();
    }

    /**
     * {@inheritDoc}.
     */
    @Override
    public User getById(Long id) {
        final UserDao userDao = DaoFactory.getUserDao();
        return userDao.getUserById(id);
    }

    /**
     * {@inheritDoc}.
     */
    @Override
    public void changePassword(User user) {

    }
}
