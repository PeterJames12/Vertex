package tears.dao.impl;

import tears.dao.ArticleDao;
import tears.database.ArticleData;
import tears.model.Article;

/**
 * @author Vladimir on 8/17/2017.
 */
public class ArticleDaoImpl implements ArticleDao{
    /**
     * {@inheritDoc}
     */
    @Override
    public Article getArticleByTitle(String title) {
        return ArticleData.getArticleByTitle(title);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Article[] getArticles() {
        return ArticleData.getArticles();
    }

}
