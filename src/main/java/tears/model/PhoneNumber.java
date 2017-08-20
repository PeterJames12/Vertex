package tears.model;
/*
 *   В этом классе поля: номер телефона (phone)и Id (userId).
 *   Интерфейс и класс PhoneNumberDaо и PhoneNumberDaoImpl реализуют ввод данных и удаление данных
  *   в/из базы данных (PhoneNumberData).
 *   Интерфейс и класс PhoneNumberService и PhoneNumberServiceImpl реализуют "просмотр" данных из базы данных.
 *   По сути ввод и удаление можно производить и через PhoneNumberServiceImt, но он все равно будет ссылаться на
 *   PhoneNumberDaoImpl.
 *   В классе PhoneNumbersController можно попробовать запустить всю реализацию.
 *
  */

public class PhoneNumber {

    private int userId;
    private int phone;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }
}
