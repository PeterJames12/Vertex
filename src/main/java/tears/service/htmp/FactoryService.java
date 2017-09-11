package tears.service.htmp;

import tears.model.htmp.Factory;

/**
 * @author Vladimir on 8/21/2017.
 */
public interface FactoryService {

    /**
     * @return list of factories.
     */
    Factory[] getFactories();

    /**
     * @param name is factory's name.
     * @return {@link Factory} entity by given name.
     */
    Factory getByName(String name);
}
