package tears.controller;

import tears.service.ClientService;
import tears.service.impl.ClientServiceImpl;

/**
 * @author Viktor Bilko on 21.08.2017.
 */
public class ClientController {

    public static void main(String[] args) {

        ClientService clientService = new ClientServiceImpl();

        clientService.sendMail(clientService.getClients());
    }
}
