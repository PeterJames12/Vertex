package tears.controller;

import tears.service.PetService;
import tears.service.impl.PetServiceImpl;

/**
 * @author Viktor Bilko on 21.08.2017.
 */
public class PetController {

    public static void main(String[] args) {

        PetService petService = new PetServiceImpl();
        petService.getPets();
    }
}
