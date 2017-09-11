package arrays;

/**
 * @author Vladimir on 8/21/2017.
 */
public class ArrObjMain {
    public static void main(String[] args) {
        User[] usersArr = new User[5];
        Article[] articleArr = new Article [5];
        for (int i = 0; i < usersArr.length; i++) {
            usersArr[i] = new User(("Name " + Integer.toString(i)) + " - ", (25 + (i*2)));
            System.out.println("User: " + usersArr[i].getName() + usersArr[i].getAge());

            articleArr[i] = new Article(("Title " + Integer.toString(i* (i + 1))));
            System.out.println("Article: " + articleArr[i].getTitle());
        }

    }
}
