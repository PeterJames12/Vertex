package tears.controller;
/*
Описание в классе PhoneNumber
 */

import tears.service.PhoneNumberService;
import tears.service.impl.PhoneNumberServiceImpl;

public class PhoneNumbersController {

    public static void main(String[] args) {
        PhoneNumberService phoneNumberService=new PhoneNumberServiceImpl();
        phoneNumberService.addPhoneNumber(123456);
        phoneNumberService.addPhoneNumber(178450);
        phoneNumberService.addPhoneNumber(983589);
        phoneNumberService.getAllDataBaseOfPhones();
        phoneNumberService.getNumberById(0);
    }

}
