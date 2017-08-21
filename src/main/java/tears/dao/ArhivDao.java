package tears.dao;


import tears.model.Arhiv;

/**
 * Created by qw-user on 17.08.2017.
 */
public interface ArhivDao {

    /**
     * @return articles.
     */
    Arhiv getDocs();

    /**
     * @return list of articles.
     */
    Arhiv[] getTime();

    /**
     * @param id is arhiv's id.
     * @return {@link Arhiv} entity by given id.
     */
    Arhiv getById(Long id);

}