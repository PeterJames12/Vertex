package tears.service.impl;

import tears.dao.UserDao;
import tears.dao.factory.DaoFactory;
import tears.model.User;
import tears.service.EmailService;
import tears.service.UserService;

import java.util.List;

/**
 * Implementation
 *
 * @author Igor Hnes on 8/17/17.
 */
public class UserServiceImpl implements UserService {

    private UserDao userDao;
    private EmailService emailService;


    /**
     * {@inheritDoc}.
     */
    @Override
    public User getUser() {
        return null;
    }

    @Override
    public User getUserByEmail(String email) {
        final UserDao userDao = DaoFactory.getUserDao();
        return userDao.getUserByEmail(email);
    }

    /**
     * {@inheritDoc}.
     */
    @Override
    public List<User> getUsers() {
        return DaoFactory.getUserDao().getUsers();
    }




    @Override
    public User getById(Long id) {
        return userDao.getById(id);
    }

    /**
     * {@inheritDoc}.
     */
    @Override
    public void changePassword(User user) {
        User userByEmail = userDao.getUserByEmail(user.getEmail());
        userByEmail.setPassword("12345");
        userDao.update(user);
        emailService.send(user);

    }
}
