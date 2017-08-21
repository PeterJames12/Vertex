package tears.dao.impl;


import tears.dao.ArhivDao;
import tears.database.ArhivData;
import tears.model.Arhiv;


/**
 * Created by qw-user on 17.08.2017.
 */
public class ArhivDaoImpl implements ArhivDao{


    /**
     * {@inheritDoc}.
     */
    @Override
    public Arhiv getDocs() {
        return null;
    }

    /**
     * {@inheritDoc}.
     */
    @Override
    public Arhiv[] getTime() {
        return ArhivData.getTime();
    }

    /**
     * {@inheritDoc}.
     */
    @Override
    public Arhiv getById(Long id) {
        return null;
    }
}
