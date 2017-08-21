package tears.dao.impl;

import tears.dao.ClientDao;
import tears.database.ClientData;
import tears.model.Client;

/**
 * @author Viktor Bilko on 21.08.2017.
 */
public class ClientDaoImpl implements ClientDao {

    /**
     * {@inheritDoc}.
     */
    @Override
    public Client getClient() {
        return null;
    }

    /**
     * {@inheritDoc}.
     */
    @Override
    public Client[] getClients() {
        return ClientData.getClients();
    }

    /**
     * {@inheritDoc}.
     */
    @Override
    public Client getById(Long id) {
        final Client client = new Client();
        client.setName("Bob");
        client.setMail("bob@gmail.com");
        return client;
    }
}
