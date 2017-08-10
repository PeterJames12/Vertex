package vertex;

/**
 * @author Igor Hnes on 8/10/17.
 */
public class Service {

    private Database database = new Database();

    public String[] getAll() {
        return database.getMas();
    }

    public String getFirst() {
        return database.getMas()[0];
    }
    public String getFlamaster() {
        return database.getMas()[0];
    }




    public String getLast() {
        return database.getMas()[database.getMas().length - 1];
    }

    public String getLamaster() {
        return database.getMas()[database.getMas().length - 1];
    }

    public String[] getByName(String name) {
        String[] mas = database.getMas();
        int count = 0;

        for (String elem : mas) {
            if (elem.startsWith(name)) {
                count++;
            }
        }

        String[] byNames = new String[count];
        count = 0;
        for (String elem : mas) {
            if (elem.startsWith(name)) {
                byNames[count] = elem;
                count++;
            }
        }
        return byNames;
    }

    public String getBySurname(String surname) {
        String[] mas = database.getMas();

        for (String elem : mas) {
            if (elem.endsWith(surname)) {
                return elem;
            }
        }
        return "Unknown";
    }
}
