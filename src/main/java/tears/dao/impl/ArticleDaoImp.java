package tears.dao.impl;

import tears.dao.ArticleDao;
import tears.database.ArticleData;
import tears.model.Article;

public class ArticleDaoImp implements ArticleDao {
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
    public Article[] getAricles() {
        return ArticleData.getArticles();
    }




}
