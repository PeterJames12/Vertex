package tears.controller;

import tears.service.UserService;
import tears.service.impl.UserServiceImpl;

/**
 * @author Igor Hnes on 8/17/17.
 */
public class UserController {

    public static void main(String[] args) {

        UserService userService =   new UserServiceImpl();
        userService.getUsers();

    }
}
