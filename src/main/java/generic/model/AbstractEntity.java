package generic.model;

import java.time.LocalDateTime;

/**
 * @author Igor Hnes on 9/14/17.
 */
public abstract class AbstractEntity {

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
