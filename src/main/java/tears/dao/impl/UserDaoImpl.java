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

    public static void main(String[] args) {

        final UserDaoImpl userDao = new UserDaoImpl();
        final User userByEmail = userDao.getUserByEmail("");
        System.out.println(userByEmail.getAge());
    }

    /**
     * {@inheritDoc}.
     */
    @Override
    public User getUserByEmail(String name) {
        final List<User> users = UserData.getUsers();

        for (User user : users) {
            System.out.println(user.getAge());
            if (user.getName().equals(name)) {
                return user;
            }
        }
        return null;
    }

    /**
     * {@inheritDoc}.
     */
    @Override
    public List<User> getUsers() {
        //"select * from users"
        return UserData.getUsers();
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
