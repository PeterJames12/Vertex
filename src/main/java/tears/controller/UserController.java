package tears.controller;

import tears.model.User;
import tears.service.UserService;
import tears.service.factory.ServiceFactory;
import tears.service.impl.UserServiceImpl;

import java.util.Iterator;
import java.util.List;

/**
 * @author Igor Hnes on 8/17/17.
 */
public class UserController {

    public static void main(String[] args) {
        final List<User> users = ServiceFactory.getUserService().getUsers();

//        for (User: users) {
//            System.out.println(users);
//        }
        Iterator<User> iterator = users.iterator();
        System.out.println(users);
        if (iterator.hasNext()) {
            System.out.println(iterator.next().getName() + iterator.next().getId());

        }




    }
}
