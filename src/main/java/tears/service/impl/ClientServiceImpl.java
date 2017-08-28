package tears.service.impl;

import tears.dao.ClientDao;
import tears.dao.impl.ClientDaoImpl;
import tears.service.EmailService;
import tears.service.impl.email.impl.EmailServiceImpl;
import tears.model.Client;
import tears.service.ClientService;

/**
 * @author Viktor Bilko on 21.08.2017.
 */
public class ClientServiceImpl implements ClientService {

    private ClientDao clientDao = new ClientDaoImpl();
    private EmailService clientEmail = new EmailServiceImpl();

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
