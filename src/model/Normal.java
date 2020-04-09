package model;

public class Normal extends Person {

    private final double discount = 0;

    public Normal(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public double getDiscount() {
        return discount;
    }

    public double getPrice(double price) {
        return price;
    }

    public void show() {
        System.out.println("Client: " +
                ", Id:" + getId() +
                "\nLastName: " + getLastName() +
                "\nFirstName: " + getFirstName() +
                "\nDiscount: " + "none" + "\n");
    }
}
