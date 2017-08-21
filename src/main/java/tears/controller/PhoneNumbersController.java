package tears.controller;
/*
Описание в классе PhoneNumber
 */


import tears.service.PhoneNumberService;
import tears.service.impl.PhoneNumberServiceImpl;

public class PhoneNumbersController {

    public static void main(String[] args) {

        PhoneNumberService phoneNumberService = new PhoneNumberServiceImpl();
        phoneNumberService.addPhoneNumber(11111);
        phoneNumberService.addPhoneNumber(22222);
        phoneNumberService.getNumberById(2);
        phoneNumberService.getAllDataBaseOfPhones();
        phoneNumberService.deleteNumber(2);
        phoneNumberService.getAllDataBaseOfPhones();

    }

}
