package tears.controller;

import tears.model.User;
import tears.service.UserService;
import tears.service.factory.ServiceFactory;

import java.util.List;

/**
 * @author Igor Hnes on 8/17/17.
 */
public class UserController {

    public static void main(String[] args) {

        final UserService userService = ServiceFactory.getUserService();
        final List<User> users = userService.getUsers();

        for (User user : users) {
            System.out.println(user.getName());
        }


    }
}
