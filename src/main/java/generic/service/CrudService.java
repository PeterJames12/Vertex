package generic.service;

import generic.model.AbstractEntity;
import generic.model.Iphone;

import java.util.List;

/**
 * @author Igor Hnes on 9/14/17.
 */
public interface CrudService <T extends AbstractEntity> {

    void save(T type);

    void update(T type);

    void delete(T type);

    List<T> getAll();
}
