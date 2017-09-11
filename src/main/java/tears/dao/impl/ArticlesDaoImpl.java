package tears.dao.impl;

import tears.dao.ArticlesDao;
import tears.model.Articles;

/**
 * Created by qw-user on 17.08.2017.
 */
public class ArticlesDaoImpl implements ArticlesDao{

    /**
     * {@inheritDoc}.
     */
    @Override
    public Articles getTitle() {
        return null;
    }

    /**
     * {@inheritDoc}.
     */
    @Override
    public Articles[] getDesk() {
        return new Articles[0];
    }

    /**
     * {@inheritDoc}.
     */
    @Override
    public Articles getById(Long id) {
        final Articles articles = new Articles();
        articles.getTitle();
        return articles;
    }
}
