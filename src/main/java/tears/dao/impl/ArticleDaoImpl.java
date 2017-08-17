package tears.dao.impl;


import tears.dao.ArticleDao;
import tears.database.ArticleData;
import tears.model.Articles;

public class ArticleDaoImpl implements ArticleDao {


    @Override
    public Articles getArticleByTitle() {
        return null;
    }

    @Override
    public Articles getTitle() {
        return null;
    }

    @Override
    public Articles[] getArticle() {
        return ArticleData.getArticles();
    }
}
