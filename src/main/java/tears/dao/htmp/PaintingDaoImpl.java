package tears.dao.htmp;

import tears.dao.htmp.PaintingDao;
import tears.database.htmp.PaintingData;
import tears.model.htmp.Painting;

/**
 * @author Vladimir on 8/21/2017.
 */
public class PaintingDaoImpl implements PaintingDao{

    @Override
    public Painting[] getPaintings() {
        return PaintingData.getPaintings();
    }

    @Override
    public Painting[] getByArtist(String name) {
        return PaintingData.getPaintingByArtist();
    }

    @Override
    public Painting getByName(String name) {
        return PaintingData.getPaintingByName();
    }

}
