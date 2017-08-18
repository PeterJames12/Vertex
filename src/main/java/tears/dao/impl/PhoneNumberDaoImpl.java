package tears.dao.impl;
/*
Описание в классе PhoneNumber
 */

import tears.dao.PhoneNumberDao;
import tears.database.PhoneNumberData;
import tears.model.PhoneNumber;


public class PhoneNumberDaoImpl implements PhoneNumberDao {  // Класс который осуществляет ввод данных
                                                             // в базу данных (PhoneNumber)


    @Override
    public void addPhoneNumber(int number) {// По сути реализует только этот метод.
        PhoneNumberData.addPhoneNumber(number);
    }

    @Override                             // Этот и следующий метод реализуются в PhoneNumberService
    public int getNumberById(int id) {
        return 0;
    }


    @Override
    public PhoneNumber[] getAllDataBaseOfPhones() {
        return new PhoneNumber[0];
    }
}
