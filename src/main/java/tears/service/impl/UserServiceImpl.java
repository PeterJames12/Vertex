package tears.service.impl;

import tears.dao.UserDao;
import tears.model.User;
import tears.service.EmailService;
import tears.service.UserService;
import tears.service.impl.email.EmailServiceImpl;

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
    public User getUserByEmail(String email) {
        return userDao.getUserByEmail(email);
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
        return userDao.getUserById(id);
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
