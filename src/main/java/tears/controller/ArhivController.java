package tears.controller;


import tears.model.Arhiv;
import tears.service.ArhivService;
import tears.service.impl.ArhivServiceImpl;

/**
 * Created by qw-user on 17.08.2017.
 */
public class ArhivController {

    public static void main(String[] args) {
        ArhivService arhivService = new ArhivServiceImpl();
        arhivService.getTime();


    }
}
