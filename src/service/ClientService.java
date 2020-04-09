package service;

import model.*;
import repositories.ClientRepository;
import repositories.SeatRepository;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ClientService {

    private ClientRepository clientRepository = new ClientRepository();
    private static ClientService instance = new ClientService();

    private ClientService() { }

    public static ClientService getInstance() {
        return instance;
    }

    public void addClient(Client client) {
        clientRepository.addClient(client);
    }

    public void showClient(Client client) {
       clientRepository.show(client);
    }

    public Client getClientByUsername(String username) {
        return clientRepository.getClientByUsername(username);
    }

    public Client getClientById(int id) {
        return clientRepository.getClientById(id);
    }

    public ArrayList<Client> getAllClients() {
        return clientRepository.getAll();
    }

    public ArrayList<Child> getAllChildren() {
        return clientRepository.getAllChildren();
    }

    public ArrayList<Student> getAllStudents() {
        return clientRepository.getAllStudents();
    }

    public ArrayList<Retired> getAllRetired() {
        return clientRepository.getAllRetired();
    }

    public ArrayList<Client> getAllClientsWithDiscount() {
        return clientRepository.getClientsWithDicount();
    }

    public ArrayList<Client> getAllClientsWithoutDiscount() {
        return clientRepository.getClientsWithoutDiscount();
    }

   /*public void removeClientByUsername(String username) {
        ReservationService reservationService = ReservationService.getInstance();
        SeatService seatService = SeatService.getInstance();
       Client client = clientRepository.getClientByUsername(username);
        if(client == null) {
            System.out.println("Client doesn't exist.");
        }
        reservationService.cancelReservationById(reservation.getId());
            seatService.removeSeatById();
        }
        clientRepository.removeClient(client);
    }*/

    public void removeClientById(int id) {
        ReservationService reservationService = ReservationService.getInstance();
        Client client = clientRepository.getClientById(id);
        if(client == null) {
            System.out.println("Client doesn't exist.");
        }
        reservationService.cancelReservationById(id);
        clientRepository.removeClient(client);
        /*SeatRepository seatRepository = SeatRepository.getInstance();
        seatService.removeSeatByClientId(id)*/
    }
}
