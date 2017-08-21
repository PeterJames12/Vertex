package tears.service;


import tears.model.Arhiv;

/**
 * Created by qw-user on 17.08.2017.
 */
public interface ArhivService {

    /**
     * @return Arhiv.
     */
    Arhiv getDocs();

    /**
     * @return time of saving.
     */
   Arhiv[] getTime();



    /**
     * @param id is arhiv's id.
     * @return {@link Arhiv} entity by given id.
     */
    Arhiv getById(Long id);
}
