package tears.service.htmp;

import tears.model.htmp.Painting;

/**
 * @author Vladimir on 8/21/2017.
 */
public interface PaintingService {

    /**
     * @return list of paintings.
     */
    Painting[] getPaintings();

    /**
     * @param name is painting artist's name.
     * @return {@link Painting} entity by given artist's name.
     */
    Painting getByArtistsName(String name);

    /**
     * @param name is painting's name.
     * @return {@link Painting} entity by given name.
     */
    Painting getByName(String name);
}
