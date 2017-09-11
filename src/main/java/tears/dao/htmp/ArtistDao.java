package tears.dao.htmp;

import tears.model.htmp.Artist;

/**
 * @author Vladimir on 8/21/2017.
 */
public interface ArtistDao{
    /**
     * @param name is artist's name.
     * @return {@link Artist} entity by given name.
     */
    Artist getArtistByName(String name);

    /**
     * @return list of artists.
     */
    Artist[] getArtist();
}
