package tears.dao;

import tears.model.User;

/**
 * @author Igor Hnes on 8/17/17.
 */
public interface UserDao {

    /**
     * @return user.
     */
    User getUserByEmail(String email);

    /**
     * @return list of users.
     */
    User[] getUsers();

    /**
     * @param id is user's id.
     * @return {@link User} entity by given id.
     */
    User getUserById(Long id);

    User update(User user);
}
