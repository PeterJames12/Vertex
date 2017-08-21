package tears.service.impl;

import tears.dao.UserDao;
import tears.dao.impl.UserDaoImpl;

public class UserAcceptanceOfFeedback {

    public static void acceptanceOfFeedback(Long id){
        UserDao userDao= new UserDaoImpl();
        System.out.println("The feedback was accepted from user: "+userDao.getById(id));
    }
}
