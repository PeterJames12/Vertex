package tears.service.impl;

import tears.dao.PetDao;
import tears.model.Pet;
import tears.service.PetService;

/**
 * @author Viktor Bilko on 21.08.2017.
 */
public class PetServiceImpl implements PetService {

    private PetDao petDao;

    /**
     * {@inheritDoc}.
     */
    @Override
    public Pet getPet() {
        return petDao.getPet();
    }

    /**
     * {@inheritDoc}.
     */
    @Override
    public Pet[] getPets() {
        return petDao.getPets();
    }

    /**
     * {@inheritDoc}.
     */
    @Override
    public Pet getById(Long id) {
        return petDao.getById(id);
    }
}
