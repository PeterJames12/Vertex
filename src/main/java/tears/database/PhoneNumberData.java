package tears.database;
/*
Описание в классе PhoneNumber
 */

import tears.model.PhoneNumber;

public class PhoneNumberData {

  static PhoneNumber phone=new PhoneNumber();

    public static void addPhoneNumber(int number) {
        phone.setPhonesAndId(number);
    }

    public  static int getNumberById(int id){
       return phone.getPhone(id);
    }

    public static PhoneNumber[] getAllData(){
       return phone.getPhones();
    }

}
