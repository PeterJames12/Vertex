package tears.model;
/*
 * В этом классе массив объектов с номерами телефонов.
 *   Интерфейс и класс PhoneNumberDaо и PhoneNumberDaoImpl реализуют ввод данных в базу данных.
 *   Интерфейс и класс PhoneNumberService и PhoneNumberServiceImpl реализуют вывод данных из базы данных.
 *   По сути ввод можно производить и через PhoneNumberServiceImt, но он все равно будет ссылаться на
 *   PhoneNumberDaoImpl.
 *   В классе PhoneNumbersController можно попробовать запустить всю реализацию (Все работает)
 *   Я Articles убрал.(Тупо копирование было)
  */

public class PhoneNumber {

    private int userId;
   private int phone;
   private static PhoneNumber[]phones = new PhoneNumber[10];


    public int getPhone(int id) {   // Получить телефон по ID
        if(phones[id]!=null) {
            System.out.println("Phone by "+phones[id].userId+" Id: "+phones[id].phone);
            return phones[id].phone;
        } else{
            System.out.println("This Id doesn't exist!");
            return 0;
        }
    }

    public PhoneNumber[] getPhones() {    // Возвращает всю базу данных
        PhoneNumber[]array;
        int count=0;
        for (int i = 0; i <phones.length ; i++) {
            if(phones[i]!=null){
                count++;
            }
        } array=new PhoneNumber[count];
        for (int i = 0; i <array.length ; i++) {
            if(phones[i]!=null){
                array[i]=phones[i];
                System.out.print("Id:"+array[i].userId+", ");
                System.out.println("number: "+array[i].phone);
            }
        }
        return array;
    }

    public void setPhonesAndId(int phone) { // Добавить телефон и ID
        for (int i = 0; i <phones.length ; i++) {
          if(phones[i]==null){
              phones[i]=new PhoneNumber();
              this.phone=phone;
              phones[i].phone = phone;
              phones[i].userId=i+1;
              break;

          }
        }
    }
}
