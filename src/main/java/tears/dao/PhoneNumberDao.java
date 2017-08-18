package tears.dao;
/*
Описание в классе PhoneNumber
 */

import tears.model.PhoneNumber;

public interface PhoneNumberDao {

    public void addPhoneNumber(int number); // Добавить номер телефона в базу.
    public int getNumberById (int id);     // Получить номер по идентефикатору
    public PhoneNumber[] getAllDataBaseOfPhones(); // Получить всю базу данных(номер, идентефекатор)
}
