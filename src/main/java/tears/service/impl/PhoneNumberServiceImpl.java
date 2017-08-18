package tears.service.impl;
/*
Описание в классе PhoneNumber
 */

import tears.dao.PhoneNumberDao;
import tears.dao.impl.PhoneNumberDaoImpl;
import tears.database.PhoneNumberData;
import tears.model.PhoneNumber;
import tears.service.PhoneNumberService;

public class PhoneNumberServiceImpl implements PhoneNumberService {


    @Override
    public void addPhoneNumber(int number) {  // Этот метод реализовует PhoneNumberDaoImpl
        PhoneNumberDao phoneNumberDao=new PhoneNumberDaoImpl();
        phoneNumberDao.addPhoneNumber(number);  //По сути этот метод можно вызвать, но его реализация
                                                // все равно через PhoneNumberDaoImpl
    }

    @Override
    public int getNumberById(int id) {
      return PhoneNumberData.getNumberById(id);
    }

    @Override
    public PhoneNumber[] getAllDataBaseOfPhones() {
        return PhoneNumberData.getAllData();
    }
}
