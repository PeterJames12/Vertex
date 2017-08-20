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

    PhoneNumberDao phoneNumberDao=new PhoneNumberDaoImpl();

    @Override
    public int getNumberById(int id) {         // Получить номер по Id
      return PhoneNumberData.getNumberById(id);
    }

    @Override
    public PhoneNumber[] getAllDataBaseOfPhones() {
        return PhoneNumberData.getAllData();
    }

    @Override
    public void addPhoneNumber(int number) {  // Этот и следующий метод реализовует класс PhoneNumberDaoImpl
        phoneNumberDao.addPhoneNumber(number);  //По сути эти методы можно вызвать, но ихняя реализация
                                               // все равно через PhoneNumberDaoImpl
    }

    @Override
    public void deleteNumber(int id) {
        phoneNumberDao.deleteNumber(id);
    }
}
