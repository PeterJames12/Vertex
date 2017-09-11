package tears.dao.htmp;

import tears.dao.htmp.ArtistDao;
import tears.model.htmp.Artist;

/**
 * @author Vladimir on 8/21/2017.
 */
public class ArtistDaoImpl implements ArtistDao{

    @Override
    public Artist getArtistByName(String name) {
        return null;
    }

    @Override
    public Artist[] getArtist() {
        return new Artist[0];
    }
}
