package tears.service.impl;

import tears.dao.UserDao;
import tears.dao.impl.UserDaoImpl;
import tears.model.User;

public class UserSendEmailService {

    public static void sendEmail(Long id){
        UserDao userDao = new UserDaoImpl();
        System.out.println("Email was send to user: "+userDao.getById(id));
    }
}
