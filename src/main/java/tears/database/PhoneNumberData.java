package tears.database;
/*
Описание в классе PhoneNumber
 */

import tears.model.PhoneNumber;

public class PhoneNumberData {

    public static PhoneNumber[] phoneNumbers = new PhoneNumber[10];
    private static int countOfUsers=0;

    public static void addPhoneNumber(int number) {  // Добавляет номер телефона в базу данных.
        PhoneNumber phone=new PhoneNumber();
        countOfUsers++;
        for (int i = 0; i <phoneNumbers.length ; i++) {
            if(phoneNumbers[i]==null){
                phone.setPhone(number);
                phone.setUserId(i+1);
                phoneNumbers[i]=phone;
                System.out.println("number: "+number+" added to Data Base with Id: "+(i+1));
                break;
            }
        }if(countOfUsers>phoneNumbers.length){
            System.out.println("There are no place");
        }
    }

    public  static int getNumberById(int id){   // Получить номер телефона по UserId (Id)
        if (phoneNumbers[id - 1] != null) {
            System.out.println("Id "+id+" number: "+phoneNumbers[id - 1].getPhone());
            return phoneNumbers[id - 1].getPhone();
        } else {
            System.out.println("This Id doesn't exist.");
            return -1;
        }

    }

    public static PhoneNumber[] getAllData(){    // Получить всю базу данных телефонов.
        int count=0;
        for (int i = 0; i <phoneNumbers.length ; i++) {
            if(phoneNumbers[i]!=null){
                count++;
            }
        }
        PhoneNumber [] allData=new PhoneNumber[count];
        for (int i = 0; i <allData.length ; i++) {
            if(phoneNumbers[i]!=null){
                allData[i]=phoneNumbers[i];
                System.out.print("UserId: "+allData[i].getUserId()+", ");
                System.out.println("number: "+allData[i].getPhone());
            }
        }
       return allData;
    }
       public static void deleteNumberWithId(int id){   // Удаление номера телефона по Id.
           if(id<0||id>10){
               System.out.println("This Id doesn't exist.");
           } else if(phoneNumbers[id-1]!=null) {
               System.out.println("number: " + phoneNumbers[id - 1].getPhone() + " with Id: " + id + " was deleted");
               phoneNumbers[id - 1] = null;
           }else {
               System.out.println("There is nothing to delete.");
           }
        if(countOfUsers>phoneNumbers.length){
            countOfUsers=phoneNumbers.length-1;
        }
       }

}
