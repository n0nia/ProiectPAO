package main;

import model.*;
import service.ClientService;
import service.SeatService;
import service.SpectacleService;

import java.util.ArrayList;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        
        ClientService clientService = ClientService.getInstance();

        //CLIENTS
        clientService.addClient(new Normal("Oliver", "A"));
        clientService.addClient(new Normal("Olivia", "B"));
        clientService.addClient(new Normal("Declan", "C"));
        clientService.addClient(new Student("Luna", "D"));
        clientService.addClient(new Student("Everett", "E"));
        clientService.addClient(new Student("Isla", "F"));
        clientService.addClient(new Child("Felix", "F"));
        clientService.addClient(new Retired("Ava", "G"));


        ArrayList<Client> clients = clientService.getAllClients();
        System.out.println("CLIENTS:");
        for(Client client : clients) {
            clientService.showClient(client);
        }

        System.out.println();
        System.out.println("CHILDREN:");
        ArrayList<Child> children = clientService.getAllChildren();
        for(Child child : children) {
            clientService.showClient(child);
        }

        System.out.println();
        System.out.println("STUDENTS:");
        ArrayList<Student> students = clientService.getAllStudents();
        for(Student student : students) {
            clientService.showClient(student);
        }

        System.out.println();
        System.out.println("RETIRED:");
        ArrayList<Retired> retired = clientService.getAllRetired();
        for(Retired r : retired) {
            clientService.showClient(r);
        }

        System.out.println();
        System.out.println("CLIENTS WITH ID 1:");
        if(clientService.getClientById(1) != null) {
            clientService.getClientById(1).show();
        } else {
            System.out.println("CLIENT DOESN'T EXIST.");
        }

        System.out.println("CLIENT WITH ID 3:");
        if(clientService.getClientById(3) != null) {
            clientService.getClientById(3).show();
        } else {
            System.out.println("CLIENT DOESN'T EXIST.");
        }

        System.out.println();
        System.out.println("CLIENTS WITH DISCOUNT: ");
        ArrayList<Client> clientsWithDiscount = clientService.getAllClientsWithDiscount();
        for(Client client : clientsWithDiscount) {
            clientService.showClient(client);
        }

        System.out.println();
        System.out.println("CLIENTS WITH DISCOUNT: ");
        ArrayList<Client> clientsWithoutDiscount = clientService.getAllClientsWithoutDiscount();
        for(Client client : clientsWithoutDiscount) {
            clientService.showClient(client);
        }


        ArrayList<Seat> availableSeats = new ArrayList<Seat>(5);
        availableSeats.add(0, new Standard(50));
       // availableSeats.add(1, new StandardSeat(20, 2));
        availableSeats.add(1, new Balcony(30));
        //availableSeats.add(3, new BalconySeat(6, 2));
        availableSeats.add(2, new Loge(10));

        //SPECTACLES
        SpectacleService spectacleService = SpectacleService.getInstance();

        Date date = new Date(2020, 03, 23);
        spectacleService.addSpectacle(new Spectacle("Hamlet", "drama", 120, date, 500, 100.0));
        date = new Date(2020, 03, 23);
        spectacleService.addSpectacle(new Spectacle("Lion", "comedy", 100,  date, 400, 70.0));

        System.out.println();
        ArrayList<Spectacle> spectacles = spectacleService.getAllSpectacles();
        System.out.println("SPECTACLES:");
        for(Spectacle spectacle : spectacles) {
            spectacleService.showSpectacle(spectacle);
        }

        //SEATS
        SeatService seatService = SeatService.getInstance();
        seatService.addSeat(new Balcony(spectacleService.getSpectacleById(1), clientService.getClientById(4), 2));
        seatService.addSeat(new Loge(spectacleService.getSpectacleById(1), clientService.getClientById(1), 3));
        seatService.addSeat(new Standard(spectacleService.getSpectacleById(1), clientService.getClientById(3), 2));
        seatService.addSeat(new Standard(spectacleService.getSpectacleById(1), clientService.getClientById(6), 4));

        ArrayList<Seat> seats = seatService.getAllSeats();
        System.out.println();
        System.out.println("BOUGHT SEATS:");
        for(Seat seat : seats) {
            seatService.showSeat(seat);
        }

        System.out.println();
        System.out.println("TOTAL: ");
        System.out.println(seatService.getTotal(1));


        System.out.println();
        System.out.println("SPECTACLE AFTER PRICE CHANGE:");
        spectacleService.changePriceByIdSpectacle(1, 75);
        for(Spectacle spectacle: spectacles) {
            spectacleService.showSpectacle(spectacle);
        }

        System.out.println();
        System.out.println("CLIENTS AFTER REMOVING CLIENT WITH ID 1: ");
        clientService.removeClientById(1);
        for(Client client : clients) {
            clientService.showClient(client);
        }
    }
}
