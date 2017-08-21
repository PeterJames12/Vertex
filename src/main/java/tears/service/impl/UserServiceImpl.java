package tears.service.impl;

import tears.dao.UserDao;
import tears.model.User;
import tears.service.EmailService;
import tears.service.UserService;

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

    @Override
    public EmailService changePassword() {
        EmailServiceImpl emailServiceImpl = new EmailServiceImpl();
        emailService.sendMessage();
        return emailService;
    }


}