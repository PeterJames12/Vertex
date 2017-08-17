package tears.service.impl;

import tears.dao.ArticlesDao;
import tears.model.Articles;
import tears.service.ArticlesService;

/**
 * @author Viktor Bilko on 17.08.2017.
 */
public class ArticlesServiceImpl implements ArticlesService {

    private ArticlesDao articlesDao;

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
        return articlesDao.getArticless();
    }

    /**
     * {@inheritDoc}.
     */
    @Override
    public Articles getById(Long id) {
        return articlesDao.getById(id);
    }
}
