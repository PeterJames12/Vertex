package tears.service.impl;

import tears.dao.ClientDao;
import tears.dao.impl.ClientDaoImpl;
import tears.email.ClientEmail;
import tears.email.impl.ClientEmailImpl;
import tears.model.Client;
import tears.service.ClientService;

/**
 * @author Viktor Bilko on 21.08.2017.
 */
public class ClientServiceImpl implements ClientService {

    private ClientDao clientDao = new ClientDaoImpl();
    private ClientEmail clientEmail = new ClientEmailImpl();

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
        return clientDao.getClients();
    }

    /**
     * {@inheritDoc}.
     */
    @Override
    public Client getById(Long id) {
        return clientDao.getById(id);
    }

    /**
     * {@inheritDoc}.
     */
    @Override
    public void sendMail(Client[] clients) {
        for (Client client : clients) {
            clientEmail.sendMessage("Sale",client.getMail());
        }
    }
}
