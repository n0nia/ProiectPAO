package Service;

import model.Client;

public class LoginService {

    public boolean login(Client client) {
        if(client.getUsername().equals("gigel")
                && client.getPassword().equals("12345")) {
            return true;
        }

        return false;
    }
}
