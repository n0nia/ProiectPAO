package model;

public class Standard extends Seat {

    public Standard() {
        price = 100;
        visibility = 1;
    }

    public Standard(int number) {
        super(number);
        price = 50;
        type = "StandardSeat";
        visibility = 1;
    }

    public Standard(Spectacle spectacle, Client client, int number) {
        super(spectacle, client, number);
        price = 50;
        type = "StandardSeat";
        price = ((Person) client).getPrice(price);
        visibility = 1;
    }

    void setType() {
        type = "StandardType";
    }

    @Override
    public void show() {
        System.out.println(getType() + ": " +
                "\nNumber: " + getNumber() +
                "\nPrice: " + getPrice() +
                "\nVisibility: " + getVisibility() + "\n");
    }
}
