package tears.database;


import tears.model.Arhiv;


/**
 * Created by qw-user on 17.08.2017.
 */
public class ArhivData {

    public static Arhiv[] getTime() {
        final Arhiv arhiv = new Arhiv();
        arhiv.setTime(10);

        Arhiv[] arhiv1 = new Arhiv[10];
        arhiv1[0] = arhiv;
        return arhiv1;

    }
}
