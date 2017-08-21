package tears.dao.impl;

import tears.dao.PetDao;
import tears.database.PetData;
import tears.model.Pet;

/**
 * @author Viktor Bilko on 21.08.2017.
 */
public class PetDaoImpl implements PetDao {

    /**
     * {@inheritDoc}.
     */
    @Override
    public Pet getPet() {
        return null;
    }
    /**
     * {@inheritDoc}.
     */
    @Override
    public Pet[] getPets() {
        return PetData.getPets();
    }

    /**
     * {@inheritDoc}.
     */
    @Override
    public Pet getById(Long id) {
        final Pet pet = new Pet();
        pet.setName("Jack");
        pet.setBreed("Dog");
        pet.setAge(12);
        return pet;
    }
}
