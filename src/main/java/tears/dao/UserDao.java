package tears.dao;

import tears.model.User;

import java.util.List;

/**
 * @author Igor Hnes on 8/17/17.
 */
public interface UserDao {


    User getUserByEmail(String email);

    /**
     * @return user.
     */
    User getUser();

    /**
     * @return list of users.
     */
    List<User> getUsers();

    /**
     * @param id is user's id.
     * @return {@link User} entity by given id.
     */
    User getById(Long id);

    User update(User user);
}

