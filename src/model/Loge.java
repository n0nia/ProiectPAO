package model;

public class Loge extends Seat {

    public Loge() {
        price = 200;
        visibility = 3;
    }

    public Loge(int number) {
        super(number);
        price = 200;
        type = "LogeSeat";
        visibility = 3;
    }

    public Loge(Spectacle spectacle, Client client, int number) {
        super(spectacle, client, number);
        price = 200;
        type = "LogeSeat";
        price = ((Person) client).getPrice(price);
        visibility = 3;
    }

    public double getPrice() {
        return 150;
    }

    void setType() {
        type = "LogeSeat";
    }

    @Override
    public void show() {
        System.out.println(getType() + ": " +
                "\nNumber: " + getNumber() +
                "\nPrice: " + getPrice() +
                "\nVisibility: " + getVisibility() + "\n");
    }
}
