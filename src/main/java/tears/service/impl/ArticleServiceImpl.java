package tears.service.impl;

import tears.dao.ArticleDao;
import tears.model.Article;
import tears.service.ArticleService;

public class ArticleServiceImpl implements ArticleService{

    private ArticleDao articleDao;

    /**
     * {@inheritDoc}
     */
    @Override
    public Article getArticle() {
        return null;
    }
    /**
     * {@inheritDoc}
     */
    @Override
    public Article[] getArticles() {
        return articleDao.getArticles();
    }
    /**
     * {@inheritDoc}
     */
    @Override
    public Article getByTitlePart(String partTitle) {
        return articleDao.getByTitlePart(partTitle);
    }
}
