package tears.dao.impl;

import tears.dao.ArticleDao;
import tears.database.ArticleData;
import tears.model.Article;

public class ArticleDaoImpl implements ArticleDao{

    ArticleData articleData = new ArticleData();
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
        return articleData.getArticles(1);
    }
    /**
     * {@inheritDoc}.
     */
    @Override
    public Article getByTitlePart(String partTitle) {

        Article article = new Article();
        article.setTitle("Java learn");
        if(article.getTitle().toLowerCase().contains(partTitle)) {
            return article;
        } else {
            return null;
        }
    }
}
