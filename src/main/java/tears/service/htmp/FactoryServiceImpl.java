package tears.service.htmp;

import tears.model.htmp.Factory;
import tears.service.htmp.FactoryService;

/**
 * @author Vladimir on 8/21/2017.
 */
public class FactoryServiceImpl implements FactoryService {

    @Override
    public Factory[] getFactories() {
        return new Factory[0];
    }

    @Override
    public Factory getByName(String name) {
        return null;
    }
}
