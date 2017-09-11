package tears.dao.factory;

import tears.dao.ArticlesDao;
import tears.dao.UserDao;
import tears.dao.impl.ArticlesDaoImpl;
import tears.dao.impl.UserDaoImpl;
import tears.model.Articles;

/**
 * Created by qw-user on 31.08.2017.
 */
public class DaoFactory {

    public static UserDao getUserDao() {
        return new UserDaoImpl();
    }

    public static ArticlesDao getArticlesDao() {
        return new ArticlesDaoImpl();
    }
}
