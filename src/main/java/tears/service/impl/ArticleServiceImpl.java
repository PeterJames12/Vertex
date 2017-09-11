package tears.service.impl;

import tears.dao.ArticleDao;
import tears.model.Article;
import tears.service.ArticleService;

/**
 * @author Vladimir on 8/17/2017.
 */
public class ArticleServiceImpl implements ArticleService {

    private ArticleDao articleDao;

    /**
     * {@inheritDoc}.
     */
    @Override
    public Article getArticleByTitle(String title) {
        return articleDao.getArticleByTitle(title);
    }

    /**
     * {@inheritDoc}.
     */
    @Override
    public Article[] getArticles() {
        return articleDao.getArticles();
    }


}
