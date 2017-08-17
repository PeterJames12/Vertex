package tears.service.impl;

import tears.dao.ArticleDao;
import tears.model.Article;
import tears.service.ArticleService;

/**
 * Implementation of {@link ArticleService} interface.
 *
 * @author Igor Hnes on 8/17/17.
 */
public class ArticleServiceImpl implements ArticleService {

    private ArticleDao articleDao;

    /**
     * {@inheritDoc}.
     */
    @Override
    public Article getArticle() {
        return articleDao.getArticle();
    }

    /**
     * {@inheritDoc}.
     */
    @Override
    public Article[] getArticles() {
        return articleDao.getArticles();
    }

    /**
     * {@inheritDoc}.
     */
    @Override
    public Article getArticleById(Long id) {
        return articleDao.getArticleById(id);
    }
}
