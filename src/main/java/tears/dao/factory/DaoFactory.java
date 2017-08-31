package tears.dao.factory;

import tears.dao.ArticleDao;
import tears.dao.UserDao;
import tears.dao.impl.ArticleDaoImpl;
import tears.dao.impl.UserDaoImpl;

/**
 * @author Igor Hnes on 8/31/17.
 */
public class DaoFactory {

    /**
     * @return instance of {@link UserDao}.
     */
    public static UserDao getUserDao() {
        return new UserDaoImpl();
    }

    /**
     * @return instance of {@link ArticleDao}.
     */
    public static ArticleDao getArticleDao() {
        return new ArticleDaoImpl();
    }
}
