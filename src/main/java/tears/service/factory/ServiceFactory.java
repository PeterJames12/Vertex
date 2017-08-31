package tears.service.factory;

import tears.service.EmailService;
import tears.service.UserService;
import tears.service.impl.UserServiceImpl;
import tears.service.impl.email.EmailServiceImpl;

/**
 * @author Igor Hnes on 8/31/17.
 */
public class ServiceFactory {

    /**
     * @return instance of {@link UserService}.
     */
    public static UserService getUserService() {
        return new UserServiceImpl();
    }

    /**
     * @return instance of {@link EmailService}.
     */
    public static EmailService getEmailService() {
        return new EmailServiceImpl();
    }
}
