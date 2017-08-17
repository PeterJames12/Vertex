package tears.service;

import tears.model.Articles;
import tears.model.User;

/**
 * @author Viktor Bilko on 17.08.2017.
 */
public interface ArticlesService {

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
