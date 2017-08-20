package tears.dao.impl;
/*
Описание в классе PhoneNumber
 */

import tears.dao.PhoneNumberDao;
import tears.database.PhoneNumberData;
import tears.model.PhoneNumber;


public class PhoneNumberDaoImpl implements PhoneNumberDao {  // Класс который осуществляет ввод
                                                             // и удаление данных в/из базы данных.


    @Override
    public void addPhoneNumber(int number) {    //  Ввод номера телефона в базу данных
        PhoneNumberData.addPhoneNumber(number);
    }

    @Override
    public void deleteNumber(int id) {    // Удаления телефона по Id.
      PhoneNumberData.deleteNumberWithId(id);
    }

    @Override         // Этот и следующий метод полноценно реализуются в классе PhoneNumberService
    public int getNumberById(int id) {
        return 0;
    }

    @Override
    public PhoneNumber[] getAllDataBaseOfPhones() {
        return new PhoneNumber[0];
    }

}
