package model;

public class Reservation {

    private int id;
    private static int idnr = 0;
    private int numberOfSeats;
    private Client client;
    private Spectacle spectacle;

    public Reservation(Spectacle spactacle, Client client, int numberOfSeats) {
        this.spectacle = spectacle;
        this.client = client;
        this.numberOfSeats = numberOfSeats;
        this.id = ++idnr;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getIdnr() {
        return idnr;
    }

    public static void setIdnr(int idnr) {
        Reservation.idnr = idnr;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Spectacle getSpectacle() {
        return spectacle;
    }

    public void setSpectacle(Spectacle spectacle) {
        this.spectacle = spectacle;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "id=" + id +
                ", numberOfSeats=" + numberOfSeats +
                ", client=" + client +
                ", spectacle=" + spectacle +
                '}';
    }
}
