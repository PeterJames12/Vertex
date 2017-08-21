package tears.database;

import tears.model.Pet;

/**
 * @author Viktor Bilko on 21.08.2017.
 */
public class PetData {

    public static Pet[] getPets(){
        final Pet pet = new Pet();
        pet.setName("Jack");
        pet.setBreed("Dog");
        pet.setAge(12);

        Pet[]pets = new Pet[1];
        pets[0] = pet;

        return pets;
    }
}
