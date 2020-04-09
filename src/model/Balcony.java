package model;

public class Balcony extends Seat{

    public Balcony() {
        price = 150;
        visibility = 2;
    }

    public Balcony(int number) {
        super(number);
        type = "BalconySeat";
        price = 150;
        visibility = 2;
    }

    public Balcony(Spectacle spectacle, Client client, int number) {
        super(spectacle, client, number);
        type = "BalconySeat";
        price = 150;
        price = ((Person) client).getPrice(price);
        visibility = 2;
    }

    public double getPrice() {
        return price;
    }

    void setType() {
        type = "BalconySeat";
    }

    @Override
    public void show() {
        System.out.println(getType() + ": " +
                "\nNumber: " + getNumber() +
                "\nPrice: " + getPrice() +
                "\nVisibility: " + getVisibility() + "\n");
    }
}
