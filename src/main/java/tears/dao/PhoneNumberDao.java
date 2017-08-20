package tears.dao;
/*
Описание в классе PhoneNumber
 */

import tears.model.PhoneNumber;

public interface PhoneNumberDao {

    public void addPhoneNumber(int number); // Добавить номер телефона в базу.
    public void deleteNumber(int id); // Удалить номер телефона с базы данных.
    public int getNumberById (int id);     // Получить номер по идентефикатору ( полная реализация в PhoneNumberServiceImpl)
    public PhoneNumber[] getAllDataBaseOfPhones(); // Получить всю базу данных(номер, идентефекатор)(полная реализация в PhoneNumberServiceImpl)

}
