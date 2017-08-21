package tears.controller;

import tears.model.User;
import tears.service.UserService;

/**
 * @author Igor Hnes on 8/17/17.
 */
public class UserController {

    private static UserService userService;

    public static void main(String[] args) {

        final User user = new User();
        user.setName("Alex");
        user.setSurname("Smit");
        user.setEmail("joyukr@ukr.net");
        user.setAge(22);
        userService.changePassword(user);
    }
}
