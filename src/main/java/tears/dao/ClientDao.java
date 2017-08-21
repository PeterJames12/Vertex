package tears.dao;

import tears.model.Client;

/**
 * @author Viktor Bilko on 21.08.2017.
 */
public interface ClientDao {
    /**
     * @return client.
     */
    Client getClient();

    /**
     * @return list of clients.
     */
    Client [] getClients();

    /**
     * @param id is pet's id.
     * @return {@link Client} entity by given id.
     */
    Client getById(Long id);
}
