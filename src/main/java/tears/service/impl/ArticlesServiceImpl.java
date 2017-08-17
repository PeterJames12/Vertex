package tears.service.impl;

import tears.dao.ArticlesDao;
import tears.model.Articles;
import tears.service.ArticlesService;

/**
 * Created by qw-user on 17.08.2017.
 */
public class ArticlesServiceImpl implements ArticlesService{

    private ArticlesDao articlesDao;

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
        return articlesDao.getById(id);
    }
}
