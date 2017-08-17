package tears.dao.impl;

import tears.dao.ArticlesDao;
import tears.database.ArticlesData;
import tears.model.Articles;

/**
 * @author Viktor Bilko on 17.08.2017.
 */
public class ArticlesDaoImpl implements ArticlesDao {

    /**
     * {@inheritDoc}.
     */
    @Override
    public Articles getArticles() {
        return null;
    }

    /**
     * {@inheritDoc}.
     */
    @Override
    public Articles[] getArticless() {
        return ArticlesData.getArticles();
    }

    /**
     * {@inheritDoc}.
     */
    @Override
    public Articles getById(Long id) {
        final Articles articles = new Articles();
        articles.setTitle("Big title");
        return articles;
    }
}
