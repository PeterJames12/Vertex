package collections;

/**
 * @author Vladimir on 8/28/2017.
 */
public class Project {
    String name;
    String date;
    Integer intDate = 1;

    public Project(String name) {
        this.name = "Project " + name;
        date = intDate.toString() + ".28.2017";
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }
}
