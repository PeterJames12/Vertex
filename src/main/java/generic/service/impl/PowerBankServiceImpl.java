package generic.service.impl;

import generic.model.PowerBank;
import generic.service.CrudService;
import generic.service.PowerBankService;

import java.util.List;

/**
 * @author Igor Hnes on 9/14/17.
 */
public class PowerBankServiceImpl implements PowerBankService, CrudService<PowerBank> {

    @Override
    public String getColor() {
        return null;
    }

    @Override
    public void save(PowerBank type) {

    }

    @Override
    public void update(PowerBank type) {

    }

    @Override
    public void delete(PowerBank type) {

    }

    @Override
    public List<PowerBank> getAll() {
        return null;
    }
}
