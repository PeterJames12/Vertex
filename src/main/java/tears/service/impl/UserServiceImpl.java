package tears.service.impl;

import tears.dao.UserDao;
import tears.model.User;
import tears.service.UserService;

/**
 * Implementation
 *
 * @author Igor Hnes on 8/17/17.
 */
public class UserServiceImpl implements UserService {

    private UserDao userDao;
    private EmailServiceImpl emailServiceImpl;

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

    @Override
    public User getById(Long id) {
        return userDao.getById(id);
    }

    @Override
    public String changePassword() {
        emailServiceImpl = new EmailServiceImpl();
        String message = emailServiceImpl.sendMessage();
        return message;

    }


}