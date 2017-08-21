package tears.database;

import tears.model.Client;

/**
 * @author Viktor Bilko on 21.08.2017.
 */
public class ClientData {

    public static Client[] getClients(){
        final Client client = new Client();
        client.setName("Bob");
        client.setMail("bob@gmail.com");

        Client[] clients = new Client[1];
        clients[0] = client;

        return clients;
    }
}
