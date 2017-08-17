package tears.dao;

import tears.model.Articles;

/**
 * @author Viktor Bilko on 17.08.2017.
 */
public interface ArticlesDao {

    /**
     * @return Articles.
     */
    Articles getArticles();

    /**
     * @return list of articles
     */
    Articles [] getArticless();

    /**
     * @param id is user's id.
     * @return {@link Articles} entity by given id.
     */

    Articles getById(Long id);
}
