package repositories;

import model.*;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ClientRepository {

    private ArrayList<Client> clients;

    public ClientRepository() {
        clients = new ArrayList<>();
    }

    public void addClient(Client client) {
        clients.add(client);
    }

    public void removeClient(Client client) {
        clients.remove(client);
    }

    public ArrayList<Client> getClients() {
        return clients;
    }

    public Client getClientByUsername(String username) {
        for(Client client: clients) {
            if(client.getUsername().equals(username)) {
                return client;
            }
        }
        return null;
    }



    public Client getClientById(int id) {
        for(Client client: clients) {
            if(client.getId() == id) {
                return client;
            }
        }
        return null;
    }

    public ArrayList<Client> getAll() {
        return clients;
    }

    public ArrayList<Student> getAllStudents() {
        ArrayList<Student> students = new ArrayList<>();
        for(Client client : clients) {
            if (client instanceof Student) {
                Student student = (Student) client;
                students.add(student);
            }
        }
        return students;
    }

    public ArrayList<Child> getAllChildren() {
        ArrayList<Child> children = new ArrayList<>();
        for(Client client : clients) {
            if (client instanceof Child) {
                Child child = (Child) client;
               children.add(child);
            }
        }
        return children;
    }

    public ArrayList<Retired> getAllRetired() {
        ArrayList<Retired> retired = new ArrayList<>();
        for(Client client : clients) {
            if (client instanceof Retired) {
                Retired r = (Retired) client;
                retired.add(r);
            }
        }
        return retired;
    }

    public ArrayList<Client> getClientsWithDicount() {
        ArrayList<Client> clientsDiscount = new ArrayList<>();
        for (Client client : clients) {
            if ((client instanceof Child) || (client instanceof Student) || (client instanceof Retired)) {
                clientsDiscount.add(client);
            }
        }
        return clientsDiscount;
    }


    public ArrayList<Client> getClientsWithoutDiscount() {
        ArrayList<Client> clientsWithout = new ArrayList<>();
        for(Client client : clients) {
            if (!(client instanceof Child) && !(client instanceof Student) && !(client instanceof Retired)) {
                clientsWithout.add(client);
            }
        }
        return clientsWithout;
    }

    public int getNumberOfClientsWithDiscount() {
        int count = 0;
        for(Client client : clients) {
            if ((client instanceof Child) || (client instanceof Student) || (client instanceof Retired)) {
                count++;
            }
        }
        return count;
    }

    public int getNumberOfClientsWithoutDiscount() {
        int count = 0;
        for(Client client : clients) {
            if (!(client instanceof Child) && !(client instanceof Student) && !(client instanceof Retired)) {
                count++;
            }
        }
        return count;
    }

    public void show(Client client) {
        client.show();
    }
}
