package tears.dao.factory;

import tears.dao.ArticleDao;
import tears.dao.UserDao;
import tears.dao.impl.ArticleDaoImpl;
import tears.dao.impl.UserDaoImpl;
import tears.model.Article;

/**
 * @author Vladimir on 8/31/2017.
 */
public class DaoFactory {

    /**
     * @return instance of {@link ArticleDao}
     */
    public static UserDao getUserDao(){
        return new UserDaoImpl();
    }

    /**
     * @return instance of {@link ArticleDao}
     */
    public static ArticleDao getArticleDao(){
        return new ArticleDaoImpl();
    }
}
