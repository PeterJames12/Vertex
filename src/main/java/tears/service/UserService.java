package tears.service;

import tears.model.User;

import java.util.List;

/**
 * @author Igor Hnes on 8/17/17.
 */
public interface UserService {
    /**
     * @return user.
     */
    User getUser();

    /**
     * @return user.
     */
    User getUserByEmail(String email);

    /**
     * @return list of users.
     */
    List<User> getUsers();

    /**
     * @param id is user's id.
     * @return {@link User} entity by given id.
     */
    User getById(Long id);

    /**
     * Change password.
     */
    void changePassword(User user);
}
