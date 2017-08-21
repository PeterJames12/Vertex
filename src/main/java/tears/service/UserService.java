package tears.service;

import tears.model.User;

/**
 * @author Igor Hnes on 8/17/17.
 */
public interface UserService {


    /**
     * @return user.
     */
    User getUser();

    /**
     * @return list of users.
     */
    User[] getUsers();

    /**
     * @param id is user's id.
     * @return {@link User} entity by given id.
     */
    User getById(Long id);


/*
* notify that email was send to {@link User} entity by given id.
*/
    void sendEmail(Long id);

    /*
* notify that feedback was accepted from user: {@link User}
*/
    void acceptanceOfFeedback(Long id);

    /**
     * @return order.
     */

     String orderingGood(Long id,int order);
}
