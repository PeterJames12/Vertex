package tears.service.impl;

import tears.dao.ArhivDao;
import tears.model.Arhiv;
import tears.service.ArhivService;


/**
 * Created by qw-user on 17.08.2017.
 */
public class ArhivServiceImpl implements ArhivService{

    private ArhivDao arhivDao;

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
        return new Arhiv[0];
    }

    /**
     * {@inheritDoc}.
     */
    @Override
    public Arhiv getById(Long id) {
        return null;
    }

}
