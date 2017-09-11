package tears.service.factory;

import tears.service.EmailService;
import tears.service.UserService;
import tears.service.impl.EmailServiceImpl;
import tears.service.impl.UserServiceImpl;

/**
 * Created by qw-user on 31.08.2017.
 */
public class ServiceFactory {

    /**
     * @return instance of {@link UserService}
     */
    public static UserService getUserService() {
        return new UserServiceImpl();
    }

    /**
     * @return instance of {@link EmailService}
     */
    public static EmailService getEmailService() {
        return new EmailServiceImpl();
    }

}
