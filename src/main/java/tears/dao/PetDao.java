package tears.dao;

import tears.model.Pet;

/**
 * @author Viktor Bilko on 21.08.2017.
 */
public interface PetDao {

    /**
     * @return pet.
     */
    Pet getPet();

    /**
     * @return list of pets.
     */
    Pet [] getPets();

    /**
     * @param id is pets id.
     * @return {@link Pet} entity by given id.
     */
    Pet getById (Long id);
}
