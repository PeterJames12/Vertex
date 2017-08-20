package tears.service;
/*
Описание в классе PhoneNumber
 */

import tears.model.PhoneNumber;

public interface PhoneNumberService {

    public int getNumberById (int id);     // Получить номер по идентефикатору.
    public PhoneNumber[] getAllDataBaseOfPhones(); // Получить всю базу данных(номер, идентефекатор).
    public void addPhoneNumber(int number); // Добавить номер телефона в базу.
    public void deleteNumber(int id); // Удалить номер телефона с базы данных.

}
