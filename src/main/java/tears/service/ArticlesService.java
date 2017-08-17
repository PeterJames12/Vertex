package tears.service;

import tears.model.Articles;

/**
 * Created by qw-user on 17.08.2017.
 */
public interface ArticlesService {

    /**
     * @return Articles.
     */
    Articles getTitle();

    /**
     * @return list of users.
     */
    Articles[] getDesk();



    /**
     * @param id is article's id.
     * @return {@link Articles} entity by given id.
     */
    Articles getById(Long id);
}
