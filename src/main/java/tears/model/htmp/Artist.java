package tears.model.htmp;

/**
 * @author Vladimir on 8/21/2017.
 */
public class Artist {
    String name;
    int age;
    String[] paintingsList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String[] getPaintingsList() {
        return paintingsList;
    }

    public void setPaintingsList(String[] paintingsList) {
        this.paintingsList = paintingsList;
    }
}
