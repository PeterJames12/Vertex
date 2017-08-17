package tears.dao.impl;

import tears.dao.ArticleDao;
import tears.model.Article;

/**
 * Implementation of {@link ArticleDao} interface.
 *
 * @author Igor Hnes on 8/17/17.
 */
public class ArticleDaoImpl implements ArticleDao {

    /**
     * {@inheritDoc}.
     */
    @Override
    public Article getArticle() {
        return null;
    }

    /**
     * {@inheritDoc}.
     */
    @Override
    public Article[] getArticles() {
        return new Article[0];
    }

    /**
     * {@inheritDoc}.
     */
    @Override
    public Article getArticleById(Long id) {
        return null;
    }
}
