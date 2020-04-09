package model;

public class Seat {

    //private int row;
    private int number;
    String type;
    double price;
    int visibility;
    private Spectacle spectacle;
    private Client client;

    Seat() {
        //row = 0;
        number = 0;
        type = "";
        price = 0;
        visibility = 0;
    }

    Seat(int number) {
        //this.row = row;
        this.number = number;
    }

    public Seat(Spectacle spectacle, Client client, int number) {
        this.client = client;
        this.spectacle = spectacle;
        this.number = number;
    }

    /*public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }*/

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getVisibility() {
        return visibility;
    }

    public void setVisibility(int visibility) {
        this.visibility = visibility;
    }

    public Spectacle getSpectacle() {
        return spectacle;
    }

    public void setSpectacle(Spectacle spectacle) {
        this.spectacle = spectacle;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void show() {
        System.out.println(getType() + ": " +
                "\nNumber: " + getNumber() +
                "\nPrice: " + getPrice() +
                "\nVisibility: " + getVisibility());
    }
}
